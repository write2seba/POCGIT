package com.redhat.poc.pocdt;

import com.redhat.poc.pocdt.Person;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BankUser extends Person implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "CreditScore")
   private int creditScore;

   public BankUser()
   {
   }

   public int getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(int creditScore)
   {
      this.creditScore = creditScore;
   }

   public BankUser(int creditScore)
   {
      this.creditScore = creditScore;
   }

}