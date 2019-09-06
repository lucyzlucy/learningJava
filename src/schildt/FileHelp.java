package schildt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHelp {
    public static void main(String[] args) {
        Help1 obj = new Help1("topics.txt");
        String topic;

        System.out.println("Try the help system. Enter stop to end");

        do {
            topic = obj.getSelection();

            if (!obj.helpOn(topic)){
                System.out.println("Topic not found");
            }
        } while (topic.compareTo("stop") != 0);
    }
}

class Help1 {
    String helpfile;

    Help1(String fname) {
        helpfile = fname;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;
        //Open the file
        try (BufferedReader rd = new BufferedReader(new FileReader(helpfile))) {
            do { //read characters until # is found
                ch = rd.read();
                if (ch == '#') {
                    topic = rd.readLine();
                    if (what.compareTo(topic) == 0) { // found topic
                        do {
                            info = rd.readLine();
                            if (info != null) {
                                System.out.println(info);
                            }
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException e) {
            System.out.println("Error accessing help file");
            return false;
        }
        return false; //topic not found
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter topic");
        try {
            topic = br.readLine();
        }
        catch ( IOException e){
            System.out.println("Error reading console");
        }
        return topic;
    }
}
