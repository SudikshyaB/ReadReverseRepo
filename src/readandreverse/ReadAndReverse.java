/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readandreverse;

import java.util.Scanner;

/**
 *
 * @author shaim
 */
public class ReadAndReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hiiii
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a name: ");
        
        String name = sc.nextLine();
        
       // System.out.println("You entered " + name);
        //This ia change im addin
        ///Change comment
        char[] nameInChar = new char[name.length()];
        
        // populate the arraty 
        for(int i=0; i <= name.length()-1 ; i++ )
            nameInChar[i] = name.charAt(i);
        /*
        //Default change
        // verify the array was populated properly
        for(int i=0; i< name.length() ; i++)
            System.out.println(nameInChar[i]);
        */
        System.out.print("In reverse Now:");
        
        for(int i=nameInChar.length - 1 ; i >= 0 ; i--)
            System.out.print(nameInChar[i]);
         System.out.print("reverseds Now:");
        
    }
    
}
