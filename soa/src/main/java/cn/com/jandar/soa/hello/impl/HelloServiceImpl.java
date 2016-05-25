package cn.com.jandar.soa.hello.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import cn.com.jandar.soa.hello.HelloService;

/**
 * cn.com.jandar.soa.hello.impl.HelloServiceImpl
 * @author 钱琦玮 <br/>
 * Create at 2016年5月25日 下午12:34:25
 */
@WebService(endpointInterface="cn.com.jandar.soa.hello.HelloService", targetNamespace="http://jandar.com.cn/soa")  
@Service  
public class HelloServiceImpl implements HelloService {  
    @Override  
    public String sayHello(String name) {  
        System.out.println("Receive the name=[" + name + "]");  
        if(null==name){  
            return "Hello,World";  
        }else{  
            return "Hello," + name;  
        }  
    }  
}  