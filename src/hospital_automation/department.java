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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
//import java.util.Calendar;
public abstract class department {
    String depname;
    int dept_id;
    String dept_location;
    //int flag=0;
    ArrayList<Doctor> doc = new ArrayList<>();
   
    Calendar StartTime;
    Calendar StartTime1;
    Calendar StartTime2;
    Calendar EndTime;
    
  //String doctors[]=new String[]{"Dr.Sneha","Dr.Haresh","Dr.pranay","Dr.Johny Bravo","Dr.Snape","Dr.Lord Voldemort,Dr.Kshiti","Dr.Mcgonagall","Dr.Rohit","Dr.Powerpuffgirl","Dr.Dolores Umbridge","Dr.Ginny","Dr.Hermoine Granger","Dr.Luna Lovegood","Dr.cho"};

    public department() {
         //long date = ""
           
           Calendar ct = Calendar.getInstance();
           Calendar ct1 = Calendar.getInstance();
           Calendar ct2 = Calendar.getInstance();
           Calendar ct3 = Calendar.getInstance();
           
           //ct.set(2000, 1, 1, 11, 00, 00);
           
           ct.set(2016, 12, 23, 11, 0,0);
           ct1.set(2016,12,23,15,0,0);
           ct2.set(2016,12,23,18,0,0);
           ct3.set(2016,12,23,23,0,0);
           
          
          
           
           
          // ct.add(Calendar.HOUR_OF_DAY, +0); //1100
            this.StartTime = ct;
            // System.out.println(this.StartTime);
           //ct.add(Calendar.HOUR_OF_DAY, +4); //1500
           this.StartTime1 = ct1;
           // System.out.println(this.StartTime1);
           //ct.add(Calendar.HOUR_OF_DAY, +4);  //1900
           this.StartTime2 =  ct2;
           // System.out.println(this.StartTime2);
          // ct.add(Calendar.HOUR_OF_DAY, +4);  //2300
           this.EndTime = ct3;
           // System.out.println(this.EndTime);
           // System.out.println(); */
       
        

    }
    
    abstract void deptdetails();
     Doctor Appointment()
    {
       
        Calendar Current = Calendar.getInstance();
       // System.out.println(Current.get(Calendar.HOUR_OF_DAY));
        Current.set(Calendar.HOUR_OF_DAY, 12);
       // Date dt = new Date();
       // System.out.println(this.doc.size());
        
      
              for(int k = 0 ; k <this.doc.size(); k++)
              { 
      
                  
                        if (this.doc.get(k).stime.get(Calendar.HOUR_OF_DAY)<=Current.get(Calendar.HOUR_OF_DAY) && this.doc.get(k).etime.get(Calendar.HOUR_OF_DAY)>Current.get(Calendar.HOUR_OF_DAY))
                        {
                      return this.doc.get(k);
                        }
                        
              }
            
        
        
         
        return null;
         
        
    }
   // SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
    
 }

 class ENT extends department
{
       ENT()       {
                 
               doc.add(new Doctor(306,"Dr.Haresh",StartTime,StartTime1,3000));
               doc.add(new Doctor(1510,"Dr.Sneha",StartTime1,StartTime2,1500));
               doc.add(new Doctor(2406,"Dr.Pranay",StartTime2,EndTime,1500));
               
               
              }
             
             
 
         
         @Override
         void deptdetails()
         {
             //depname.equals("ENT");
             dept_id=100;
                dept_location="D101";
                System.out.println("The department details are:"+dept_id+" "+dept_location);
         }

    
  }
 class Orthopedics extends department
{
    
     Orthopedics()
    {
       // SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                
           //super();   
           doc.add(new Doctor(1406,"Dr.Harry Potter",StartTime,StartTime1,2500));
            doc.add(new Doctor(1305,"Dr.Lord voldemort",StartTime1,StartTime2,3000));
            doc.add(new Doctor(007,"Dr.Severus Snape",StartTime2,EndTime,4000));
              
          
        
    }
    
    
         @Override
         void deptdetails()
            {
                
                dept_id=109;
                dept_location="D101";
                System.out.println("The department details are:"+dept_id+" "+dept_location);
            }
 }

class cardiology extends department
{
    
    cardiology()
    {
       // SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
             doc.add(new Doctor(143,"Dr.Kshiti",StartTime,StartTime1,4500));
             doc.add(new Doctor(1110,"Dr.Mcgonagall",StartTime1,StartTime2,2500));
             doc.add(new Doctor(3098,"Dr.Rohit",StartTime2,EndTime,4500));
              
              
        
    }
    
    
         @Override
         void deptdetails()
            {
                
                dept_id=101;
                dept_location="C107";
                System.out.println("The department details are:"+dept_id+" "+dept_location);
               // System.out.println("The department details are:"+dept_id+" "+dept_location);
                //Doctor d=new Doctor(0143,"Dr.Kshiti");
            }  
}

class gynaecology extends department
{
 
    gynaecology()
    {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
             doc.add(new Doctor(1183,"Dr.powerpuffgirl",StartTime,StartTime1,3000));
             doc.add(new Doctor(1610,"Dr.Dolores Umbridge",StartTime1,StartTime2,1000));
             doc.add(new Doctor(3298,"Dr.Ginny Weasly",StartTime2,EndTime,2000));
    }
    
         @Override
         void deptdetails()
            {
                dept_id=105;
                dept_location="C117";
                System.out.println("The department details are:"+dept_id+" "+dept_location);
               // System.out.println("The department details are:"+dept_id+" "+dept_location);
               // Doctor d=new Doctor(1009,"Dr.powerpuffgirl");
            }  
}
class pediatrics extends department
{
  
     pediatrics()
    {
  //      SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
             doc.add(new Doctor(0143,"Dr.Hermoine Granger",StartTime,StartTime1,4000));
             doc.add(new Doctor(1110,"Dr.Luna Lovegood",StartTime1,StartTime2,3000));
             doc.add(new Doctor(3098,"Dr.Bellatrix Lestrange",StartTime2,EndTime,2000));
    }
    
         @Override
         void deptdetails()
            {
                dept_id=115;
                dept_location="B127";
                System.out.println("The department details are:"+dept_id+" "+dept_location);
                System.out.println("The department details are:"+dept_id+" "+dept_location);
               
            }  
}
 

