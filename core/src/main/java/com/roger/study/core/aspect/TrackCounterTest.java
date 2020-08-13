package com.roger.study.core.aspect;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={JavaConfig.class})
public class TrackCounterTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(0);

        assertEquals(2,counter.getPlayCount(0));
        assertEquals(1,counter.getPlayCount(1));
    }

}
