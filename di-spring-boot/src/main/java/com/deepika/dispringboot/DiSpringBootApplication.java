package com.deepika.dispringboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(DiSpringBootApplication.class, args); //creates container
//        Dev obj =  new Dev(); //created a obj in the jvm not in the ioc container
//        Dev obj = null; // nullpointer Exception
          Dev obj = context.getBean(Dev.class);
          obj.build();
    }
}
