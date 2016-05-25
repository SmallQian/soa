package cn.com.jandar.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.springframework.stereotype.Component;
import org.w3c.dom.Node;

/**
 * cn.com.jandar.interceptor.LicenseInInterceptor
 * @author 钱琦玮 <br/>
 * Create at 2016年5月25日 下午12:35:57
 */
@Component  
public class LicenseInInterceptor extends AbstractSoapInterceptor {  
    public LicenseInInterceptor(){  
        super(Phase.INVOKE);  
    }  
      
    @Override  
    public void handleMessage(SoapMessage message) throws Fault {  
        List<Header> headers = message.getHeaders();  
        Object obj = null;  
        for(Header header : headers){  
            if(header.getName().getLocalPart().equals("licenseInfo")){  
                obj = header.getObject();  
                if(obj instanceof Node){  
                    System.out.println("Receive the licenseInfo=[" + ((Node)obj).getTextContent() + "]");  
                }  
            }  
        }  
    }  
}  