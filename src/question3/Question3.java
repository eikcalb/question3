/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Agwa Israel Onome <agwaisraelonome@gmail.com>
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("You must provide user input.");
            System.exit(1);
        }
        String userInput = args[0];
        HashMap hold = new HashMap<String, Integer>(userInput.length());
        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (hold.containsKey(c)) {
                hold.remove(c);
            } else {
                hold.put(c, i);
            }
        }
        Object[] vals = hold.values().toArray();
        Arrays.sort(vals);
        System.out.println(userInput.charAt((int)vals[0]));
    }

}
