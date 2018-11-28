package com.multimodule.redisserver.utils;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: passUtils
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/22 14:35
 * @Version: 1.0
 */
public class passUtils {

    /**
     *
     * @Title: logForFile
     * @Description: 生成日志,手动;日志位置: /server3.0/logs
     * @param className
     * @param message void
     * @author fangk
     * @throws ClassNotFoundException
     * @date 2018年6月26日下午5:36:53
     */
    public static void logForFile(String className, String path, String menthName,String message) {
        Logger logger=null;
        try {
            logger = Logger.getLogger(Class.forName(className));
        } catch (ClassNotFoundException e1) {
            System.out.println("日志记录异常");
        }
        SimpleLayout layout = new SimpleLayout();
        DailyRollingFileAppender appender=null;
        SimpleDateFormat sdf1=null;
        SimpleDateFormat sdf=null;
        Date date =null;
        try {
            sdf1=new SimpleDateFormat("yyyy-MM-dd");
            sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date = new Date();
            appender= new DailyRollingFileAppender(layout, path+"/log/"+sdf1.format(date)+"日志", "yyyy-MM-dd");
        } catch (IOException e) {
            logger.info(e.getMessage());		}
        logger.addAppender(appender);//添加输出端
        logger.setLevel((Level)Level.DEBUG);//覆盖配置文件中的级别
        logger.info(sdf.format(date)+"时, "+menthName+"运行日志 : "+message);
        logger.removeAllAppenders();
    }

    /**
     *
     * @Title: gainListOfLength
     * @Description: 获取一个该定长度的随机数字
     * @param size 集合长度
     * @param length 字符串的长度
     * @return List<String>
     * @author fangk
     * @date 2018年7月16日下午3:05:23
     */
    public static List<String> gainListOfLength(int size, int length) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        sb.append("1");
        sb2.append("1");
        for(int x=0;x<length;x++) {
            sb.append("0");
            if(x<=length-2){
                sb2.append("0");
            }
        }
        List<String> arr=new ArrayList<>();
        while(true) {
            int i=(int)(Math.random()*Integer.parseInt(sb.toString()));
            if(i/Integer.parseInt(sb.toString())<1 && i/Integer.parseInt(sb2.toString())>=1) {
                arr.add(i+"");
            }
            if(arr.size()==size) {
                break;
            }
        }
        return arr;
    }

    /**
     *
     * @Title: gainMd5
     * @Description: 將字符串加密
     * @param s
     * @return String
     * @author fangk
     * @date 2018年7月16日下午2:58:38
     */
    public static String gainMd5(String s) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] data;
            data = md5.digest(s.getBytes("utf-8"));// 转换为MD5码
            StringBuffer buffer = new StringBuffer();
            for (byte b : data) {
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }
            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("出错了!");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("加密或者加盐错误!");
        }
    }

    public static void main(String [] arg0){
//        List<String> list=gainListOfLength(34,6);
//        for(int x=0;x<list.size();x++){
//            System.out.println("密码加密前："+list.get(x)+"; 加密后："+gainMd5(list.get(x)));
//        }
        System.out.println("密码加密前：admin"+" 加密后："+gainMd5("admin"));
    }

}
