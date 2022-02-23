/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */
public class StausUser 
{
    public enum Status {REJECTED, PENDING, PROCESSING, APPROVED, NOT_VALID_CODE};
    private String status;
    
    
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String toString()
    {
        String s = "";
        
        if(status.equalsIgnoreCase("ZERO"))
            s = "Rejected";
        else if(status.equalsIgnoreCase("ONE"))
            s = "PENDING";
        else if(status.equalsIgnoreCase("TWO"))
            s = "PROCESSING";
        else if(status.equalsIgnoreCase("THREE"))
            s = "APPROVED";
        else
            System.out.println("OT VALID CODE");
        return s; 
    }    
    
}
        
//   public void statusDetail(String code)
//   {
//       
//        
        
        
        
//    switch(code.toUpperCase())
//        {
//        case "ZERO": System.out.println("REJECTED");
//        break;
//        case "ONE": System.out.println("PENDING");
//        break;
//        case "TWO":
//        System.out.println("PROCESSING");
//        break;
//        case "THREE": 
//            System.out.println("APPROVED");
//        break;
//        default:
//         System.out.println("NOT VALID CODE");
//        break;
//        }
//   }
 
//}
