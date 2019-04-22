package pkgClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    
    //public static int id = 0;    
    public int id = 0;    
    public String name = "igor";
    public  double salary = 100500;
    public java.util.Date DoB = new Date();

   
    
    public int getId() {
        return this.id;
    }
    /*
    public void setId(int id) {
        Person.id = id;
    }
    */
    
    
    public double daysToBD(){
        Date currentDate = new Date();
        return  Math.floor( (DoB.getTime()-currentDate.getTime() ) / 1000 / 3600 / 24);
        
    }




    public boolean equals(Person obj) {
        return (this.DoB.getTime() == obj.DoB.getTime());
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public String toStringObj() {
        return "Person{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", DoB=" + DoB + '}';
    }

    public void setName(String name) {
        this.name = name;
    }
    


    
    
}
