package schildt;


import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text (stop to quit)");
        File f = new File("test5.txt");
        try  {
            do {
                FileWriter fw = new FileWriter(f, true);
                System.out.println(": ");

                str = br.readLine();

                if (str.compareTo("stop") == 0) {
                    fw.close();
                    break;
                }

                if (f.length() > 0) {
                    str = "\r\n" + str;
                }

                fw.write(str);
                fw.close();

            } while (str.compareTo("stop") != 0);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
