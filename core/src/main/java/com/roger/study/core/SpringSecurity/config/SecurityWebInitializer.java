package com.roger.study.core.SpringSecurity.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
/** 过滤Web请求
 *
 *
 * 配置Delegating-FilterProxy
 * 继承AbstractSecurityWebApplicationInitializer会自动注册
 * DelegatingFilterProxy
 *
 * 等价于xml配置
 * <filter>
 <filter-name>springSecurityFilterChain</filter-name>
 <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
 </filter>
 *
 * DelegatingFilterProxy把Filter的处理逻辑委托给Spring应用上下文中定义的一个代理
 * Filter bean
 *
 *
 *
 */
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {
}
