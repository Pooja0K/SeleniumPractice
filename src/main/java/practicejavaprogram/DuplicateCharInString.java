package practicejavaprogram;

public class DuplicateCharInString {

    public void checkDuplicateCharInString(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i + 1; j <= str.length()-1; j++) {
                if (ch[i] == ch[j]) {
                    int count = 1;
                    count++;
                    System.out.println(ch[i] + "-->" + count);
                }
            }
        }
    }

    public static void main(String[] args) {

        DuplicateCharInString dup = new DuplicateCharInString();
        dup.checkDuplicateCharInString("electrical");

    }
}



