package cn.com.jandar.soa.hello;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * cn.com.jandar.soa.hello.HelloService
 * @author 钱琦玮 <br/>
 * Create at 2016年5月25日 下午12:08:17
 */
@WebService(targetNamespace="http://jandar.com.cn/soa")  
public interface HelloService {  
    @WebMethod  
    @WebResult(name="sayHelloResult")  
    public String sayHello(@WebParam(name="name")String name);  
}  