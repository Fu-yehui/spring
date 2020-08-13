package com.roger.study.core.advanced_wiring.running_inject;

import com.roger.study.core.wiringbean.autowiring.CDPlayerConfig;
import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import com.roger.study.core.wiringbean.autowiring.MediaPlayer;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ExpressiveConfig.class)  //需要在CDPlayerConfig中加载配置

public class Test {



        @Autowired
        private CompactDisc cd;

        @org.junit.Test
        public void cdShouldNotBeNull(){

            assertNotNull(cd);
        }



    }
