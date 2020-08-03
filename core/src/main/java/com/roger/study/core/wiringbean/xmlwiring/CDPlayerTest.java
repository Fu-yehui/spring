package com.roger.study.core.wiringbean.xmlwiring;


import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import com.roger.study.core.wiringbean.autowiring.MediaPlayer;
import com.roger.study.core.wiringbean.javaconfigwiring.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayerTest {


    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull(){

        assertNotNull(cd);
    }


    @Test
    public void play(){
        assertNotNull(player);
        player.play();


    }
}
