package com.bmlife.base.utils.security;

import java.security.MessageDigest;

import org.apache.log4j.Logger;

import com.bmlife.base.utils.Base64Helper;
import com.bmlife.base.utils.StringHelper;

/**
 * 描述:  加解密封装类
 */
public class SecurityHelper
{
    
    /**
     * 常量 8
     */
    private final static int    FINAL_EIGHT      = 8;
    
    /**
     * 常量 24
     */
    private final static int    FINAL_TWENTYFOUR = 24;
    
    /**
     * SecurityHelper 日志
     */
    private static Logger       logger           = Logger.getLogger(SecurityHelper.class);
    
    /**
     * 密钥
     */
    private static String       key              = "B49A86FA425D439dB510A234A3E25A3E";
    
    private static final String DEFAULT_ENCODE   = "utf-8";
    
    /**
     * 根据MD5摘要算法，生成相应的32位的MD5摘要字串
     *
     * @param inbuf 字串参数
     * @return
     */
    public static String getMD5of32Str(String inbuf)
    {
        MD5 md5 = new MD5();
        return md5.getMD5ofStr(inbuf);
    }
    
    /**
     * 根据MD5摘要算法，生成相应的16位的MD5摘要字串(取32位中间的8-24位)
     *
     * @param inbuf 字串参数
     * @return
     */
    public static String getMD5of16Str(String inbuf)
    {
        MD5 md5 = new MD5();
        String str = md5.getMD5ofStr(inbuf);
        if ( !StringHelper.isEmpty(str) )
        {
            str = str.substring(FINAL_EIGHT, FINAL_TWENTYFOUR);
        }
        return str;
    }
    
    /**
     * 
     * 描述：根据SHA-512 摘要算法，生成摘要字串
     * 作者：李建
     * 时间：Aug 17, 2013 11:12:13 AM
     * @param inbuf
     * @return
     */
    public static String getSHA512Str(String inbuf)
    {
        SHA512 sha512 = new SHA512();
        return sha512.getSHA512ofStr(inbuf);
    }
    
    /**
     * 采用DES算法对字串进行加密
     *
     * @param originStr 需要加密的字串
     * @return
     */
    public static String encode(String originStr)
    {
        return encode(originStr, key);
    }
    
    /**
     * 采用DES算法对字串进行加密
     *
     * @param originStr 需要加密的字串
     * @param key       加密的密匙
     * @return
     */
    public static String encode(String originStr, String key)
    {
        try
        {
            KDES kDes = new KDES();
            kDes.setKey(key);
            return kDes.encode(originStr);
        }
        catch (Exception ex)
        {
            logger.error("加密出错", ex);
        }
        return "";
    }
    
    /**
     * 采用DES算法对字串进行解密
     *
     * @param originStr 需要解密的字串
     * @return
     */
    public static String decode(String originStr)
    {
        return decode(originStr, key);
    }
    
    /**
     * 采用DES算法对字串进行解密
     *
     * @param originStr 需要解密的字串
     * @param key       解密的密匙
     * @return
     */
    public static String decode(String originStr, String key)
    {
        try
        {
            KDES kDes = new KDES();
            kDes.setKey(key);
            return kDes.decode(originStr, key);
        }
        catch (Exception ex)
        {
            logger.error("解密出错", ex);
        }
        return "";
    }
    
    /**
     * 
     * @描述: 使用AES加密 
     * @创建日期: 2016年9月30日 下午2:54:00
     * @param plainText
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptByAes(String plainText, String key) throws Exception
    {
        byte[] b = AesUtil.encrypt(plainText.getBytes(DEFAULT_ENCODE), key.getBytes(DEFAULT_ENCODE));
        if ( b != null )
        {
            return Base64Helper.encode(b);
        }
        else
        {
            return "";
        }
    }
    
    /**
     * 
     * @描述: 使用DES加密 
     * @创建日期: 2016年9月30日 下午2:55:10
     * @param plainText
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptByDes(String plainText, String key) throws Exception
    {
        DES des = new DES(key);
        return des.encrypt(plainText, DEFAULT_ENCODE);
    }
    
    /*
     * 使用AES解密
     */
    public static String decryptByAes(String cipherText, String key) throws Exception
    {
        byte[] b = Base64Helper.decode(cipherText);
        String result = "";
        if ( b != null )
        {
            result = new String(AesUtil.decrypt(b, key.getBytes(DEFAULT_ENCODE)), DEFAULT_ENCODE);
        }
        return result;
    }
    
    /**
     * 使用DES解密
     */
    public static String decryptByDes(String cipherText, String key) throws Exception
    {
        DES des = new DES(key);
        return des.decrypt(cipherText, DEFAULT_ENCODE);
        
    }
    
    /*
     * 做BASE64编码
     */
    public static String base64(String text) throws Exception
    {
        return Base64Helper.encode(text);
    }
    
    /*
     * BASE64解码
     */
    public static String debase64(String base64) throws Exception
    {
        return Base64Helper.decodeToString(base64);
    }
    
    /*
     * MD5 摘要
     */
    public static String md5(String plainText) throws Exception
    {
        String resultString = "";
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        resultString = byteArrayToHex(md.digest(plainText.getBytes(DEFAULT_ENCODE)));
        
        return resultString;
    }
    
    /**
     * 描述：返回十六进制字符串
     */
    public static String byteArrayToHex(byte[] arr)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; ++i)
        {
            sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }
    
    /*
     * 将16进制值的字符串转换为byte数组
     */
    public static byte[] hexToByteArray(String hex)
    {
        try
        {
            byte[] arrB = hex.getBytes(DEFAULT_ENCODE);
            int iLen = arrB.length;
            
            byte[] arrOut = new byte[iLen / 2];
            for (int i = 0; i < iLen; i = i + 2)
            {
                String strTmp = new String(arrB, i, 2);
                arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
            }
            return arrOut;
        }
        catch (Exception ex)
        {
            return new byte[0];
        }
    }
}
