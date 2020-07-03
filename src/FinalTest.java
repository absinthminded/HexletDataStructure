public class FinalTest {

    public static void main(String[] args) {


        String in = "input string to the method test2";
        char target = 't';


        // BEGIN (write your solution here)
        /*int count = 0;
        for (int i = 0; i < in.length(); i++) {

            if (in.charAt(i) == target) {
                count++;
            }

            System.out.println(count);*/


            char[] inChar = in.toCharArray();
            int count = 0;
            for (int i = 0; i < inChar.length; i++) {
                if (inChar[i] == target) {
                    count++;
                    if (count == 2) {
                        System.out.print(i);
                    }
                }
            }


        }

    }

