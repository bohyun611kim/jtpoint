package com.javatpoint;

import com.javatpoint.si.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // == 질문 : 답변  ==
        Question q1 = context.getBean("q1", Question.class);
        q1.displayInfo();



    }
}