import java.io.*;
import java.util.*;
import java.net.*;
class WebContentSearch
{
    public static void main(String subject)  throws Exception
    {
        String original = subject;
        String search = FileIO.WordFilter(subject);
        search = search.substring(search.indexOf(' ')+1);
        subject = "";
        subject = subject + Character.toUpperCase(search.charAt(0));
        for(int i=1; i<search.length(); i++)
        {
            if(search.charAt(i-1)==' ')
            {
                subject = subject + Character.toUpperCase(search.charAt(i));
            }
            else subject = subject + search.charAt(i);
        }
        URL url = new URL("https://en.wikipedia.org/w/index.php?action=raw&title="+subject.replace(" ","_"));
        String text = "";
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader((url.openConnection()).getInputStream()));
            String line = null;
            while(null!=(line = br.readLine()))
            {
                line = line.trim();
                if(!line.startsWith("|") && !line.startsWith("{") && !line.startsWith("}") && !line.startsWith("<center>") && !line.startsWith("---"))
                {
                    text = text + line;
                }

                if(text.length()>200)
                {
                    break;
                }
            }
            
            Clean(text);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public static void Clean(String text)   throws Exception
    {
        String s = "";
        for(int i=0; i<text.length(); i++)
        {
            char ch = text.charAt(i);
            if(ch=='<')
            {
                if(text.indexOf('>', i+1)>0)
                {
                    int nextch = text.indexOf('>', i+1);
                    String sub = text.substring(i, nextch);
                    if(sub.contains("url")==false && sub.contains("URL")==false && sub.contains("ref")==false && sub.contains("!")==false)
                    {
                        s = s + sub;
                    }
                    i = nextch;
                }
            }
            else if(ch=='(')
            {
                if(text.charAt(i+1)=='(' | text.charAt(i+1)=='{' | text.charAt(i+1)=='[')
                {
                    if(text.indexOf(')', i+1)>0)
                    {
                        int nextch = text.indexOf(')', i+1);
                        i = nextch;
                    }
                }
            }
            else if(ch=='{')
            {
                if(text.indexOf('}', i+1)>0)
                {
                    int nextch = text.indexOf('}', i+1);
                    String sub = text.substring(i, nextch);
                    if(sub.contains("url")==false && sub.contains("URL")==false && sub.contains("ref")==false)
                    {
                        s = s + sub;
                    }
                    i = nextch;
                }
            }

            else if(ch=='|')
            {
                int nextch = text.indexOf(' ', i+1);
                i = nextch;
                s = s + " ";
            }
            else if(ch=='$')
            {
                s = s +" $ ";
            }
            else 
            {
                if(Character.isLetter(ch) | Character.isDigit(ch) | ch==' ' | ch==':' | ch=='\"' | ch=='(' | ch==')' | ch=='-' | ch==','| ch=='.')
                    s = s + ch;
            }
        }

        Display.content(s);
    }
}
