package com.deepika.dispringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //Marks a class as a Spring-managed bean to be auto-detected during component scanning.
//@Primary //Indicates that a bean should be preferred when multiple candidates are available for autowiring.
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Laptop compiled");
    }
}
