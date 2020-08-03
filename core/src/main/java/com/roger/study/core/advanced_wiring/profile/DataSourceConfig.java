package com.roger.study.core.advanced_wiring.profile;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.activation.DataSource;

@Configuration
@Profile("prod")
public class DataSourceConfig {

//    @Bean(destroyMethod = "shutdown")
//    @Profile("dev")
//    public DataSource embeddedDataSource(){
//        return new EmbeddedDatabaseBuilder()
//                .setType()
//                .setType("classpath:schema.sql")
//                .addScript("classpath:test-data.sql")
//                .build();
//
//    }


    @Bean
    @Profile("prod")
    public DataSource jndiDataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean=new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource)jndiObjectFactoryBean.getObject();
    }
}
