package org.as.devtechsolution.creational.factory.logger;

public class FileLogger implements AppLogger{
    @Override
    public void log (String logMessage) {
        System.out.println("File Logger "+ logMessage);
    }
}
