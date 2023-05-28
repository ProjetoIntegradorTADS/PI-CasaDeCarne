package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Filri
 */
public class Data {
   
   public static void main(String args[])throws ParseException {
      Date date = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
       String str = formatter.format(date);
      System.out.print("Current date: "+str);
   }
}

