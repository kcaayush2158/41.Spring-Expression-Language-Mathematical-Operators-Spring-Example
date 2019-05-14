package com.application.main;

import com.application.model.Perimeter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        Perimeter perimeter  = (Perimeter) context.getBean("perimeter");
        System.out.println(perimeter.getPerimeter());
        context.close();
    }
}
