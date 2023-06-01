package programPractice;


//Print tHe the index on which 'B' character is located.			

public class CharIndexofString {
	public static void main(String[] args) {
        String st = "FACEBOOK";
        int index = 4; // Index of the character to retrieve
        char ch = getCharAtIndex(st, index);
        System.out.println("Character at index " + index + " is " + ch);
    }

    public static <T> T getCharAtIndex(String str, int index) {
        return (T) Character.valueOf(str.charAt(index));
    }

}
