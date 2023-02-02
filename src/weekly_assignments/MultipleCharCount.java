package weekly_assignments;

public class MultipleCharCount {
    public static void main(String[] args) {
        //Write a function that will return the count of distinct case-insensitive alphabetic characters
        // that occur more than once in the input string. The input string can be assumed to
        //contain only alphabets (both uppercase and lowercase).

        String input = "Indivisibilities";
        input = input.toLowerCase();

        String multipleChars = "";

        int output ;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int frequency = 0;
            for (int j = 0; j < input.length(); j++) {
                if (ch == input.charAt(j)) {
                    frequency++;
                }
            }
            if(frequency > 1 && (!multipleChars.contains(ch + ""))){
               multipleChars += ch;
            }


        }
        //System.out.println(multipleChars);
        output = multipleChars.length();
        System.out.println(output);
    }
}




