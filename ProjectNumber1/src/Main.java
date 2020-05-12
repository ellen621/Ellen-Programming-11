public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                answer++;
            }
        }
        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                answer++;
            }
        }

        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        String answer = "";
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            switch (s.charAt(i)) {
                case i == 0:
                    answer = s.substring(i);
                    break;
                case s.charAt(i) >= s.charAt(i-1) && i != 0:

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "aabcde";
        System.out.println('a' < 'b');
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
    }
}
