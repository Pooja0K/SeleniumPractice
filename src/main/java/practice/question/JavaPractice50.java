package practice.question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaPractice50 {
    public static String readFile(String filename) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        int count = 0;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stringBuffer.append(line);
            stringBuffer.append(" ");
            count++;
        }
        System.out.println("Line count is: " + count);
        return stringBuffer.toString();
    }

    public static void charCount(String output) {
        int count = 0;
        for (int i = 0; i <= output.toCharArray().length - 1; i++) {
            if ((output.charAt(i) >= 48) && output.charAt(i) >= 57) {
                count++;
            }
        }
        System.out.println("Char count is: " + count);
    }

    public static void wordCount(String output) {
        int count = 0;
        String[] str = output.split(" ");
        for (int i = 0; i <= str.length - 1; i++) {
            String str1 = str[i].replaceAll("\\d", "");
            if (!str1.isEmpty()) {
                count++;
            }
        }
        System.out.println("Word count is:" + count);
    }

    public static void main(String[] args) throws IOException {
        String output = readFile("D:\\SeleniumPractice\\src\\main\\java\\practice\\question\\in.txt");
        charCount(output);
        wordCount(output);
    }
}
