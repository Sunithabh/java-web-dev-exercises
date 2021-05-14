package org.launchcode.java.demos.lsn3classes1;

public class Teacher {    //created a class Teacher with 4 fields
   private String firstName;    //private is the modifier which restricts access the most
   private String lastName;
   private String subject;
   private int yearsOfTeaching;

 // Added getters and Setters, access levels to each field and method in the class
   //If we do set fields to private, we can give private access level to our getters and setters

   public String getFirstName() {
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   public String getSubject(){
      return subject;
   }
   public int getYearsOfTeaching(){
      return yearsOfTeaching;
   }

   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   public void setSubject(String subject){
      this.subject = subject;
   }
   public void setYearsOfTeaching(int yearsOfTeaching){
      this.yearsOfTeaching = yearsOfTeaching;
   }
}
