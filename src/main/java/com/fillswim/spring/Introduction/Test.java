package com.fillswim.spring.Introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Конфигурация приложения с помощью Xml конфигурация и аннотаций
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("appContext.xml")) {

            Cat cat = context.getBean("cat", Cat.class);
            cat.say();
            System.out.println();

            Person person = context.getBean("person", Person.class);
            person.callPet();
        }
    }
}
