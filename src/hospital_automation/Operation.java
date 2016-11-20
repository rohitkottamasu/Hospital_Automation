/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_automation;

//import com.sun.istack.internal.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;

import java.util.Scanner;
import java.util.logging.Logger;
/**;
 *
 * @author Dell
 */
public class Operation {
    static int bill=0;
  int opid;
   // String opname;
 static byte choice;
  
      //SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");  
    Scanner sc=new Scanner(System.in);
    Operation()
    {
        String operations[]=new String[]{"Open heart Surgey","Ligament Surgery","Thyroid Surgery","cervical cryosurgery"};
        
        System.out.println("1.Open Heart surgery");
        System.out.println("2.Ligament Surgery");
        System.out.println("3.Thyroid surgery");
        System.out.println("4.cervical cryosurgery");
        choice=sc.nextByte();
        getopdetails(operations[choice-1]);
        setopbill(choice);
        
    }

        
        
        
    
    void getopdetails(String opnam)
    {
        System.out.println("operation id"+opnam.length());
        System.out.println("operation name:"+opnam);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

Date operationTime;
        try {
            operationTime = dateFormat.parse(dateFormat.format(new Date()));
             System.out.println("operation time"+operationTime);
        } catch (ParseException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            
        
     }
    
    void setopbill(byte choice)
    {
        
        switch(choice)
        {
            case 1:
             bill=30000;
                break;
                
            case 2:
                bill=20000;
                break;
            case 3:
                bill=10000;
                break;
            case 4:
                bill=40000;
                break;
            default:
                bill=0;
                
        }
        
    }
    
    static int getopbill()
    {
        return bill;
    }
    
    
}   
    
    

