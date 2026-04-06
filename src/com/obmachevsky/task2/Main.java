package com.obmachevsky.task2;

public class Main {
    public static void main(String[] args) {
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        for (int i = 0; i < 5; i++) {
            simpleLogger.log(" демонстрация работы экземпляра SimpleLogger.class");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            smartLogger.log(" демонстрация работы экземпляра SmartLogger.class");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
