import java.io.*;
public class File {
    private String fileName;
    private String message;
 
    File(String file, String msg) {
        this.fileName = file;
        this.message = msg;
    }
    File(String file) {
        this.fileName = file;
        this.message = "";
    }

    //no object instance required, call them instead of creting own
    public static void readFile(String fileName){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String s;
            
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch(Exception ex) {
            return;
        } 
    }
    public static void writeToFile(String fileName, String message) {
        try {
            BufferedWriter bw = new BufferedWriter (new FileWriter(fileName));
            bw.write(message);
            bw.close();
        } catch(Exception x) {
            return;
        }
    }
}
