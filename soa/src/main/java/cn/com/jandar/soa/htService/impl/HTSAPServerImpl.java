package cn.com.jandar.soa.htService.impl;

import javax.jws.WebService;



import org.springframework.stereotype.Service;

import cn.com.jandar.soa.htService.HTSAPServer;
import cn.com.jandar.soa.htService.NWriteVehicleInfo;

@WebService(endpointInterface="cn.com.jandar.soa.htService.HTSAPServer", targetNamespace="http://jandar.com.cn/soa") 
@Service  
public class HTSAPServerImpl implements HTSAPServer{

	@Override
	public String login(String strDeviceId, String strDeviceKey) {
		String str = "00001";
		return str;
	}

	@Override
	public String writeVehicleInfo(NWriteVehicleInfo vehicleInfo) {
		
		String str = "0000";
		return str;
	}

	@Override
	public String queryViolateSpeed(String sid, String lpszDeviceId, String lpszDiretId, String lpszCarType) {

		String str = null;
		if(lpszCarType.equals("0")){
			str = "1";
			
		}else{
			str = "0";
		}
		
		return str;
	}

	
	
}
