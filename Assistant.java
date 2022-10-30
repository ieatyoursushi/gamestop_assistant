import java.util.Scanner;

public class Assistant {
    Assistant() {
        
    }
    public static void call(Scanner input) throws InterruptedException {
        System.out.println("Please select a catagory below: \nAsk a question [q]\nView products[p]\nMake a suggestion [s] ");
        String userInp = input.nextLine();
        if(userInp.equals("q")) {
            System.out.println("Ask away");
            String questio = input.nextLine();
        } else if (userInp.equals("p")) {
            System.out.println("Products: duct tape");
        }  
        System.out.println("----------------------------------------");
    }
}