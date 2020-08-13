package com.roger.study.core.spring_web.spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {
    /**
     * 仅将HomeController当作POJO进行测试,没有当作Spring MVC进行测试，
     * 没有断言当接收“/” 的GET请求时会调用home()返回值
     */
    @Test
    public void testHome() {
        HomeController homeController=new HomeController();
        assertEquals("home",homeController.home());
    }

    /**
     * MockMvc被定义为服务器端 Spring MVC 测试的主要入口点。 MockMvc的测试介于单元测试和集成测试之间。
     * 发起对“/” 的GET请求,并断言结果视图名称为home
     * @throws Exception
     */
    @Test
    public void testHomePage() throws Exception {
        HomeController homeCntroller=new HomeController();
        MockMvc mockMvc=standaloneSetup(homeCntroller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
