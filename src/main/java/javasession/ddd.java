package javasession;

public class ddd {

    public static void main(String[] args) {
        String ch = "Poojjjjapp";
        String ch1 = ch.toLowerCase();
        char[] ch2 = ch1.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch2.length; j++) {
                if (ch2[i] == ch2[j]) {
                    count++;
                    ch2[j] = '0';
                }
            }
            if (ch2[i] != '0') {
                System.out.println(ch2[i] + " " + count);
            }
        }
    }
}
