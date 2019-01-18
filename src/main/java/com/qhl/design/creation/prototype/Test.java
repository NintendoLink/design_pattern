/**
 * @Author: LinK
 * @Date: 2019/1/16 17:23
 */

package com.qhl.design.creation.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("origin mail content");

//        不用原型模式
//        for(int i= 0;i<10;i++){
//            mail.setName("姓名"+i);
//            mail.setAddress("地址"+ i);
//            mail.setContent("content" + i);
//
//            MailUtil.sendMail(mail);
//        }
//        MailUtil.saveOriginMailRecord(mail);


        for(int i= 0;i<10;i++){
            Mail tmpMail = (Mail) mail.clone();
            tmpMail.setName("姓名"+i);
            tmpMail.setAddress("地址"+ i);
            tmpMail.setContent("content" + i);

            MailUtil.sendMail(tmpMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
