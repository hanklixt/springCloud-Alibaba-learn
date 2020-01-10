package cloud.alibaba.sentinel.example.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lxt
 * @date 2020-01-10-10:51
 */
public class IpRequestOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        //简单的获取一下ip
        System.out.println(httpServletRequest.getRemoteHost());


        return httpServletRequest.getRemoteHost();
    }
}
