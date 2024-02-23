/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 *
 * @author moham
 */
import java.util.Scanner;
import java.util.ArrayList;
public class person {
    public static Scanner input = new Scanner(System.in);
   ArrayList<String> fname = new ArrayList<>();
   ArrayList<String> lname = new ArrayList<>();
   ArrayList<String> email = new ArrayList<>();
   ArrayList<Integer> number = new ArrayList<>();
   public int s=0;
  person()
  {
       System.out.println("please enter How many people do you want to enter?");
      s=input.nextInt();
      for(int i =0 ; i<s ; i++)
      {
      System.out.println("please enter your first name");
      fname.add(input.next());
       System.out.println("please enter your last name");
      lname.add(input.next());
       System.out.println("please enter your email");
      email.add(input.next());
       System.out.println("please enter your number");
      number.add(input.nextInt());
      }
  }
  person(String f , String l ,String e , int n)
  {
     fname.add(f); 
     lname.add(l); 
     email.add(e); 
     number.add(n); 
  }
  public void print()
  {
     System.out.println("--------------------------"); 
      for(int i =0 ; i<fname.size() ; i++)
      {
             System.out.println((i+1) + "  name :"+fname.get(i)+" "+lname.get(i)+" | email :"+email.get(i)+
                     " | number :"+number.get(i));     
      }
     System.out.println("--------------------------");
  }
  public void edit_name()
  {
      print();
       System.out.println("please choice to edit fierst name and last name");
       int x = input.nextInt();
      fname.set((x-1),input.next());
      lname.set((x-1),input.next());
  }
    public void edit_email()
  {
      print();
       System.out.println("please choice to edit email");
       int x = input.nextInt();
      email.set((x-1),input.next());
  }
     public void edit_number()
  {
      print();
       System.out.println("please choice to edit number");
       int x = input.nextInt();
      number.set((x-1),input.nextInt());
  }
}
