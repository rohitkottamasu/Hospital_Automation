/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_automation;
import java.util.Scanner;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Doctor {
     int d_id;
   private  String dname;
     Calendar stime;
    Calendar etime;
   private int n;
  static int t_price=0;
  byte k;
  private int cfee;
  static int c_fee;
  Doctor d;
 ArrayList<patient> pat=new ArrayList<>();

   static Scanner sc=new Scanner(System.in);
    Doctor(int d_id,String dname,Calendar stime,Calendar etime,int cfee)
    {
        this.d_id=d_id;
        this.dname=dname;
        this.stime=stime;
        this.etime=etime;
        this.cfee=cfee;
        c_fee=cfee;
    }
    
    void ddetails()
    {
        System.out.println("The details of the doctor are:"+this.dname+" "+this.d_id);
    }
     void prescribemedicines()
    {
        ArrayList<String> med=new ArrayList();
        ArrayList<Integer> price=new ArrayList();
        
        System.out.println("Enter the number of medicines:");
        byte nu=sc.nextByte();
        System.out.println("Enter the Medicines:");
        for(int i=0;i<nu;i++)
        {
            System.out.print(i+1+")");
            med.add(sc.next());
            System.out.println();
        }
        
        
    }
     
     
    
    void prescribetests()
    {
        System.out.println("Enter the number of tests to be prescribed:");
     //   n=sc.nextInt();
     Test t[]=new Test[5];
        t[0]=new Test(2000,"BP",1067);
        t[1]=new Test(3000,"Cholestrol",1057);
        t[2]=new Test(500,"BloodTest",1028);
        t[3]=new Test(500,"X-ray",1786);
        t[4]=new Test(2500,"Insulin",7896);
         
        System.out.println("Test names:");
        System.out.println("1.BP");
        System.out.println("2.Cholestrol");
        System.out.println("3.BloodTest");
        System.out.println("4.X-ray");
        System.out.println("5.Insulin");
         System.out.println("Enter the number of tests:");
         byte i=sc.nextByte();
         
         for(byte j=0;j<i;j++)
         {
             System.out.println("Enter the test number:");
             k=sc.nextByte();
             t[k-1].collectSample(); 
             
             //d.bill.add(t[k-1].gettestbill());
        
         }
        
        
    }
     
   static int getcfee()
    {
        return c_fee;
    }
   
   void patientlist(patient pa)
   {
       pat.add(pa);
      // return pat.get(pat.size());
   }
   
   patient getpatientlist()
   {
       return pat.get(pat.size()-1);
   }
}

