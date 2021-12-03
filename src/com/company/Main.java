package com.company;

//imports

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

    private static ArrayList<String> Books = new ArrayList<>();//arraylist for books
    private static File bookfile = new File("bookreg.txt");
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) { // main code

        // Library system program
        //stores an unspecified no. of books including: Book title, ISBN, author, Genre

        int bookaddition = Integer.parseInt(getInput("How many books do you want to add? : "));
        for (int i = 0; i < bookaddition; i++){
            Books.add(Bookdetails());

        }
        Detailsoutput();
    }

    // methods

    public static String getInput(String prompt) { // getInput method for the other methods

        System.out.println(prompt);
        return input.nextLine();
    }

    public static String Bookdetails() { //asks for user input for details

         String booktitle = getInput("Input book title : ");
         int ISBN = Integer.parseInt(getInput("Input ISBN : "));
         String author = getInput("Input author name : ");
         String genre = getInput("Input genre : ");
         return (booktitle + "," + author + "," + genre + "," + ISBN); //it only prints out the ISBN and nothing else, pls fix
    }

    public static void Detailsoutput() { // puts information into the Books array and prints book details
        for (int i = 0; i < Books.size(); i++) {
            String[] Bookdetails = Books.get(i).split(",");
            System.out.println(Bookdetails[2]);
        }


    }


    public static void filewriter() { //filewriter that can (hopefully) write the information into a txt file.
        try {
            FileWriter filewrite = new FileWriter(bookfile.getName(), false);
            filewrite.write("bababooey"); //just testing to see if the filewrite works
            filewrite.close();

        } catch (IOException e) {
            System.out.println("error!");
        }
    }}




