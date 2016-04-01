import java.io.File;
import java.util.ArrayList;

/**
 * Created by genius on 4/1/2016.
 */
public class Command {
    private String name;
    protected ArrayList<String> params;

    protected int getParamSize(){
        return params.size();
    }

    Command() {
        name = new String();
        params = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getParamIndex(int x) {
        return params.get(x);
    }

    public void addName(String p_name) {
        name = p_name;
    }

    public void addParam(String param) {
        params.add(param);
    }

    public void parse(String s){
        if (s.equals("")) {
            System.out.println("Please enter some input :)");
        }
        else if(s.equalsIgnoreCase("exit"))  {
            System.out.println("Program closed");
            System.exit(0);
        }

        String[] lineSplit = s.split(" ");
        addName(lineSplit[0]);
        for (int i=1; i<lineSplit.length; i++)  {
            addParam(lineSplit[i]);
            //System.out.println(getParamIndex(i-1));
        }
    }
    public boolean isMusicFile(File f) {
        if (f.getName().contains(".mp3")) return true;
        if (f.getName().contains(".wav")) return true;
        if (f.getName().contains(".mp4")) return true;
        return false;
    }
    public static class Cd extends Command {
        File f;
        public Cd(){
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
}