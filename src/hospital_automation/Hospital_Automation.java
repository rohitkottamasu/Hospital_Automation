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
public class Hospital_Automation {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
         patient p;
         boolean count=true;
        Scanner sc=new Scanner(System.in);
        String cho;
        Doctor doc ;
      while(count)
      {
        reception r=new reception();
        
         doc = r.registerpatient();
            
        
          //r.AssignDeptPoint(doc);
           
        
      
      if(doc==null)
        {
            System.out.println("No doctor assigned");
        }
        else  if(doc!=null)
        {
        doc.ddetails();
         doc.prescribetests();
        doc.prescribemedicines();
       
            System.out.println("Does the patient requires operation?[Y/N]");
            String choice=sc.next();
            if(choice.equals("Y"))
            {
                
                Operation o=new Operation();
                System.out.println("Enter wid");
               int w_id=sc.nextInt();
               System.out.println("Enter wname");
               String w_name=sc.next();
               ward w=new ward(w_id,w_name);
               w.w_bill=5000;
               w.allocateward();
            }
            
            
            p=doc.getpatientlist();
            p.pdetails();
            r.billinvoice();
            System.out.println("Do you want access to patient details:");
            cho=sc.next();
            if(cho.equals("Y"))
            {
                System.out.println("Enter the doctor id:");
                int d_id1=sc.nextInt();
                if(doc.d_id==d_id1)
                {
                    for(int i=0;i<doc.pat.size();i++)
                    {
                    System.out.println(doc.pat.get(i).pname);
                    }
                }
                else
                {
                    System.out.println("Access denied");
                }
            }
            
         

        }
      
          System.out.println("Do you want to continue?[Y/N]");
          String ch=sc.next();
          
          if(ch.equals("Y"))
          {
              count=true;
          }
          else
          {
              count=false;
          }
          
          

    }
    }
  
}
