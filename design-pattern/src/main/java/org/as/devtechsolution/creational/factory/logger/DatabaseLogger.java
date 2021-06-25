package org.as.devtechsolution.creational.factory.logger;

public class DatabaseLogger implements AppLogger{
    @Override
    public void log (String logMessage) {
        System.out.println("Database Logger "+ logMessage);
    }
}
