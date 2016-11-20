/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_automation;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class patient {
    int pid;
    String pname;
    Test t;
    ward w;
    Doctor d;
    Operation o;
    String choice;
    long id=1510110314;
    patient(int a,String s)
    {
       
        pid = a;
        pname=s;
    }
    
    void pdetails()
    {
        System.out.println("The details of the patient are:"+pname+" "+pid);
    }
    
    void paycharges(float bill)
    {
         Scanner sc=new Scanner(System.in);
       // System.out.println(Test.pr_t);
       
        System.out.println("Do you have a BPL card[Y/N]");
        choice=sc.next();
        if(choice.equals("Y"))
        {
            System.out.println("Enter the ID");
           long id1=sc.nextLong();
            if(id==id1)
            {
                System.out.println("Your request has been accepted");
                bill=bill/2;
            }
            else
                System.out.println("Wrong ID");
        }
            
             System.out.println("The total payable amount is:"+bill);
            
        }
        
        
    }


