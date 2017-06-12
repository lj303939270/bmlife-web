package com.bmlife.base.utils;

import org.apache.log4j.Logger;

public class ConvertHelper
{
    private static Logger logger = Logger.getLogger(ConvertHelper.class);
    
    /**
     * 把字串转化为整数,若转化失败，则返回0
     * @param str 字串
     * @return
     */
    public static int strToInt(String str)
    {
        if ( str == null )
        {
            return 0;
        }
        
        try
        {
            return Integer.parseInt(str);
        }
        catch (Exception ex)
        {
            //logger.debug(str+"转换成int类型失败，请检查数据来源", ex);
            return 0;
        }
        
    }
    
    /**
     * 把字串转化为长整型数,若转化失败，则返回0
     * @param str 要转化为长整型的字串
     * @return
     */
    public static long strToLong(String str)
    {
        if ( str == null )
        {
            return 0;
        }
        
        try
        {
            return Long.parseLong(str);
        }
        catch (Exception ex)
        {
            // logger.debug(str + "转换成long类型失败，请检查数据来源", ex);
            return 0;
        }
        
    }
    
    /**
     * 把字串转化为Float型数据,若转化失败，则返回0
     * @param str 要转化为Float的字串
     * @return
     */
    public static float strToFloat(String str)
    {
        if ( str == null )
        {
            return 0;
        }
        try
        {
            return Float.parseFloat(str);
        }
        catch (Exception ex)
        {
            //logger.debug(str + "转换成float类型失败，请检查数据来源", ex);
            return 0;
        }
       
    }
    
    /**
     * 把字串转化为Double型数据，若转化失败，则返回0
     * @param str 要转化为Double的字串
     * @return
     */
    public static double strToDouble(String str)
    {
        if ( str == null )
        {
            return 0;
        }
        try
        {
            return Double.parseDouble(str);
        }
        catch (Exception ex)
        {
            //logger.debug(str + "转换成double类型失败，请检查数据来源", ex);
            return 0;
        }
        
    }
    
    /**
     * 描述：字符转为一个元素的Object数组
     * @param str
     * @return
     */
    public static Object[] strToArry(String str)
    {
        if ( str == null )
        {
            return null;
        }
        else
        {
            return new Object[] { str };
        }
    }
    
    /**
     * 对于一个字符串数组，把字符串数组中的每一个字串转换为整数。
     * 返回一个转换后的整型数组，对于每一个字串若转换失败，则对
     * 应的整型值就为0
     * @param strArray 要转化的数组
     * @return
     */
    public static int[] strArrayToIntArray(String[] strArray)
    {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++)
        {
            intArray[i] = strToInt(strArray[i]);
        }
        return intArray;
    }
    
    /**
     * 描述：数组转换为字符串
     * @param arg0 数组
     * @return
     */
    public static String arrToString(Object[] arg0)
    {
        if ( arg0 == null )
        {
            return "";
        }
        return arrToString(arg0, ",");
    }
    
    /**
     * 描述：数据转换为字符串
     * @param arg0 数组
     * @param arg1 取数组个数
     * @return
     */
    public static String arrToString(Object[] arg0, int arg1)
    {
        if ( arg0 == null )
        {
            return "";
        }
        return arrToString(arg0, ",", arg1);
    }
    
    /**
     * 描述：数据转换为字符串
     * @param arg0 数组
     * @param arg1 间隔符号
     * @return
     */
    public static String arrToString(Object[] arg0, String arg1)
    {
        return arrToString(arg0, arg1, 0);
    }
    
    /**
     * 描述：数据转换为字符串
     * @param arg0 数组
     * @param arg1 间隔符号
     * @param arg2 取数组个数
     * @return
     */
    public static String arrToString(Object[] arg0, String arg1, int arg2)
    {
        if ( arg0 == null || arg0.length == 0 )
        {
            return "";
        }
        else
        {
            StringBuffer sb = new StringBuffer();
            int length = arg0.length;
            if ( arg2 != 0 )
            {
                length = arg2;
            }
            for (int i = 0; i < length; i++)
            {
                if ( arg1 == null )
                    arg1 = "";
                sb.append(arg0[i]).append(arg1);
            }
            sb.delete(sb.lastIndexOf(arg1), sb.length());
            return sb.toString();
        }
    }
    /**
     * 描述：生成字符串
     * @param arg0 字符串元素
     * @param arg1 生成个数
     * @return
     */
    public static String createStr(String arg0, int arg1)
    {
        if ( arg0 == null )
        {
            return "";
        }
        return createStr(arg0, arg1, ",");
    }
    
    /**
     * 描述：生成字符串
     * @param arg0 字符串元素
     * @param arg1 生成个数
     * @param arg2 间隔符号
     * @return
     */
    public static String createStr(String arg0, int arg1, String arg2)
    {
        if ( arg0 == null )
        {
            return "";
        }
        else
        {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arg1; i++)
            {
                if ( arg2 == null )
                    arg2 = "";
                sb.append(arg0).append(arg2);
            }
            if ( sb.length() > 0 )
            {
                sb.delete(sb.lastIndexOf(arg2), sb.length());
            }
            
            return sb.toString();
        }
    }
}
