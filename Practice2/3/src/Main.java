
/**
 * Write program that gets array of strings and string
 * and return first index of the string or returns -1 if string not found.
 */
//String[] names = {"Yosi", "Moshe", "Avi", null,"Nissim"};
//int index = getValIndex(names, "Maxim");
//        System.out.println("Index: " + index);


public class Main {
    public static void main(String[] args) {
    String str = "word";
    String[] strings = {"kaki", "pipi", "word"};
    int soultion = findWord(strings, str);
    System.out.println(soultion);
    }

    public static int findWord(String[] strings, String str) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
