package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {
        
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Product p1 = ctx.getBean("tumbler",Product.class);
        
        p1.setId(1);
        p1.setName("Tumbler");
        System.out.println(p1);

        Product p2 = ctx.getBean("bucket",Product.class);
        p2.setId(2);
        p2.setName("Bucket");        
        System.out.println(p2);
    }  
}