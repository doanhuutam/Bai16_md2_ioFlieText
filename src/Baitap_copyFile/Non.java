package Baitap_copyFile;

import Thuchanh2.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Non {
    public static List<String> readFile(String fileBath){
        List<String>num=new ArrayList<>();
        try {
            File file=new File(fileBath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String str = "";
            while((str = bufferedReader.readLine()) != null){
                num.add((str));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return num;
    }
    public static void WriteFile(String filePath , List<String> list){
        try{
            FileWriter wr=new FileWriter(filePath);
            BufferedWriter bufferedWriter=new BufferedWriter(wr);
            for (int i =0 ; i < list.size();i++){
                bufferedWriter.write(list.get(i).toString());
            }
            bufferedWriter.write("sao chép lại");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String>num=readFile("result.txt");
        WriteFile("ahihi.txt",num);
    }
}
