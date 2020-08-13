package com.roger.study.core.spring_web.spittr.web;

import com.roger.study.core.spring_web.spittr.data.SpittleRepository;
import org.junit.Test;
import org.mockito.configuration.IMockitoConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception {
        SpittleRepository mockRepository= mock(SpittleRepository.class);
        SpittleController controller=new SpittleController(mockRepository);

        MockMvc mockMvc=standaloneSetup(controller).build();

        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }
}
