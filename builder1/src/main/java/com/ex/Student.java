package com.ex;

public class Student {

    private String firstName;
    private String middleName;
    private String lastName;
    private String country;
    
    Student(StudentBuilder builder){

        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.country = builder.country;
    }

    

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
                + ", country=" + country + "]";
    }
    
    public String toString1() {
        return "Student [firstName=" + firstName +  "]";
    }

    public String toString2() {
        return "Student [firstName=" + ", middleName=" + middleName+  "]";
    }

    public String toString3() {
        return "Student [firstName=" + ", middleName=" + middleName+ ", lastName=" + lastName+ "]";
    }



    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getMiddleName() {
        return middleName;
    }



    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }



    public String getLastName() {
        return lastName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getCountry() {
        return country;
    }



    public void setCountry(String country) {
        this.country = country;
    }



    public static StudentBuilder getBuilder(){

        return new Student.StudentBuilder();
    }

    public static class StudentBuilder{

          private String firstName;
          private String middleName;
          private String lastName;
          private String country;

          StudentBuilder(){

          }

          public StudentBuilder firstName(String firstName){
            this.firstName = firstName;

            return this;
          }

          public StudentBuilder middleName(String middleName){
            this.middleName = middleName;

            return this;
          }

          public StudentBuilder lastName(String lastName){
            this.lastName = lastName;

            return this;
          }

          public StudentBuilder country(String country){
            this.country = country;

            return this;
          }

          public Student build(){

            return new Student(this);
          }

        // @Override
        // public String toString() {
        //     return "StudentBuilder [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
        //             + ", country=" + country + "]";
        // }

         
    } 
    
}
