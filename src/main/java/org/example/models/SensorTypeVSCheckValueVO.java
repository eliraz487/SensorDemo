package org.example.vo;


import lombok.Data;


import java.io.Serializable;


@Data

public class SensorTypeVSCheckValueVO implements Serializable {



    private Long id;


    private Float value;


    private String valueTime;

    private Long sensorID;

    private Long sensorTypeVSCheckID;

}
