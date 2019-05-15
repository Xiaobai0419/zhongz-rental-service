package com.zhongz.rental.common.config;

import com.zhongz.rental.common.interceptor.LoginInterceptor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Log
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    private WhiteListConfig whiteListConfig;
    @Autowired
    private LoginInterceptor loginInterceptor;

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> urls = whiteListConfig.getUrls();
        log.info("Whitelist:" + urls);
        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(loginInterceptor)
//                .addPathPatterns("/system/zhongzContract/listUserRenew",
//                        "/system/zhongzContract/listUserAll","/system/zhongzOrder/addNew",
//                        "/system/zhongzOrder/addRenew");
                .addPathPatterns("/**")
                .excludePathPatterns(urls.toArray(new String[urls.size()]));
    }
}