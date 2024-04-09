/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connector;
import java.util.Map;
import org.jpl7.*;


public class Connector {

    
    public static void main(String[] args) {
        Query.hasSolution("consult('assignment.pl')"); // Load your Prolog file

        // Assume symptoms are collected from the user and stored in a list or array
        String[] symptoms = {"fever", "cough", "fatigue"}; // Example symptoms

        // Construct query with the collected symptoms
        String query = "predict_disease([" + String.join(",", symptoms) + "], Disease)";

        // Send query to Prolog and retrieve the response
        Query prologQuery = new Query(query);
        if (prologQuery.hasSolution()) {
            // Extract disease from Prolog response
            Term diseaseTerm = prologQuery.oneSolution().get("Disease");
            String disease = diseaseTerm.toString(); // Assuming disease is returned as a string
            System.out.println("Predicted Disease: " + disease);
        } else {
            System.out.println("No solution found.");
        }
    }
    }
    
    

