import java.util.*;

public class Tester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input = "input   string to the   method test2";

        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreElements()) {
            String charArray = tokenizer.nextElement().toString();

            char[] charArray1 = charArray.toCharArray();

            for (int i = 0; i < charArray1.length / 2; i++) {
                char tmp = charArray1[i];
                charArray1[i] = charArray1[charArray1.length - i - 1];
                charArray1[charArray1.length - i - 1] = tmp;
            }
            String finished  = new String(charArray1);

          System.out.print(finished + " ");

        }


    }
}
