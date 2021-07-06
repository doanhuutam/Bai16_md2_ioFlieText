package Baitap_docFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String>readFile(String fileBath){
        List<String>num=new ArrayList<>();
        try {
            File file=new File(fileBath);
            if (!file.exists())
                throw new FileNotFoundException();
            BufferedReader br=new BufferedReader(new FileReader(file));
            String str="";
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("ahhi do ngoc");
        }
        return num;
    }

    public static void main(String[] args) {
        List<String>num=readFile("src/asus.csv");

    }
}
