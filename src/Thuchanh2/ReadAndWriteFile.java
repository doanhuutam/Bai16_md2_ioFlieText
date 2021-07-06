package Thuchanh2;

import Thuchanh_1.ReadFileExample;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number=new ArrayList<>();
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("file không tồn tại");
        }
        return number;
    }
public void writeFile(String filePath,int max)  {
        try {
            FileWriter writer=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("giá trị lớn nhất là:"+max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
public static int finMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }

        }
        return max;
}

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> number=readAndWriteFile.readFile("src/Thuchanh2/number.txt");
        int maxvalue=finMax(number);
        readAndWriteFile.writeFile("result.txt",maxvalue);
    }


}
