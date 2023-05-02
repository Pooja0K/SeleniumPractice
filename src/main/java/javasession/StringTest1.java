package javasession;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StringTest1 {

    public static String readFile(String filename){
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);

         //String a= String.valueOf(bufferedReader.lines());
        StringBuffer stringBuffer = new StringBuffer();

        String line;
        int count=0;

        while (true){
            try {
                if (!((line=bufferedReader.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

             stringBuffer.append(line);
            stringBuffer.append(" ");
            count++;

        }
        System.out.println("Number of lines is: " +count);
        return stringBuffer.toString();

    }

    public static  Map<String, Integer> countNoOfWords(String output){
        String[] fileoutput =output.split(" ");
        int a= fileoutput.length;
        System.out.println(a);
        Map<String, Integer> map= new HashMap<String,Integer>();

        for (String s: fileoutput){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);

            }else {
                map.put(s,1);
            }
        }

        return map;

    }

    public static  Map<Character, Integer> countNoOfCharacters(String output){
        String ans=output.replaceAll(" ", "");
        char[] ch= ans.toCharArray();
        System.out.println(ch.length);
        Map<Character, Integer> map= new HashMap<Character,Integer>();

        for (Character c: ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }else {
                map.put((c),1);
            }
        }

        return map;

    }
    public static void main(String[] args)  {
        String output = readFile("src/main/java/javasession/test.txt");
        //System.out.println(output);
        System.out.println(countNoOfCharacters(output));
        System.out.println(countNoOfWords(output));
    }

}