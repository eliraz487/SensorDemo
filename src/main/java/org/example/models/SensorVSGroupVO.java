package org.example.vo;


import lombok.Data;


import java.io.Serializable;


@Data
public class SensorVSGroupVO implements Serializable {


    private Long id;


    private Long groupID;


    private Long sensorID;

}
