package com.multimodule.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName: myFilter
 * @Description: 自定义的过滤器
 * @Author: FangKun
 * @Date: Created in 2018/11/25 20:53
 * @Version: 1.0
 */
public class MyFilter extends ZuulFilter {

    private static Logger lg= LoggerFactory.getLogger(MyFilter.class);

    /**
     * @MethodName filterType
     * @Description 返回的是枚举值：pre:表示路由之前  routing:表示路由当中  post:表示路由之后    error:表示路由发生错误
     * @param
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/25 20:56
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * @MethodName filterOrder
     * @Description 执行时序， 值是0,1,2....N等自然数。 0的优先级最高，即最先执行。
     * @param
     * @Return int
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/25 20:58
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * @MethodName shouldFilter
     * @Description 是否需要执行run函数。
     * @param
     * @Return boolean
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/25 20:59
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        lg.info("过滤器执行开始！！！！！");

//        RequestContext ctx=RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        lg.info(String.format("%s %s", request.getMethod(), request.getRequestURL().toString()));
//        lg.info("过滤器执行结束！！！！！");
//
//        ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
//        ctx.setResponseStatusCode(454545);// 返回错误码
//        ctx.setResponseBody("dnadfnvandfnvadlkdnfvknak;dvn;kandv");// 返回错误内容
//        ctx.set("isSuccess", false);

        return null;
    }
}
