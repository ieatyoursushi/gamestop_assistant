
public class RandomString {
    //initialize values
    private int stringLength;
    
    RandomString(int length) {
        stringLength = length;
    }
    RandomString() {
        stringLength = 10;
    }
    //letters only generation quick method
    public static String generate(int length) {
        final String letters = "abcdefghijklmnopqrstuvwxyz";
        String newString = "";
        for(int i = 0; i < length; i++) {
            newString += String.valueOf(letters.charAt(Random.range(0, letters.length())));
        }
        return newString;
    }
}
