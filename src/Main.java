import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/wangkai/isinna-java/src/test.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}
