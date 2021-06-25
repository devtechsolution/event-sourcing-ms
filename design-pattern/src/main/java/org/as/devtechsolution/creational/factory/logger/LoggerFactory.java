package org.as.devtechsolution.creational.factory.logger;

public class LoggerFactory {

    public AppLogger getLogger(int value){
        /*if (value==1)
            return new FileLogger();
        else if(value==2)
            return new DatabaseLogger();
        else
            return  new ConsoleLogger();*/
        switch (value){
            case 1:
                return new FileLogger();
            case 2:
                return new FileLogger();
            default:
                return new ConsoleLogger();


        }





    }
}
