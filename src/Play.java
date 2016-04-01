/**
 * Created by genius on 4/1/2016.
 */
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
public class Play extends Command{
    public void play  (Command command, File dir){
        String songName=new String();
        songName+=command.getParamIndex(0);
        for (int i=1;i<command.getParamSize();i++) {
            songName+=" ";
            songName += command.getParamIndex(i);
        }
        File f = new File(dir+"/"+songName);
        if (f.exists()){
            Desktop desktop=Desktop.getDesktop();
            try {
                desktop.open(f);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        else
            System.out.println("The file "+songName+" does not exist.");
    }

}
