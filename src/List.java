/**
 * Created by genius on 4/1/2016.
 */
import java.io.File;
public class List extends Command {

    public void list(Command c, File dir) {
        boolean foundSong = false;
        if (c.getParamSize() != 0) {
            dir = new File(c.getParamIndex(0));
            if (!dir.exists())
                System.out.println("Folder not found!");
        }
        for (File f : dir.listFiles()) {
            if (isMusicFile(f)) {
                System.out.println("");
                System.out.println(f.getName());
                System.out.println("");
                foundSong = true;
            }
        }
        if (!foundSong)
            System.out.println("There are no songs in this file");
    }
}

