package org.as.devtechsolution.creational.abstractfactory.finance.bankservice;

// calculate the loan payment for different banks like HDFC, ICICI, SBI etc. a real world example.


// Step 1 

             //We are going to create a Bank interface.


public interface Bank
{

        String getBankName();

}


// Step 2 

             //Create concrete classes that will implement the  Bank interface. 










// Step 3 

             //Create a loan abstract class. 

// end of the Loan abstract class.



// Step 4 

             //Create concrete classes that will extends the  Loan abstract class. 

//End of the HomeLoan class.


//End of the BusssinessLoan class.



//End of the EducationLoan class.




// Step 5 

     //Create an abstract class (i.e AbstractFactory) to get the factories for Bank and Loan Objects.


//End of the AbstractFactory.


// Step 6 

     //Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.


//End of the BankFactory class.


//End of the LoanFactory class.


// Step 7 
      
   //Create a FactoryCreator class to get the factories by passing an information such as Bank or Loan.



 //End of the FactoryCreator.


// Step 8 
      
    //Use the FactoryCreator to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.

//End of the  AbstractFactoryPatternExample













