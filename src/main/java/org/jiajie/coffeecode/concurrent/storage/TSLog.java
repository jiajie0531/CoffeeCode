package org.jiajie.coffeecode.concurrent.storage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TSLog {
    private PrintWriter writer = null;

    // initialization writer column
    public TSLog(String filename) {
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // write log
    public void println(String s) {
        writer.println(s);
    }

    // close log
    public void close(){
        writer.println("=== End of log ===");
        writer.close();
    }
}
