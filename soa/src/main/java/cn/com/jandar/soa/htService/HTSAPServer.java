package cn.com.jandar.soa.htService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
@WebService(targetNamespace="http://jandar.com.cn/soa")
public interface HTSAPServer {
	
	 @WebMethod  
	 @WebResult(name="loginResult")  
	 public String login(@WebParam(name="name")String name); 
	 
	 @WebMethod  
	 @WebResult(name="nWriteVehicleInfoResult")
	 public String nWriteVehicleInfo(String vehicleInfo);
	 
	 @WebMethod  
	 @WebResult(name="queryViolateSpeedResult")
	 public String queryViolateSpeed(String queryViolateSpeed34);
	 
}
