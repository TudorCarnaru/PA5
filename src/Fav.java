/**
 * Created by genius on 4/1/2016.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Fav extends Command {
    private PrintWriter f;

    private void addRecord(File s)
    {
        f.append(s.getName()+'\n');
        f.close();
    }

    public void add(Command command, File dir) {
        File songName = new File(dir+ "/" + command.getParamIndex(0));
        if(isMusicFile(songName)){
            try{
                f = new PrintWriter(new FileWriter("favorites.txt", true));
            }
            catch (Exception e){
                System.out.println("Can't open favorites");
            }
            addRecord(songName);
        }
    }
    public void add(File dir) {
        if(isMusicFile(dir)){
            try{
                f = new PrintWriter(new FileWriter("favorites.txt", true));
            }
            catch (Exception e){
                System.out.println("Can't open favorites");
            }
            addRecord(dir);
        }
    }

}

