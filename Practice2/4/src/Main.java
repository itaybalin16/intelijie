/**
 * Write program that gets string and a letter from the user
 * and prints how many times the letter presents in the string
 */
//printCharCount(scan);



public class Main {
    public static void main(String[] args) {
        String str = "abuyy";
        char ch = 'o';
        int counter = 0;

        for (int i = 0; i < str.length(); i++){
            char tempCha = str.charAt(i);
            if  (tempCha == ch){
                counter += 1;
            }
            else {
            }
        }
        if (counter > 0){
            System.out.println(counter);
        }
        else{
            System.out.println(ch + " isnt in " + str);
        }
    }
}