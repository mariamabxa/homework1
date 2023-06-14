public class Counter {
    public static void countWordsAndNumbers(String str) {
        int words = 0;
        int numbers = 0;
        boolean isNumber = true;

        str += ' ';
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                if (isNumber) {
                    numbers++;
                } else {
                    words++;
                    isNumber = true;
                }
            } else if (isNumber) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    isNumber = false;
                }
            }
        }

        System.out.println("Word count: " + words);
        System.out.println("Number count: " + numbers);
    }
}
