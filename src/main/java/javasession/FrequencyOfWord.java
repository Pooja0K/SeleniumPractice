package javasession;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {

    public static String getFileContent(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            stringBuffer.append(line);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public static int calculateFrequencyOfWord(String input, String word){
        String [] s = input.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String str:s){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }
            else {
                map.put(str,1);
            }
        }
        return map.get(word);
    }

    public static void main(String[] args) throws IOException {
        String input=getFileContent("src/main/java/javasession/test.txt");
        System.out.println(input);
        System.out.println(calculateFrequencyOfWord(input,"abc"));
    }
}
