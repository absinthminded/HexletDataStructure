public class Test {

    public static void main(String[] args) {

        // BEGIN (write your solution here)
        final String inputString = "input string";
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
        }


        System.out.println(charArray);
        // END


    }
}


