package com.example.main;

import com.example.api.HelloService;
import com.example.impl.HelloServiceImpl;

public class Main {
    public static void main(String[] args) {
        HelloService service = new HelloServiceImpl();
        System.out.println(service.hello(args[0]));
    }
}
