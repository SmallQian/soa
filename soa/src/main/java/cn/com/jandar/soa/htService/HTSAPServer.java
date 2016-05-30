package cn.com.jandar.soa.htService;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
@WebService(targetNamespace="http://jandar.com.cn/soa")
public interface HTSAPServer {
	
	 @WebMethod  
	 @WebResult(name="loginResult")  
	 public String login(String strDeviceId,
				String strDeviceKey); 
	 
	 @WebMethod  
	 @WebResult(name="nWriteVehicleInfoResult")
	 public String writeVehicleInfo(NWriteVehicleInfo vehicleInfo);
	 
	 @WebMethod  
	 @WebResult(name="queryViolateSpeedResult")
	 public String queryViolateSpeed(String sid,
				String lpszDeviceId, String lpszDiretId, String lpszCarType);
	 
}
