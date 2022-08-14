package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        //Divide(7,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> studentFile: studentFiles.entrySet()){
            System.out.println(CheckFileExtension(studentFile.getValue()));

        }

    }

    public static double Divide(int x, int y)
    {
       if (y == 0){
           try {
               throw new ArithmeticException("Can't divide by zero!");
           } catch (ArithmeticException e){
               e.printStackTrace();
           }
       }

       return x/y;

        // Write code here!
    }

    public static int CheckFileExtension(String fileName) {

        int points = 0;

        if (fileName.contains(".java")) {
            points = 1;
        } else if (fileName.equals("") || fileName.equals(null)) {
            try {
                throw new FileNameException("Your file does not have a name.");
            } catch (FileNameException e) {
                e.printStackTrace();
            }
        }

        return points;
    }

}
