package com.roger.study.core.spring_web.spittr.data;

import java.util.List;

public interface SpittleRepository {
    public List<Spittle> findSpittles(long max, int count);
}
