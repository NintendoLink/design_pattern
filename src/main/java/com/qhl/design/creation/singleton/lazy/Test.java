/**
 * @Author: LinK
 * @Date: 2019/1/16 15:01
 */

package com.qhl.design.creation.singleton.lazy;


import com.qhl.design.creation.singleton.hungry.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(lazySingleton);
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");


//        静态内部类实现
//        StaticInnerClassSingleton staticInnerClassSingleton =  StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton staticInnerClassSingleton1 = StaticInnerClassSingleton.getInstance();
//
//        System.out.println(staticInnerClassSingleton == staticInnerClassSingleton1);

//        序列化破坏单利模式，解决方式，加上ReadResolve方法
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton_file")));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        反射破坏单利模式，对于饿汉式和基于延时加载内部类的单利模式，只需在私有构造函数做判断，对于双重检查的懒汉式单利，则无法解决

//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);



//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


    }
}
