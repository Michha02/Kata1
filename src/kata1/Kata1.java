package kata1;

import java.time.LocalDate;


public class Kata1 {

    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(1996,11,7);
                
        Person person = new Person("Miguel", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                           + " años");
    }
    
}
