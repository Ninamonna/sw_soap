package com.example.sw_soap;

import javax.jws.WebService;

@WebService(
        serviceName = "serviceHello",
        portName = "portHello",
        targetNamespace = "http://service.ws.sample/",
        endpointInterface = "com.example.sw_soap.HelloService")
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
