import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.*;
//goal: imitate python methods
 
public class Main{
    public static void countDownPause(int seconds, int milliseconds) throws InterruptedException{
        System.out.print("Waking in ");
        for(int i = seconds; i > 0; i--) {
            System.out.println(i + "... ");
            Thread.sleep(milliseconds);
        }
    }
    //wip loading screen
    public static void tree(int row) throws InterruptedException {
        for(int i = 0; i < row; i++) {
            for(int j = row-i; j > -1; j--){
                System.out.print(" ");
            }
            for(int g = 0; g <= i; g++) {
                System.out.print("* ");
            }
            System.out.println();
            Thread.sleep(250);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        tree(5);
        while(true) {
            Assistant.call(input);
        }
    }
    
} 
class Product {
    public static final String exp = "what";
    public double price;
    Product(double price) {
        this.price = price;
    }
}