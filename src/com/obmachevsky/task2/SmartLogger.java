package com.obmachevsky.task2;

import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    private static int counter;

    @Override
    public void log(String msg) {
        System.out.printf("INFO#%d %s %s", counter++, LocalDateTime.now(), msg);
        System.out.println();
    }
}
