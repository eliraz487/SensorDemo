package org.example;

import org.example.models.SensorVO;


import java.util.Timer;
import java.util.TimerTask;

public class SendDataScheduler {
    private Timer timer;
    private  static final double minute=0.1;

    private SensorVO sensorVO;

    public SendDataScheduler( SensorVO sensorVO) {
        this.timer = new Timer();
        this.sensorVO = sensorVO;
    }

    public void startSendData() {
        TimerTask task = new HelloWorldTask(sensorVO);
        timer.schedule(task, 0L, (long) (minute*60000));
    }

    public void stopSendData() {
        timer.cancel();
    }
}
