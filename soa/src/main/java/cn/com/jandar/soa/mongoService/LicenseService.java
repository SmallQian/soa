package cn.com.jandar.soa.mongoService;

import javax.jws.WebMethod;


import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace="http://jandar.com.cn/soa")
public interface LicenseService {
	
	 @WebMethod  
	 @WebResult(name="insertVehicleResult")  
	 public boolean insertVehicle(String args[]);
	 @WebMethod  
	 @WebResult(name="putLicenseIntoQueueResult") 
	 public void putLicenseIntoQueue(String license, String passDateTime);

}
