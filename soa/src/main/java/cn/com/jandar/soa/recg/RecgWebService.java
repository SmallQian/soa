package cn.com.jandar.soa.recg;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * cn.com.jandar.soa.recg.RecgWebService
 * @author 钱琦玮 <br/>
 * Create at 2016年5月26日 下午11:24:38
 */
@WebService(targetNamespace="http://jandar.com.cn/soa")
public interface RecgWebService {

	@WebMethod  
	@WebResult(name="ObjectOutResult") 
	public String objectOut(String xmlDoc);
}
