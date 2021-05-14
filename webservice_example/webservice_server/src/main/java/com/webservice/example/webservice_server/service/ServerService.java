package com.webservice.example.webservice_server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2020/9/24 3:55 下午
 */
@WebService(name = "ServerService",targetNamespace = "http://service.webservice_server.example.webservice.com")
public interface ServerService {

    @WebMethod
    String  emrService(@WebParam String data);
}
