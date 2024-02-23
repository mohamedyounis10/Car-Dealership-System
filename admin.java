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
public class admin extends person{
    public static Scanner input = new Scanner(System.in);
   public ArrayList<Integer> id = new ArrayList<>();
    ArrayList<Double> salary = new ArrayList<>();
    ArrayList<Double> bouns = new ArrayList<>();
    ArrayList<Double> deduc = new ArrayList<>(); 
    admin()
    {
        super();
        for(int i =0 ; i<s ; i++)
        {
            System.out.println("please enter your id");
          id.add(input.nextInt()); 
            System.out.println("please enter salary");
          salary.add(input.nextDouble());
            System.out.println("please enter bouns");
          bouns.add(input.nextDouble());
            System.out.println("please enter deduction");
          deduc.add(input.nextDouble());
        }
      
    }
    admin(String f , String l ,String e , int n,int i , double s , double b , double d)
    {
      super(f,l,e,n);
      id.add(i); 
     salary.add(s); 
     bouns.add(b); 
     deduc.add(d);
    }
}
