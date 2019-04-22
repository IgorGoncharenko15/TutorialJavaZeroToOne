package pkgMain;

import java.text.ParseException;
import java.text.SimpleDateFormat;



public class run {

    public static void main(String[] args) throws ParseException {
        
        // 1. Variables
        
        //Integer
        int i, j;
        //Long
        long i_l;
        //Double
        double x, y;
        
        //Boolean
        boolean a, b;
        
        String c, d;
        
        java.util.Date date = new java.util.Date();
        System.out.println(date + "  " + date.getTime());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        d = "2019-01-01";
        date = df.parse(d);
        System.out.println(date + "  " + date.getTime());
        System.out.println(Math.pow(10, 2) + " " + Math.E);
        System.out.println("Done!");
    }
    
}
