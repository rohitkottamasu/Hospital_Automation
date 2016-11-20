/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_automation;

import java.util.Calendar;

/**
 *
 * @author Dell
 */
public class ward {
    
int wid;
    String wname;
    int wardcount=50;
    private static int wardbill;
      int w_bill=0;
     Calendar ct = Calendar.getInstance();
           Calendar ct1 = Calendar.getInstance();
             
    wardstaff wa[]=new wardstaff[2];
    ward(int wid,String wname)
    {
    this.wid=wid;
    this.wname=wname;
    ct.set(2016, 12, 23, 11, 0,0);
    ct1.set(2016,12,23,19,0,0);
   
   wa[0]=new wardstaff(1023,"Filch",ct,ct1);
   wa[1]=new wardstaff(1908,"Madam Pomfray",ct1,ct);
   Calendar Current = Calendar.getInstance();
   Current.set(Calendar.HOUR_OF_DAY, 12);
        for(int k=0;k<2;k++)
        {
            if(this.wa[k].s_time.get(Calendar.HOUR_OF_DAY)<=Current.get(Calendar.HOUR_OF_DAY) && this.wa[k].e_time.get(Calendar.HOUR_OF_DAY)>=Current.get(Calendar.HOUR_OF_DAY))
            {
                wa[k].getwsdetails();
            }
   
   
   
    }
    }
    boolean checkavailability()
    {
        return wardcount>0;
    }
    
     void allocateward()
    {
        wardcount=wardcount-1;
        System.out.println("Your ward is allocated");
       wardbill=wardbill+w_bill;
    }
    void deallocateward()
    {
        if(wardcount<50)
        {
            wardcount=wardcount+1; 
            System.out.println("Your ward is deallocated");
        }
    }
        
       void warddetails() 
       {
           System.out.println("Ward id: "+wid);
           System.out.println("Ward name: "+wname);
       }
       
      static int wardbill()
       {
           return wardbill;
       }
        
    }
    

