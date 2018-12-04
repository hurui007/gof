package com.rui.core.gof.singdemo;

import java.io.ObjectStreamException;
import java.io.Serializable;

import javax.management.RuntimeErrorException;

/**
 * @title 懒汉式单例(测试反射和反序列化漏洞)
 * @author hurui
 * @date 2018-12-05
 */
public class SingtonSeralizableDemo implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 类初始化之后，不马上创建这个实例，可以延时加载，要用的时候才加载实例
	 */
	private static SingtonSeralizableDemo singDemoB;
	//私有化的构造器，不是public
	private SingtonSeralizableDemo() {
		//为了防止反射调用这个私有方法，我们可以处理一下，
		if(singDemoB != null) {
			//多次调用这个方法就会报错，阻止反射调用
			//throw new RuntimeException();
		}
	}
	
	/**
	 * @title 这个方式是获取实例的唯一方法，每次获取的都是同一个实例
	 * 这个方法调用效率不高，
	 * 只有我们要使用这个实例的时候，才创建
	 * @author huri
	 * @date 2018-12-02
	 */
	public static synchronized SingtonSeralizableDemo getIntance() {
		if(singDemoB == null) {
			singDemoB = new SingtonSeralizableDemo();
		}
		return singDemoB;
	}
	
	//这个方法可以在对象被反序列化的时候，如果对应已经存在，
	//就返回这个已经创建的对象，不用再去重复创建
	private Object readResolve() throws ObjectStreamException {
		return singDemoB;
	}

}
