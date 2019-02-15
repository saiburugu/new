package com.demo;
 class Student1 {
   private String name;
   private String address;
   private String[] courses;
   private int[] grades;     
   private int numCourses;   
   private static final int MAX_COURSES = 30;  
   public Student1(String name, String address) {
      this.name = name;
      this.address = address;
      courses = new String[MAX_COURSES];  
      grades = new int[MAX_COURSES];
      numCourses = 0;                 
   }
 
      public String getName() {
      return this.name;
   }
   public String getAddress() {
      return this.address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
 
    public String toString() {
      return name + "(" + address + ")";
   }
 
   public void addCourseGrade(String course, int grade) {
      courses[numCourses] = course;
      grades[numCourses] = grade;
      ++numCourses;
   }
   public void printGrades() {
      System.out.print(name);
      for (int i = 0; i < numCourses; ++i) {
         System.out.print(" " + courses[i] + ":" + grades[i]);
      }
      System.out.println();
   }
   public double getAverageGrade() {
      int sum = 0;
      for (int i = 0; i < numCourses; ++i) {
         sum += grades[i];
      }
      return (double)sum/numCourses;
   }
}

public class Student {
   public static void main(String[] args) {
      Student1 ahTeck = new Student1("Tan Ah Teck", "1 Happy Ave");
      System.out.println(ahTeck);  // toString()

    
      ahTeck.setAddress("8 Kg Java");
      System.out.println(ahTeck);  
      System.out.println(ahTeck.getName());
      System.out.println(ahTeck.getAddress());

   
      ahTeck.addCourseGrade("IM101", 89);
      ahTeck.addCourseGrade("IM102", 57);
      ahTeck.addCourseGrade("IM103", 96);
      ahTeck.printGrades();
      System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());
   }
}
