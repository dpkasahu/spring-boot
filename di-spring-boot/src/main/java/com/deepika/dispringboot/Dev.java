package com.deepika.dispringboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component //create an object of dev in container
public class Dev {
//    Laptop lap = new Laptop(); //simple method , tight coupling
    @Autowired //field injection {DI} Automatically injects the required bean into a dependent class without explicit configuration.
    @Qualifier("desktop") //if u want to decide here which one have to compile u can write either desktop or laptop
    private Computer comp; //By type here Computer is a class by this name it will connect through Autowired annotatio.
//    constructor injection
//    public Dev(Laptop lap){
//        this.lap=lap;
//    }
    //setter injection
//    @Autowired
//    public void setLaptop(Laptop lap){
//        this.lap=lap;
//    }
    public void build(){
      comp.compile();
      System.out.println("Laptop compiled under dev");

    }
}

//@Qualifier: Specifies which bean to inject when multiple beans of the same type exist.
//ApplicationContext: The central Spring container that manages bean creation, configuration, and dependency injection.
//Dependency Injection (DI): A design pattern where an object’s dependencies are provided by an external system rather than the object itself.