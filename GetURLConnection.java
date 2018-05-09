import java.io.*;
import java.util.*;
import java.net.*;
public class GetURLConnection
{
    public static void main(String[] args)
    {
        URL url;
        try
        {
            url = new URL("http://www.answers.com");
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            String filename = "";
            if(Adv.GetCurrentOS().equalsIgnoreCase("linux"))
            {
               filename = "/media/abhishek/Files/test7.html";
            }
            else 
            {
                filename = Adv.GetCurrentWorkingDirectory()+"/test7.html";
            }
            File file = new File(filename);
            if(!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            while((inputLine = br.readLine()) != null)
            {
                bw.write(inputLine);
            }
            bw.close();
            br.close();
            System.out.println("Done");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
