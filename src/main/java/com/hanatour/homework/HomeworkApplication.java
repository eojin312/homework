package com.hanatour.homework;

import com.hanatour.homework.speak.Hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class HomeworkApplication {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("Hello", Hello.class, Hello::new);
        context.refresh();

        Hello hello = (Hello) context.getBean("Hello");
        hello.sayHello();

        context.close();
    }
}
