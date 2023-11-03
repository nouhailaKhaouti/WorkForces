package com.example.workforcesn;

import com.example.workforcesn.Services.EmployService;
import com.example.workforcesn.Services.Interfaces.EmployI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.getBean("employService", EmployService.class);
    }

}
