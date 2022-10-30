
public class Random {
    Random() {
        
    }
    public static int range(int min, int max) {
        int range = max - min;
        return (int)((Math.random() * range) + min);
    }
}