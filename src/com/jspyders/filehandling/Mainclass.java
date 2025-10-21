package com.jspyders.filehandling;
import java.io.*;

public class Mainclass {

    final static String  folderName = "javaclass";
    public static void createFolder(){
        File f1 =new File("D:\\"+folderName);
        f1.mkdir();//create a new folder
        System.out.println("Folder created");
    }

    public static void createFile(String fileName){
        File f1 =new File("D:\\"+folderName+"\\"+fileName);
        try
        {
            f1.createNewFile();//creates a new file in given path
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println("Error while creating the file");
        }
    }

    public static void deleteFile(String fileName){
        File f1 =new File("D:\\"+folderName+"\\"+fileName);
        f1.delete();//creates a new file in given path
        System.out.println("File deleted");
    }

    public static void writeDataToFile(String data,String fileName){
        //File f1 =new File("D:\\"+folderName+"\\"+fileName);
        try {
            FileWriter fw = new FileWriter("D:\\"+folderName+"\\"+fileName);
            fw.write(data);
            fw.flush();
            System.out.println("Data written to File");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileData(String fileName){
        try {
            File f1 =new File("D:\\"+folderName+"\\"+fileName);
            int size = (int) f1.length();// find the no. of chars in file

            FileReader fr = new FileReader(f1);// create file reader

            char[] data = new char[size];//array to store all chars of file

            fr.read(data);//read one char at a time from file and store to array

            String stringData =  String.valueOf(data);// convert char array to String

            System.out.println(stringData);
        }
        catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        System.out.println("Program Starts..");
        createFolder();
        createFile("Demo.txt");
        writeDataToFile("this is java class","Demo.txt");
        readFileData("Demo.txt");
        deleteFile("Demo.txt");
        System.out.println("Program Ends..");
    }
}
