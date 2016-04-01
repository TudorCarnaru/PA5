/**
 * Created by genius on 4/1/2016.
 */
import java.awt.*;
import java.io.*;


public class Report extends Command{
    File fileReport=new File("report.html");
    public void createReport() throws IOException{
        try{
            fileReport.delete();
            FileWriter fileWriter=new FileWriter(fileReport,true);
            //buffer writer
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("<!DOCTYPE html><html><head>"
                    +"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\"> "
                    + "<body><div class=\"wrapper\"><div class=\"container\"><h1 class=\"text-center\">Favorite songs:</h1>");
            //reading the data buffer
            FileReader fileReader=new FileReader("favorites.txt");
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line = null;
            while((line =bufferedReader.readLine())!=null)
            {
                bufferedWriter.write("<ol>");
                bufferedWriter.write("<li>"+line+"</li>");
                bufferedWriter.write("</ol>");
            }
            bufferedReader.close();
            bufferedWriter.write("<br/><h5 class=\"text-center\">Report by edufcknd and noru </h5></div></div></body></html>");
            bufferedWriter.close();
            Desktop desktop=Desktop.getDesktop();
            try {
                desktop.open(fileReport);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        catch(IOException ex){
            System.out.println(
                    "Eroare la scrierea reportorului '"
                            + fileReport.getName() + "'");
        }
    }
}
