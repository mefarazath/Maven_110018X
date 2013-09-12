package cse;
import java.util.*;
import org.joda.time.DateTime;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class NICinterpreter {
private String input;

    public NICinterpreter(String input) throws Exception{
        this.input = input;
        if(input.length()!= 10)
            throw new Exception("Check the input");
    }
    
    public NICinfo interpretID(){
        
        int Birthday[]=new int[3];
        String sex;
        boolean isVoter;
        
        String year = input.substring(0, 2);
        int year1 = Integer.parseInt(year) + 1900;
        
        String days = input.substring(2, 5);
        int days1 = Integer.parseInt(days);
        
        if (days1 > 500) {
                days1 = days1 - 500;
                sex= "Female";
            }
        else{
                sex= "Male"; 
        }
        
         if(new DateTime().getYear() - year1>=18)
                isVoter = true;
            else
                isVoter = false;
        
        DateTime d2=new DateTime(year1,1,1,0,0);
        DateTime d3;
        if(year1%4==0)
        d3=d2.plusDays(days1-1);
        else
        d3=d2.plusDays(days1-2);    
        
        Birthday[0]=d3.getYear();
        Birthday[1]=d3.getMonthOfYear();
        Birthday[2]=d3.getDayOfMonth();
        
        NICinfo user = new NICinfo();
            user.setIsVoter(isVoter);
            user.setDOB(Birthday);
            user.setSex(sex);
            
        return user;
    }
}
