package pkgMain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import pkgClass.Employee;
import pkgClass.Person;

public class run_class {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String d = "2020-04-21";
        
        
        Person p = new Person();
        Person q = new Person();
        p.DoB = df.parse(d);
        q.DoB = df.parse(d);
        
        q.setName("masha");
        System.out.println( " standard = " + new Person().toStringObj());
        Person p_new = new Person(1,"nikita");
        
        
        if(p.equals(q)){
            System.out.println("objects equal");
        } else{
            System.out.println("objects not equal");
        }
        
        System.out.println(p);
        System.out.println(q);
        
        System.out.println(p_new.toStringObj());
        System.out.println(p.toStringObj());
        System.out.println(q.toStringObj());
        
        
        System.out.println(p.daysToBD());
        
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        
        Employee e = new  Employee("sberbank");
        
      // p.setId(5);
        
        System.out.println(p_new.toStringObj());
        System.out.println(p.toStringObj());
        System.out.println(q.toStringObj());
       
       
              
        System.out.println("Done!");
    }
    
}
