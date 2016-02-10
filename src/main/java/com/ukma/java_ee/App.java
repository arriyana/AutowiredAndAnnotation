package com.ukma.java_ee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    private static Robot robot;

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        robot = (Robot) context.getBean("robot");
        robot.go();
        robot.goTo(null);
        robot.talk();
        robot.remember("Something is important to remember..");
    }
}
