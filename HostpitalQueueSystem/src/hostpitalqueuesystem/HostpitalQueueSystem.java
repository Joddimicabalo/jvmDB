
package hostpitalqueuesystem;

import java.util.*;
public class HostpitalQueueSystem {

   
    public static void main(String[] args) {
      
        

class Patient {
    String name;
    int severity; 

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}



       
        Queue<Patient> arrivalQueue = new LinkedList<>();

       
        PriorityQueue<Patient> treatmentQueue = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));

        // Add patients
        arrivalQueue.add(new Patient("Anna", 3));
        arrivalQueue.add(new Patient("Bob", 1));
        arrivalQueue.add(new Patient("Carla", 2));
        arrivalQueue.add(new Patient("Dave", 1));

        // Add all patients to treatment queue
        treatmentQueue.addAll(arrivalQueue);

        // === Output ===
        System.out.println("=== Arrival Order ===");
        System.out.print("Arrival Order: ");
        System.out.println(arrivalQueue);

        System.out.println("\n=== Treatment Order ===");
        while (!treatmentQueue.isEmpty()) {
            Patient p = treatmentQueue.poll();
            System.out.println("Treating: " + p);
        }
    }
}

        
        
        
        
        
        
    }
    

