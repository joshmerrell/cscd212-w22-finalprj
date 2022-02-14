package cscd212.iodecorator;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void readNoArgs() {
        UpperCaseInputStream stream = new UpperCaseInputStream(System.in);
        String out = "";
        try {
            System.out.print("Reading from System.in stream.read() with no arguments: ");
            int buf = -1;
            do {
                buf = stream.read();
                out += (char)buf;
            } while(buf > -1 && buf != '\n');
            System.out.printf("Uppercase string from readNoArgs: %s\n", out);
        } catch(IOException ioe) {
            System.err.println(ioe);
            System.exit(1);
        }
    }
    public static void readArgs() {
        UpperCaseInputStream stream = new UpperCaseInputStream(System.in);
        byte[] buf = new byte[1];
        String output = "";
        try {
            System.out.print("Reading from System.in via stream.read() with arguments: ");
            int read = 0;
            do {
                read = stream.read(buf, 0, 1);
                output += (char)buf[0];
            } while(read > 0 && buf[0] != '\n');
        } catch (IOException ioe) {
            System.err.println(ioe);
            System.exit(1);
        }
        System.out.printf("Upper case string from readArgs: %s\n", output);
    }
    public static void main(String[] args) {
        readNoArgs();
        readArgs();
     }
}
