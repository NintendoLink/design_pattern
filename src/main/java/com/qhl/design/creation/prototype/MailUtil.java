/**
 * @Author: LinK
 * @Date: 2019/1/16 17:19
 */

package com.qhl.design.creation.prototype;

public class MailUtil {
    public static void sendMail(Mail mail){
        System.out.println("向"+mail.getName()+",地址为"+mail.getAddress()+ "发送内容为"+ mail.getContent()+"的邮件");
    }
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储origin邮件内容："+mail.getContent());
    }
}
