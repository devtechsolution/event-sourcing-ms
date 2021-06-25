package org.as.devtechsolution.creational.abstractfactory.finance;

import org.as.devtechsolution.creational.abstractfactory.finance.bankservice.Bank;
import org.as.devtechsolution.creational.abstractfactory.finance.loanservice.Loan;

public abstract class AbstractFactory
{
  public abstract Bank getBank(String bank);
  
  public abstract Loan getLoan(String loan);

}