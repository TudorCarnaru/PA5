/**
 * Created by genius on 4/1/2016.
 */
import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Info extends Command{
    private String output;
    public void extract(Command c, File f){

        if (c.getParamSize() != 0) {
            f = new File(c.getParamIndex(0));
            if (!f.exists())
                System.out.println("Folder not found!");
        }

        Mp3File mp3file = null;
        try {
            mp3file = new Mp3File(f.getName());
            System.out.println(mp3file.getId3v2Tag().getTitle());
        } catch (UnsupportedTagException | InvalidDataException  e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("File not found.");
        }  catch (IOException ex) {
            Logger.getLogger(Info.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (mp3file.hasId3v1Tag()) {
            ID3v1 id3v1Tag = mp3file.getId3v1Tag();
            System.out.println("Title: " + id3v1Tag.getTitle());
            System.out.println("Track: " + id3v1Tag.getTrack());
            System.out.println("Artist: " + id3v1Tag.getArtist());
            System.out.println("Album: " + id3v1Tag.getAlbum());
            System.out.println("Year: " + id3v1Tag.getYear());
            System.out.println("Genre: " + id3v1Tag.getGenre() + " (" + id3v1Tag.getGenreDescription() + ")");
            System.out.println("Comment: " + id3v1Tag.getComment());
        }
        else if(mp3file.hasId3v2Tag())
        {
            ID3v1 id3v1Tag = mp3file.getId3v2Tag();
            System.out.println("Track: " + id3v1Tag.getTrack());
            System.out.println("Artist: " + id3v1Tag.getArtist());
            System.out.println("Title: " + id3v1Tag.getTitle());
            System.out.println("Album: " + id3v1Tag.getAlbum());
            System.out.println("Year: " + id3v1Tag.getYear());
            System.out.println("Genre: " + id3v1Tag.getGenre() + " (" + id3v1Tag.getGenreDescription() + ")");
            System.out.println("Comment: " + id3v1Tag.getComment());
        }
    }

    public String extract(File f){

        if (!f.exists())
            System.out.println("Folder not found!");

        Mp3File mp3file = null;
        try {
            mp3file = new Mp3File(f.getName());
            System.out.println(mp3file.getId3v2Tag().getTitle());
        } catch (UnsupportedTagException | InvalidDataException  e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("File not found.");
        }  catch (IOException ex) {
            Logger.getLogger(Info.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (mp3file.hasId3v1Tag()) {
            ID3v1 id3v1Tag = mp3file.getId3v1Tag();
            output ="Title: " + id3v1Tag.getTitle();
            output += "\n" + "Track: " + id3v1Tag.getTrack();
            output += "\n" + "Artist: " + id3v1Tag.getArtist();
            output += "\n" + "Album: " + id3v1Tag.getAlbum();
            output += "\n" + "Year: " + id3v1Tag.getYear();
            output += "\n" + "Genre: " + id3v1Tag.getGenre() + " (" + id3v1Tag.getGenreDescription() + ")";
            output += "\n" + "Comment: " + id3v1Tag.getComment();
        }
        else if(mp3file.hasId3v2Tag())
        {
            ID3v1 id3v1Tag = mp3file.getId3v2Tag();
            output ="Track: " + id3v1Tag.getTrack();
            output += "\n" + "Artist: " + id3v1Tag.getArtist();
            output += "\n" + "Title: " + id3v1Tag.getTitle();
            output += "\n" + "Album: " + id3v1Tag.getAlbum();
            output += "\n" + "Year: " + id3v1Tag.getYear();
            output += "\n" + "Genre: " + id3v1Tag.getGenre() + " (" + id3v1Tag.getGenreDescription() + ")";
            output += "\n" + "Comment: " + id3v1Tag.getComment();
        }
        return output;
    }
}