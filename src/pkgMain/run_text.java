package pkgMain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pkgClass.Person;

public class run_text {

    public static void main(String[] args) throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/igor/Documents/test.txt"));
        
        for (int i = 0; i < 10; i++) {
            bw.write(""+ i);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        
        List<Person> list_int = new ArrayList<Person>();
        
        BufferedReader br = new BufferedReader(new FileReader("/home/igor/Documents/test.txt"));
        String line = br.readLine();
        while (line != null){
            list_int.add(new Person(Integer.parseInt(line)+1,"nikita #" + line));
            line = br.readLine();
        }
        
        System.out.println(list_int.get(4).toStringObj());
        
        System.out.println("Done!");
    }
    
}
