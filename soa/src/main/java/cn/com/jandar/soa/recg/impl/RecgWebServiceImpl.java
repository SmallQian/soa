package cn.com.jandar.soa.recg.impl;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import cn.com.jandar.soa.recg.RecgWebService;

/**
 * cn.com.jandar.soa.recg.impl.RecgWebServiceImpl
 * @author 钱琦玮 <br/>
 * Create at 2016年5月26日 下午11:26:24
 */
@WebService(endpointInterface="cn.com.jandar.soa.recg.RecgWebService", targetNamespace="http://jandar.com.cn/soa") 
@Service 
public class RecgWebServiceImpl implements RecgWebService {

	
	public String objectOut(String xmlDoc) {
		System.out.println(xmlDoc);
		String result = "<msg>识别成功</msg><clpp>浙A121213</clpp><csys>(.*?)</csys><hphm>(.*?)</hphm><ppdm>(.*?)</ppdm><cllx>(.*?)</cllx>";
		return result;
	}

}
