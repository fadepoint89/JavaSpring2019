import java.util.*;

public class ClassmateList {
    ArrayList classList;
    
    public void run() {
        classList = new ArrayList();
        
        classList.add("Natasha");
        classList.add("Jordan");
        classList.add("Anu");
        classList.add("Keith");
        classList.add("Andreas");
        
        System.out.println("Using System.out.println to display the students:");
        System.out.println(classList);
        
        System.out.println(""); // separate print methods
        
        System.out.println("Using a for loop to display the students: ");
        for (int counter = 0; counter < classList.size(); counter++) {
            System.out.println(classList.get(counter));
        }
        
        System.out.println(""); // separate print methods
        
        classList.remove("Anu");
        
        System.out.println("Using System.out.println to display the students after removing one student");
        System.out.println(classList);
    }
}