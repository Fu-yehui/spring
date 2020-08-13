package com.roger.study.core.SpringSecurity.config;

import com.roger.study.core.SpringSecurity.config.security.SpitterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import javax.sql.DataSource;
import javax.ws.rs.HttpMethod;

/**     Spring Security 安全配置
 *
 *
 * SpringSecurity必须配置在实现了WebSecurityConfigurer的bean中
 * 或者扩展 WebsecurityConfigurerAdapter
 */
@Configuration
@EnableWebSecurity  //启动Web安全性
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     *
     启用内存用户存储
    */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER").and()
//                .withUser("admin").password("password").roles("USER","ADMIN");
//    }


    /**
     * 基于数据库表进行认证
     */
//    @Autowired
//    private DataSource dataSource;
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource);
//    }


    /**
     * //配置自定义的用户服务

     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(new SpitterUserService());
    }

    /**拦截请求
     *
     * 对于每个 请求 进行细粒度安全性控制
     *
     * 为不同的URL路径由选择的应用安全性
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.formLogin()    //启动默认的登入页面
                .loginPage("/login")  //自定义登入页面
                .and()
                /**
                 * 启动HTTP Basic认证
                 */
                .httpBasic()
                .realmName("Spittr")
                .and()
                /**
                 * 启动Remember-me功能
                 */
                .rememberMe()
                .tokenValiditySeconds(2419200) //定义token有效时间
                .key("spittrKey")       //自定义私钥
                .and()
                /**
                 *
                 */
                .logout()
                .logoutSuccessUrl("/")  //退出后，浏览器重定向的路径
                .logoutUrl("/signout") //改写默认的LogoutFilter拦截路径
                .and()
                .authorizeRequests()
                .regexMatchers("/spitters/me").hasAuthority("ROLE_SPITTER")
                .antMatchers(HttpMethod.POST,"/spittles")
                                                    .hasAuthority("ROLE_SPITTER")
                .anyRequest().permitAll()
                .and()
                /**强制通道安全性
                 *
                 * 只要是对"/spitter/form"的请求，Spring Security都是为需要安全通道
                 * 并自动将请求重定向到HTTPS上
                 *
                 * 只要是对"/"的请求，Spring Security都是为不需要安全通道
                 * 始终通过HTTP传送
                 */
                .requiresChannel()
                .antMatchers("/spitter/form").requiresSecure()     //需要HTTPS
                .antMatchers("/").requiresInsecure() //需要HTTP
                .and()
                /**
                 * 禁用跨站请求伪造(CSRF)
                 */
                .csrf()
                .disable();
    }

}
