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
import java.util.*;
public class reception {
    static String r[]=new String[]{"Java","Python","Cobol","Ruby"};
    static Scanner sc=new Scanner(System.in);
      department d;
       int w_id;
    String w_name;
    //patient pa;
    Test t;
    ward wa;
    Doctor doc;
    Operation o;
    
     Doctor registerpatient()
   {
       
       Random ra=new Random();
       
       
       System.out.println(" Your Receptionist is:-"+r[ra.nextInt(3)]);
       
       
       System.out.println("Enter the patient name:");
       String p=sc.next();
       System.out.println("Enter the patient id");
       int id=sc.nextInt();
       
       patient pa=new patient(id,p);
       
      // pa.pdetails();
       
       System.out.println("Departments:");
       System.out.println("1.ENT");
       System.out.println("2.Cardiology");
       System.out.println("3.Orthopedics");
       System.out.println("4.Gynaecology");
       System.out.println("5.Pediatrics");
       System.out.println("Enter the department number:");
       Byte dep=sc.nextByte();
       
switch(dep)
{
    case 1:
           d=new ENT();
           d.deptdetails();
           
           break;
      
    case 2:
       
            d=new cardiology();
           d.deptdetails();
       break;
    case 3:
       
            d=new Orthopedics();
           d.deptdetails();
       break;
    case 4:
      
           d=new gynaecology();
           d.deptdetails();
           break;
    case 5:
        d=new pediatrics();
        d.deptdetails();
        
       }
      
      if(d!=null)
      {
       
       d.Appointment().patientlist(pa);
       return d.Appointment();
      }
       else
          return null;
   }

     
     
  
   
   
     void billinvoice()
     {
         System.out.println("----------------------------------------------------------------");
         System.out.print("\tBILL INVOICE");
         
         
        System.out.println();
       System.out.println("Test charges:"+Test.gettestbill());
        System.out.println("Ward charges:"+ward.wardbill());
        System.out.println("Doctor consultation fee:"+Doctor.getcfee());
        System.out.println("Operation fee:"+Operation.getopbill());
        float totalbill=Test.gettestbill()+ward.wardbill()+Doctor.getcfee()+Operation.getopbill();
        float taxes=totalbill/5;
        totalbill=totalbill+taxes;
        System.out.println("Taxes:"+taxes);
        System.out.println();
        System.out.println();
        System.out.println("Total Bill:"+totalbill);
        
        d.Appointment().getpatientlist().paycharges(totalbill);
        
         
     }
       
 
        
    }
    
    
    

