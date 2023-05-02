package javasession;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/main/java/javasession/test.txt");
        // takes filename/path and opens it in read mode

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //creates buffering character input stream of default size takes fileReader as input;

        //BufferedReader has method that readLine which reads from input stream one line at a time or
        //so we need string buffer to append the lines until last character is null in file

        StringBuffer stringBuffer = new StringBuffer();
        //empty object of string buffer is created
        // readline returns String hence we need to store it in String variable
        String line;
        while((line=bufferedReader.readLine())!=null){
            stringBuffer.append(line);
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer);
    }
}
