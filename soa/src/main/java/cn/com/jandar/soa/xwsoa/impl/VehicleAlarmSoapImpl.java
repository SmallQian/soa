package cn.com.jandar.soa.xwsoa.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import cn.com.jandar.soa.xwsoa.VehicleAlarmIn;
import cn.com.jandar.soa.xwsoa.VehicleAlarmSoap;

/**
 * cn.com.jandar.soa.xwsoa.impl.VehicleAlarmSoapImpl
 * @author 钱琦玮 <br/>
 * Create at 2016年5月25日 下午2:25:00
 */
@WebService(endpointInterface="cn.com.jandar.soa.xwsoa.VehicleAlarmSoap", targetNamespace="http://jandar.com.cn/soa")  
@Service
public class VehicleAlarmSoapImpl implements VehicleAlarmSoap {

	@Override
	public int insertVehicleAlarm(VehicleAlarmIn vehicleAlarmIn, String csdm1,
			String csdm2) {
		System.out.println(" int:"+vehicleAlarmIn.getAlarmTypeMinor()+"  string"+vehicleAlarmIn.getChannelName());
		System.out.println(" csdm1:"+csdm1+"  csdm2"+csdm2);
		return 1;
	}

}
