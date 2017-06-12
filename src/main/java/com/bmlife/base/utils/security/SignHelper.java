package com.bmlife.base.utils.security;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.apache.log4j.Logger;

/**
 * 
 * @描述: 对参数签名工具 
 * @创建日期: 2016年9月30日 下午3:05:36
 */
public class SignHelper
{
    
    private static Logger logger = Logger.getLogger(SignHelper.class);
    
    /**
     * 对参数进行签名
     */
    public static String signByMd5(Map<String, String> params, String signKey) throws Exception
    {
        if ( params == null )
        {
            throw new Exception("签名参数不能为空");
        }
        
        Map<String, String> cloneMap = new HashMap<String, String>();
        for (Iterator<String> it = params.keySet().iterator(); it.hasNext();)
        {
            String key = it.next();
            String value = params.get(key);
            
            if ( value != null && !"".equalsIgnoreCase(value) && !"null".equalsIgnoreCase(value) )
                cloneMap.put(key, value);
        }
        cloneMap.put("signKey", signKey);
        String signStr = concatSignString(cloneMap);
        return SecurityHelper.md5(signStr);
    }
    
    /**
     * 对参数进行验签
     * @throws Exception 
     */
    public static boolean verifyByMd5(Map<String, String> params, String signKey, String requestSign) throws Exception
    {
        String signed = signByMd5(params, signKey);
        return signed.equalsIgnoreCase(requestSign);
    }
    
    /**
     * 将参数拼接成签名字符串
     */
    private static String concatSignString(Map<String, String> params)
    {
        if ( params == null )
        {
            throw new RuntimeException("签名参数不能为空");
        }
        TreeSet<String> orderSet = new TreeSet<String>(new Comparator<String>()
        {
            public int compare(String str1, String str2)
            {
                return str1.compareToIgnoreCase(str2);
            }
        });
        
        orderSet.addAll(params.keySet());
        
        Iterator<String> it = orderSet.iterator();
        if ( !it.hasNext() )
            return "";
        
        StringBuilder signStringBuilder = new StringBuilder();
        while (true)
        {
            String key = it.next();
            String value = params.get(key);
            signStringBuilder.append(key);
            signStringBuilder.append("=");
            signStringBuilder.append(value);
            
            if ( !it.hasNext() )
                return signStringBuilder.toString();
            
            signStringBuilder.append("&");
        }
    }
    
    private SignHelper()
    {
        
    }
    
}
