package org.as.devtechsolution.creational.factory.logger;

public class ConsoleLogger implements AppLogger{
    @Override
    public void log (String logMessage) {
        System.out.println("Console Logger "+ logMessage);
    }
}
