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
import java.util.Calendar;
public class wardstaff {
    int ws_id;
    String ws_name;
    Calendar s_time;
    Calendar e_time;
    
    
    wardstaff(int ws_id,String ws_name,Calendar s_time,Calendar e_time)
    {
        
        this.ws_id=ws_id;
        this.ws_name=ws_name;
        this.s_time=s_time;
        this.e_time=e_time;
        
     }
    
    void getwsdetails()
    {
        System.out.println("The details of the wardstaff are:");
        System.out.println("Wardstaff name:"+this.ws_name);
        System.out.println("Wardstaff id:"+this.ws_id);
    }
    
}

