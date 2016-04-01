/**
 * Created by genius on 4/1/2016.
 */
import java.io.File;

public class CD extends Command {
    File f;
    public CD(){
    }

    public File setFile(Command c, File f){
        if (c.getParamSize()!=0) {
            f = new File(c.getParamIndex(0));
            if (!f.exists())
                f.mkdir();
        }
        else
        {
            String s = f.getAbsolutePath();
            String goBack;
            goBack=s.substring(0,s.lastIndexOf('\\'));
            f = new File(goBack);
        }
        return f;
    }
}

