import java.io.IOException;

public class DemoThrows { // Changed class name from "Demo Throws" to "DemoThrows"

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        System.out.println("Enter a character: ");
        char c = (char) System.in.read(); // checked Exception
        System.out.println("Entered character c = " + c);
    }
}
