package org.as.devtechsolution.creational.factory.logger;

public class LoggerFactoryClient {

    public static void main (String[] args) {
        LoggerFactory loggerFactory= new LoggerFactory();
        final var logger = loggerFactory.getLogger(1);
        logger.log("App Logger");
    }
}
