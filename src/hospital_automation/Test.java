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
public class Test {
    
    Scanner sc=new Scanner(System.in);
    int t_id;
    String t_name;
    int t_price;
   static int pr_t;
    Test(int t_price,String t_name,int t_id)
    {
        this.t_id=t_id;
        this.t_name=t_name;
        this.t_price=t_price;
        pr_t = 0;
    }
    
    void collectSample()
    {
       if(this.t_name.equals("Cholestrol"))
       {
           System.out.println("Total LDL");
           float ldl=sc.nextFloat();
           System.out.println("Total HDL");
           float hdl=sc.nextFloat();
           System.out.println("Total VLDL");
           float vldl=sc.nextFloat();
           float c_level=ldl+hdl+vldl;
           System.out.print("Cholestrol level:"+c_level);
           
           testbill(this.t_price);
       }
       else if(this.t_name.equals("BloodTest"))
       {
           System.out.print("Blood Group:");
           String b_group=sc.next();
           testbill(this.t_price);
       }
       else if(this.t_name.equals("BP"))
       {
           System.out.print("Blood Pressure:");
           String bp=sc.next();
           testbill(this.t_price);
       }
       else if(this.t_name.equals("Insulin"))
       {
           System.out.print("Insulin level:");
           String i=sc.next();
           testbill(this.t_price);
       }
       
       else if(this.t_name.equals("X-ray"))
       {
           System.out.println();
           System.out.println();
           System.out.println("The above image shows the X-ray of the patient");
           testbill(this.t_price);
           
       }
       
     }
    
    void testbill(int pr)
    {
         pr_t=pr_t+pr;
         
    }
    
   static int gettestbill()
    {
        return pr_t;
    }
}
