package org.as.devtechsolution.creational.abstractfactory.finance;

import org.as.devtechsolution.creational.abstractfactory.finance.bankservice.Bank;
import org.as.devtechsolution.creational.abstractfactory.finance.loanservice.BussinessLoan;
import org.as.devtechsolution.creational.abstractfactory.finance.loanservice.EducationLoan;
import org.as.devtechsolution.creational.abstractfactory.finance.loanservice.HomeLoan;
import org.as.devtechsolution.creational.abstractfactory.finance.loanservice.Loan;

class LoanFactory extends AbstractFactory
{
   
    //@Override

           public Bank getBank(String bank)
          {
                return null;
          }

   //@Override
      
     public Loan getLoan(String loan){
      if(loan == null){
         return null;
      }

		
      if(loan.equalsIgnoreCase("Home")){
         return new HomeLoan();
      } else if(loan.equalsIgnoreCase("Business")){
         return new BussinessLoan();
      } else if(loan.equalsIgnoreCase("Education")){
         return new EducationLoan();
      }
      return null;
   }
   
}