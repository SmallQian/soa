package cn.com.jandar.soa.mongoService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace="http://jandar.com.cn/soa")
public interface LicenseService {
	
	 @WebMethod  
	 @WebResult(name="insertVehicleResult")  
	 public boolean insertVehicle(@WebParam(name="args")String[] args);

}
