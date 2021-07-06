package Thuchanh_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String fileBath){
        try {
        File file=new File(fileBath);
        if (!file.exists()){
            throw new FileNotFoundException();
        }
            BufferedReader br=new BufferedReader(new FileReader(file));
        String line="";
        int sum=0;
        while ((line=br.readLine())!=null){
            System.out.println(line);
            sum+=Integer.parseInt(line);
        }
br.close();
            System.out.println("tổng="+sum);
    } catch (Exception e) {
            System.out.println("file không tồn tại hoặc nội dung có lỗi");
        }

    }
    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file:");
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        ReadFileExample readFileEx=new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
