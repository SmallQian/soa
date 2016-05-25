package cn.com.jandar.soa.htService.impl;

import javax.jws.WebService;
import javax.xml.ws.handler.MessageContext;

import org.springframework.stereotype.Service;

import cn.com.jandar.soa.htService.HTSAPServer;

@WebService(endpointInterface="cn.com.jandar.soa.htService.HTSAPServer", targetNamespace="http://jandar.com.cn/soa") 
@Service  
public class HTSAPServerImpl implements HTSAPServer{
	
	public HTSAPServerImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public HTSAPServerImpl(String url){
		
	}

	@Override
	public String login(String name) {
		
		return null;
	}

	public String nWriteVehicleInfo(String vehicleInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String queryViolateSpeed(String queryViolateSpeed34) {
		// TODO Auto-generated method stub
		return null;
	}

}
