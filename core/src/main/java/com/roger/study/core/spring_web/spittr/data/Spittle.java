package com.roger.study.core.spring_web.spittr.data;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {
    @Getter
    @NotNull
    @Size(min = 5,max = 16)
    private final Long id;
    @Getter
    @NotNull
    @Size(min = 5,max = 16)
    private final String message;
    @Getter
    @NotNull
    @Size(min = 5,max = 16)
    private final Date time;
    @Getter
    @NotNull
    @Size(min = 5,max = 16)
    private Double longitude;
    @Getter
    @NotNull
    @Size(min = 5,max = 16)
    private Double latitude;

    private Spittle(String message, Date time){
        this(message,time,null,null);
    }
    private Spittle(String message, Date time,Double longitude,Double latitude){
        this.id=null;
        this.message=message;
        this.time=time;
        this.longitude=longitude;
        this.latitude=latitude;
    }

    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this,that,"id","time");
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }



}
