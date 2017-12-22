package com.redhat.poc.pocdt;

import com.redhat.poc.pocdt.BankUser;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant extends BankUser implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Status")
   private java.lang.String status;
   @org.kie.api.definition.type.Label(value = "Eligible")
   private boolean eligible;
   @org.kie.api.definition.type.Label(value = "CreditLimit")
   private double creditLimit;

   public Applicant()
   {
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public boolean isEligible()
   {
      return this.eligible;
   }

   public void setEligible(boolean eligible)
   {
      this.eligible = eligible;
   }

   public double getCreditLimit()
   {
      return this.creditLimit;
   }

   public void setCreditLimit(double creditLimit)
   {
      this.creditLimit = creditLimit;
   }

   public Applicant(java.lang.String status, boolean eligible,
         double creditLimit)
   {
      this.status = status;
      this.eligible = eligible;
      this.creditLimit = creditLimit;
   }

}