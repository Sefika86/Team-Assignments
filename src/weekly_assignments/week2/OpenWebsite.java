package weekly_assignments.week2;

import java.io.IOException;

public class OpenWebsite {
    //Write a program to open a website in System Default Browser
    public static void main(String[] args) throws IOException {


        Runtime rt = Runtime.getRuntime();
        String url = " ";
        rt.exec("open " + url);
    }
}