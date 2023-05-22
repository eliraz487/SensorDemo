package org.example;

import org.example.models.SensorTypeVSCheckValueVO;
import org.example.models.SensorVO;

import java.util.TimerTask;

public class HelloWorldTask extends TimerTask {


    private SensorVO sensor;
    public HelloWorldTask(SensorVO sensorVO) {
        this.sensor =sensorVO;
    }

    @Override
    public void run() {
        for (SensorTypeVSCheckValueVO valueVO:sensor.getCheckValues()) {
            System.out.println(valueVO.toString());
        }

    }
}