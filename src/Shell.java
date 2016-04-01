/**
 * Created by genius on 4/1/2016.
 */
import org.xml.sax.SAXException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell {
    public static void main(String[] args) throws IOException, SAXException {
        System.out.println("Welcome to bananaPlayer v1.0");
        String commandLine;
        BufferedReader console = new BufferedReader
                (new InputStreamReader(System.in));
        MusicPlayerGUI x = new MusicPlayerGUI();
        String director = ".";
        File dir = new File(director);
        /*
        while (true) {
            System.out.println("You are in " + dir);
            System.out.print("Enter a command: ");
            Command command = new Command();
            commandLine = console.readLine();
            {
            }
            command.parse(commandLine);
            switch (command.getName()) {
                case "list": {
                    List list = new List();
                    list.list(command, dir);
                    break;
                }
                case "cd": {
                    Command.Cd cd = new Command.Cd();
                    dir = cd.setFile(command, dir);
                    break;
                }
                case "play": {
                    Play play = new Play();
                    play.play(command, dir);
                    break;
                }
                case "fav": {
                    Fav fav = new Fav();
                    fav.add(command,dir);
                    break;
                }
                case "info": {
                    Info info = new Info();
                    info.extract(command, dir);
                    break;
                }
                case "report": {
                    Report report = new Report();
                    report.createReport();
                    break;
                }

            }
        }*/
    }
}


