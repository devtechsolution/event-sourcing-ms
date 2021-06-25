package org.as.devtechsolution.creational.abstractfactory.finance.bankservice;

public class HDFC implements Bank
{

         private final String BNAME;

         public HDFC()
        {
                BNAME="HDFC BANK";
        }

    //  @override
        public String getBankName()
       {
                  return BNAME;
        
       }

}