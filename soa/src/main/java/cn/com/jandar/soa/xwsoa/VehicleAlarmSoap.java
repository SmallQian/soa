package cn.com.jandar.soa.xwsoa;

import javax.jws.WebMethod;

import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * cn.com.jandar.soa.xwsoa.VehicleAlarmSoap
 * @author 钱琦玮 <br/>
 * Create at 2016年5月25日 下午2:23:09
 */
@WebService(targetNamespace="http://jandar.com.cn/soa")
public interface VehicleAlarmSoap {
	@WebMethod  
    @WebResult(name="insertVehicleAlarmResult")
	public int insertVehicleAlarm(VehicleAlarmIn vehicleAlarmIn,String csdm1,String csdm2);
}
