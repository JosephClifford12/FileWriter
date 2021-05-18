package Inheritance;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class AnimalTest {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        HashMap<String, Animal> animalsMap = new HashMap<>();
        ArrayList<String> listOfNames = new ArrayList<>();

        boolean running = true;
        int input = 0;

        // while the program is running ask the user which animals they would like to input..
        // and their associated qualities: name, age,

        System.out.println("What type of animal do you have");
        int c = 0, d = 0, ObjCounter = 0;
        while (running) {


            String sAnimalType = sc.nextLine();

            if (sAnimalType.equals("Cat")) {
                Cat a = new Cat();


                System.out.println("What is the Cat's name?");
                a.setName(sc.nextLine());

                System.out.println("What is the Cat's age?");
                a.setAge(sc.nextInt());

                System.out.println("Does this Cat have an owner?");
                a.setHasOwner(sc.nextBoolean());

                animalsMap.put(a.getName(), a);
                listOfNames.add(a.getName());

                ObjCounter++;


                a = null;


            } else if (sAnimalType.equals("Dog")) {

                Dog a = new Dog();


                System.out.println("What is this Dog's name?");
                a.setName(sc.nextLine());

                System.out.println("What is this Dog's age?");
                a.setAge(sc.nextInt());

                System.out.println("Does this Dog have an owner?");
                a.setHasOwner(sc.nextBoolean());

                animalsMap.put(a.getName(), a);
                listOfNames.add(a.getName());

                ObjCounter++;


                a = null;                               // empty object after putting into Map and List


            }

            System.out.println("\t\tCurrent List of Names\n");
            for (int i = 0; i < ObjCounter; i++) {
                System.out.print("" + (i + 1) + ") " + listOfNames.get(i) + "\n");
            }

            System.out.println();


            System.out.println("Would you like more info on an Animal");
            String name;
            sc.nextLine();


            if (sc.nextLine().equals("y")) {
                System.out.println("Select a name from the list");
                name = sc.nextLine();
                System.out.println(animalsMap.get(name));  // currently not working properly
            }
            System.out.println("If you are done press -1, otherwise press any number to continue: ");
            input = sc.nextInt();
            if (input == -1) {

                running = false;
                String updatedFileName = "";
                String fileName = "";

                System.out.println("To save names to a new file, type 1 or 2 to update a current file: ");

                sc.nextLine();
                input = sc.nextInt();

                if (input == 0) {
                    continue;
                } else if ((input == 1)) {

                    sc.nextLine();
                    System.out.println("Type new File name: ");
                    fileName = sc.nextLine();
                    if ((!fileName.equals(updatedFileName))) {
                        writeNamesToFile(fileName, listOfNames);


                    }

                } else if ((input == 2)) {

                    sc.nextLine();
                    System.out.println("Type existing file name then the new file name");
                    fileName = sc.nextLine();
                    updatedFileName = fileName;

                    //updateFileContent(fileName, updatedFileName);



                }


            } else {
                System.out.println("What type of animal do you have");
                sc.nextLine();
            }
        } // end while


    } // end main


    public static void writeNamesToFile(String fileName, ArrayList<String> namesList) {

        String s = "";
        for (String name : namesList
        ) {
            s += name + "\n";
        }

        try {


            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("G:\\JavaFileSave\\" + fileName + ".txt"));

            bw.write(s + "\n");
            bw.close();
        } catch (Exception e) {
            return;
        }

    }

    public static void writeChunkToFile(String fileName) {

        String data = "";

        try {


            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("G:\\JavaFileSave\\" + fileName + ".txt"));

            bw.write(data + "\n");
            bw.close();
        } catch (Exception e) {
            return;
        }


    }

    public static String readFile(String fileName, BufferedWriter bw) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("G:\\JavaFileSave\\" + fileName + ".txt"));
            String s;
            String chunk = "";
            while ((s = br.readLine()) != null) {
                bw.write(s);
            }
            br.close();
            return chunk;

        } catch (Exception e) {
            return e.toString();
        }
    }


    public static void updateFileContent(String currentFileName, String newFileName) {


    }


}


