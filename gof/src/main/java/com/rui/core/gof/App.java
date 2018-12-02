package com.rui.core.gof;

import com.rui.core.gof.singdemo.SingDemo;
import com.rui.core.gof.singdemo.SingDemoB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SingDemo singDemo = SingDemo.getIntance();
        SingDemo singDemo2 = SingDemo.getIntance();
        System.out.println(singDemo);
        System.out.println(singDemo2);
        
        SingDemoB singDemoB = SingDemoB.getIntance();
        SingDemoB singDemoB2 = SingDemoB.getIntance();
        System.out.println(singDemoB);
        System.out.println(singDemoB2);
        
        
    }
}
