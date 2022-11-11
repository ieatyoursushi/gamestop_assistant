import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class Assistant {
    Assistant() {
        
    }
    public static void timedMsg(String msg, int milliseconds) throws InterruptedException {
        for(int i = 0; i < msg.length(); i++) {
            System.out.print(msg.charAt(i));
            Thread.sleep(milliseconds);
        }
    }
    public static void call(Scanner input) throws InterruptedException {
        String options = "Please select a catagory below: ";
        String category = "\nAsk a question [q]\nView products[p]\nMake a suggestion [s] ";
        timedMsg(options, 50);
        timedMsg(category, 10);
        System.out.println();
        
        String userInp = input.nextLine();
        if(userInp.equals("q")) {
            timedMsg("Ask Away: ", 50);
            String questio = input.nextLine();
        } else if (userInp.equals("p")) {
            System.out.println("Products: duct tape");
        }  
        System.out.println("----------------------------------------");
    }
}