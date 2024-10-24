package com.artamonov;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Reader {
    public static void readFile(Path path) {
        try{
        List<String> contents = Files.readAllLines(path);
 
        //Read from the stream
        for(String content:contents){//for each line of content in contents
            System.out.println(content);// print the line
            }
    
        }catch(IOException ex){
            ex.printStackTrace();//handle exception here
        }
    }
}
