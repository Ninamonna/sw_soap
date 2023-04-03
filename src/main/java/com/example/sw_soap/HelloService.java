package com.example.sw_soap;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "hello", targetNamespace = "http://service.ws.sample/")
public interface HelloService {
    @WebMethod(action = "urn:sayHello")
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            className = "com.example.sw_soap.RequestSayHello",
            localName = "requestSayHello",
            targetNamespace = "http://service.ws.sample/")
    @ResponseWrapper(
            className = "com.example.sw_soap.responseSayHello",
            localName = "responseSayHello",
            targetNamespace = "http://service.ws.sample/")
    String sayHello(@WebParam(name = "name", targetNamespace = "") String name);
}
