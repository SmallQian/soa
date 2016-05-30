package cn.com.jandar.soa.mongoService.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import cn.com.jandar.soa.mongoService.LicenseService;
@WebService(endpointInterface="cn.com.jandar.soa.mongoService.LicenseService", targetNamespace="http://jandar.com.cn/soa") 
@Service 
public class LicenseServiceImpl implements LicenseService{

	@SuppressWarnings("unused")
	public boolean insertVehicle(String[] args) {
		if(args.length == 0){
			return false;
		}else{
			System.out.println("mongo recevice success.");
			return true;
		}
		
		
	}

	@Override
	public void putLicenseIntoQueue(String license, String passDateTime) {
		System.out.println("license :" + license + ",passDateTime: " + passDateTime);
		
	}

}
