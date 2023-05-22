package org.example;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HelloWorldScheduler {
    private Timer timer;

    public HelloWorldScheduler() {
        timer = new Timer();
    }

    public void startPrinting() {
        TimerTask task = new HelloWorldTask();

        // Schedule the task to run every 5 minutes (300,000 milliseconds)
        timer.schedule(task, 0, 300000);
    }

    public void stopPrinting() {
        timer.cancel();
    }
}
