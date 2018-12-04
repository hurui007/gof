package com.rui.core.gof.singdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试反射，反序列化破解单例模式
 * @author ruihu
 * @date 2018-12-04
 */
public class ClientSeralizable {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		SingtonSeralizableDemo sington = SingtonSeralizableDemo.getIntance();
		SingtonSeralizableDemo sington2 = SingtonSeralizableDemo.getIntance();
		System.out.println(sington);
		System.out.println(sington2);
		
		//开始使用反射,使用反射直接调用私有构造器
//		Class<SingtonSeralizableDemo> clazz = (Class<SingtonSeralizableDemo>) Class.forName("com.rui.core.gof.singdemo.SingtonSeralizableDemo");
//		Constructor<SingtonSeralizableDemo> c = clazz.getDeclaredConstructor(null);
//		//跳过私有的权限检查，这样就可以访问私有属性
//		c.setAccessible(true);
//		//这样new出来的对象，就是一个权限的对象，这样就破坏了单例模式
//		SingtonSeralizableDemo sin = c.newInstance();
//		SingtonSeralizableDemo sin2 = c.newInstance();
//		
//		System.out.println(sin);
//		System.out.println(sin2);
		
		//开始使用反序列化的方式构造对象
		//上面的操作是把对象序列化到文件
		FileOutputStream fos = new FileOutputStream("/Users/ruihu/Desktop/test/goftest.txt");
		//通过这个流将对象写入到txt文件
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sington);
		oos.close();
		oos.close();
		fos.close();
		
		//下面开始反序列化,把文件中的对象反序列化到内存
		FileInputStream fis = new FileInputStream("/Users/ruihu/Desktop/test/goftest.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//这个通过反序列方式生成的对象，是一个新的对象
		SingtonSeralizableDemo singc = (SingtonSeralizableDemo) ois.readObject();
		System.out.println(singc);
				
		
		
		
	}
	

}
