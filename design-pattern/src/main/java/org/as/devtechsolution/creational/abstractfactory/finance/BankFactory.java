package org.as.devtechsolution.creational.abstractfactory.finance;

import org.as.devtechsolution.creational.abstractfactory.finance.bankservice.Bank;
import org.as.devtechsolution.creational.abstractfactory.finance.bankservice.HDFC;
import org.as.devtechsolution.creational.abstractfactory.finance.bankservice.ICICI;
import org.as.devtechsolution.creational.abstractfactory.finance.bankservice.SBI;
import org.as.devtechsolution.creational.abstractfactory.finance.loanservice.Loan;

class BankFactory extends AbstractFactory
{
   //@override
    
         
   public Bank getBank(String bank){
      if(bank == null){
         return null;
      }

		
      if(bank.equalsIgnoreCase("HDFC")){
         return new HDFC();
      } else if(bank.equalsIgnoreCase("ICICI")){
         return new ICICI();
      } else if(bank.equalsIgnoreCase("SBI")){
         return new SBI();
      }
      return null;
   }
   
  //@Override

  public Loan getLoan(String loan) {
      return null;
   }

}