/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myproject;

/**
 *
 * @author moham
 */
import java.util.Scanner ;
public class Myproject {
public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int ch;
        int ch2;
        int c, pass=78910 , ipass=0;
        admin d1 = new admin("mhamed","younis","mohamed222101421@ksiu.edu",01123551527,222101421,2539.80,200.9,400.8);
        System.out.println("       welcome!  ");
        System.out.println(" Car Dealership System ");
        do 
        {
            System.out.println(" ----------------------");
            System.out.println("press 1 Admin  ");
            System.out.println("press 2 Customer ");
            System.out.println("please enter choice  ");
            System.out.println("My Choice : " );
            ch =input.nextInt();
            System.out.println("------------------------");
            
                switch(ch)
                {
                    case 1 : 
                        System.out.println("please enter your password :");
                         ipass = input.nextInt();
                       for(int i =0 ; i<3 && ipass!=78910 ; i++)
                       {
                              System.out.println("wrong..please enter password again :");
                               ipass = input.nextInt();
                       }
                       if(pass==ipass)
                           //when enter IDs of admins will change 5555 to admins.id to show if found or not
                       {
                           do{
                                System.out.println(" ----------------------");
                                System.out.println("press 1 to add car  ");
                                System.out.println("press 2 to edit specific car ");
                                System.out.println("press 3 to print cars");
                                System.out.println("press 4 to see sales");
                                System.out.println("My Choice : " );
                                c =input.nextInt();
                                System.out.println("------------------------");
                                switch(c)
                                {
                                    case 1:
                                        //vooke inheritance 
                                        break;
                                    case 2:
                                           //vooke function of edit from inheritance
                                        break;
                                    case 3:
                                        //vooke to print cars
                                        break;
                                    case 4:
                                        break;
                                }
                           }while(c!=0);
                       }
                       else
                          System.out.println("try another time"); 
                     break;

                     case 2:
                         System.out.println(" please selsect your Budget");
                         System.out.println("1 low budget(from 2000 to 3000)");
                         System.out.println("2 middle budget(from 3000 to 4000)");
                         System.out.println("3 high budget(from 4000 to 5000)");
                         System.out.println("your choice :");
                         ch2 = input.nextInt();
                         if(ch2 ==1)
                         {
                             //pritnt or select from avilable cars in this budject show and if want car selsected and print all describtion 
                         }else 
                         if(ch==2)
                            {
                              //pritnt or select from avilable cars in this budject show and if want car selsected and print all describtion    
                             }else{
                             //pritnt or select from avilable cars in this budject show and if want car selsected and print all describtion 
                         }    
                     break;
                     default :
                         System.out.println(" Error ");
                      break;
                }
        }while(ch!=0);
    }
}
