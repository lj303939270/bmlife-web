package com.bmlife.base.utils.security;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @描述: AES工具 
 */
public class AesUtil
{
    
    /** 密钥算法 */
    public static final String KEY_ALGORITHM    = "AES";
    
    /** 密钥位数 */
    public static final int    KEY_LENGTH       = 128;
    
    /** 加解密算法 / 工作模式 / 填充方式 */
    public static final String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    
    /**
     * 生成密钥
     */
    public static byte[] initKey() throws Exception
    {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ALGORITHM);
        keyGenerator.init(KEY_LENGTH);
        
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey.getEncoded();
    }
    
    /**
     * 转换密钥
     */
    private static Key toKey(byte[] keyArr) throws Exception
    {
        Key secretKey = new SecretKeySpec(keyArr, KEY_ALGORITHM);
        return secretKey;
    }
    
    /**
     * 加密
     */
    public static byte[] encrypt(byte[] data, byte[] keyArr) throws Exception
    {
        Key key = toKey(keyArr);
        
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        
        return cipher.doFinal(data);
    }
    
    /**
     * 解密
     */
    public static byte[] decrypt(byte[] data, byte[] keyArr) throws Exception
    {
        Key key = toKey(keyArr);
        
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        
        return cipher.doFinal(data);
    }
    
    private AesUtil()
    {
    }
    
}
