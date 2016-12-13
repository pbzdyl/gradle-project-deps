package com.example.test;

import com.example.api.HelloService;
import com.example.impl.HelloServiceImpl;

public class HelloServiceTest {
    public void test() {
        // Compilation in Intellij fails unless
        // module-b/build.gradle adds project(':module-a').sourceSets.api.output as dependency
        HelloService service = new HelloServiceImpl();

        assert "Hello world".equals(service.hello("world"));
    }
}
