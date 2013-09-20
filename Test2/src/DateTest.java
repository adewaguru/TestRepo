import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author Asanga
 *
 */
public class DateTest {
    
   
public static String dateToString(Date date){
        
        String result=null;
        Calendar javaCal = null;
        
        javaCal = Calendar.getInstance();

        java.text.SimpleDateFormat monthFormat = new java.text.SimpleDateFormat("MM");
        java.text.SimpleDateFormat dateFormet = new java.text.SimpleDateFormat("dd");
        java.text.SimpleDateFormat yearFormat = new java.text.SimpleDateFormat("yyyy");

        javaCal.setTime(date);
        
        result = dateFormet.format(javaCal.getTime()) + monthFormat.format(javaCal.getTime()) + yearFormat.format(javaCal.getTime());
        
        return result;
        
    }
    
public static String getCurrentDate(){
    
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
    return sdf.format(cal.getTime());

}

    /**
     * @param args
     */
    public static void main(String[] args) {
	 Date d=new Date();
	 
	 d.setYear(82);
	 d.setMonth(12);
	 d.setMonth(d.getMonth()-1);
	 d.setDate(9);
	 
	 System.out.println(dateToString(d));
	 
	 Calendar c1= Calendar.getInstance();
	 c1.set(d.getYear(),  d.getMonth(), d.getDate());
	 
	 //d =c1.getTime();
	 
	 
	 SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
	 SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	 SimpleDateFormat dFormat = new SimpleDateFormat("dd");
	
	// finalDate = monthFormat.format(finalDate);
	 
	 //System.out.println("Date: "+d.toString());
	 //System.out.println("Final: "+finalDate);
	 System.out.println("Handcrafted: "+yearFormat.format(d.getTime()) + monthFormat.format(d.getTime()) +dFormat.format(d.getTime()));
	 //System.out.println("Calender: "+c.get(c.YEAR) + c.get(c.MONTH) +c.get(c.DATE));
	 
	 //System.out.println("Handcrafted2 : "+d2.getYear() + d2.getMonth() +d2.getDate());
	 
	 System.out.println("Current Date: "+getCurrentDate());
	 
	 
	 

    }

}
