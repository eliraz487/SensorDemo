package org.example;

import org.example.models.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.AbstractList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SensorTypeVO sensorTypeVO=new SensorTypeVO();
        sensorTypeVO.setId(24L);
        SensorTypeVSCheckVO sensorTypeVSCheckVO=new SensorTypeVSCheckVO();
        sensorTypeVSCheckVO.setId(3L);
        sensorTypeVSCheckVO.setSensorTypeID(sensorTypeVO.getId());
        CheckTableVO checkTableVO=new CheckTableVO();
        checkTableVO.setId(4L);
        checkTableVO.setTitle("check");
        sensorTypeVSCheckVO.setCheckID(checkTableVO);
        ArrayList<SensorTypeVSCheckVO> checkVOS=new ArrayList<>();
        checkVOS.add(sensorTypeVSCheckVO);
        sensorTypeVO.setChecks(checkVOS);
        sensorTypeVO.setType("apple");
        SensorVO sensorVO = new SensorVO();
        sensorVO.setType(sensorTypeVO);
        ArrayList<SensorTypeVSCheckValueVO>valueVOS=new ArrayList<>();
        SensorTypeVSCheckValueVO valueVO=new SensorTypeVSCheckValueVO();
        valueVO.setId(8L);
        valueVO.setValue(4.1F);
        valueVO.setCheck(checkTableVO);
        LocalDateTime now = LocalDateTime.now();
        valueVO.setValueTime(now);
        valueVOS.add(valueVO);
        sensorVO.setId(1L);
        sensorVO.setCheckValues(valueVOS);

        SendDataScheduler sendDataScheduler=new SendDataScheduler(sensorVO);
        sendDataScheduler.startSendData();
    }
}