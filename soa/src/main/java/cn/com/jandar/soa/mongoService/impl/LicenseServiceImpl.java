package cn.com.jandar.soa.mongoService.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import cn.com.jandar.soa.mongoService.LicenseService;
@WebService(endpointInterface="cn.com.jandar.soa.mongoService.LicenseService", targetNamespace="http://jandar.com.cn/soa") 
@Service 
public class LicenseServiceImpl implements LicenseService{

	public boolean insertVehicle(String[] args) {
		if(args.length == 0 && args != null){
			System.out.println(args);
			return true;
		}else{
			return false;
		}
		
	}

}
