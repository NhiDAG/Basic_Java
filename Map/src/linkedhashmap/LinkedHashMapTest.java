
package linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    
    public static void main(String[] args) {
        
          LinkedHashMap<String, Integer> student = new LinkedHashMap<>();
          student.put("Nguyen A", 19);
          student.put("Vu E", 19);
          student.put("Huynh B", 20);
          student.put("Le C", 19);
          student.put("Phung D", 20);
         
          student.remove("Phung D"); 

          student.replace("Huynh B", 19);
          
          System.out.println("Output: ");
          student.forEach((key, value) -> System.out.println("Student: "+key + " is " + value + " years old." ));
          
          student.clear();
          System.out.println("Output: ");
          student.forEach((key, value) -> System.out.println("Student: "+key + " is " + value + " years old." ));
    }
}
    