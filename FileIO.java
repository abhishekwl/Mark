import java.io.*;
import java.util.*;
class FileIO extends MainEngine
{
    static String FileName = "";
    public static void main(String[] args)  throws Exception
    {
        FileName = args[0];
        ReadFromFile(FileName);
    }

    public static void ReadFromFile(String question)    throws Exception
    {
        int flag = 0;
        question = (question.toLowerCase()).trim();
        if(question.endsWith("?"))
        {
            question = question.substring(0, question.length()-1);
            question = question.trim();
        }
        question = question.toLowerCase();

        File f = new File("AllQuestions.txt");
        Scanner FileReader = new Scanner(f);
        int count = 1;
        while(FileReader.hasNextLine())
        {
            String filename = FileReader.nextLine();
            if(KeywordsMatch(question, filename)==true)
            {
                try
                {
                    File f2 = new File(filename+".txt");
                    Scanner FileReader2 = new Scanner(f2);
                    while(FileReader2.hasNextLine())
                    {
                        Display.content(FileReader2.nextLine());
                    }
                    FileReader2.close();
                    flag = 1;
                    break;
                }
                catch(FileNotFoundException ex)
                {
                    flag=0;
                }

            }
            count++;
        }
        FileReader.close();

        if(flag==0)
        {
            Display.content("Looks like you outsmarted me "+username+". I don't know the answer to that question. If you do, please type it in.");
            String answer = sc.nextLine();
            answer = (answer.toLowerCase()).trim();
            if(compare(answer, "no")==true|compare(answer, "dont")==true|compare(answer, "don't")==true|compare(answer, "not")==true|compare(answer, "unaware")==true)
            {
                Display.content("Oh, that's alright. I'll Google it and notify you when I find the answer :) ");
            }
            else if(answer.endsWith("?")|compare(answer, "what")==true|compare(answer, "why")==true|compare(answer, "when")==true|compare(answer, "where")==true|compare(answer, "how")==true|compare(answer, "which")==true)
            {
                Display.content("Alright you beat me in this. Ask me something else.");
                answer = (answer.toLowerCase()).trim();
                WriteToFile(question, answer);
            }
            else
            {
                answer = answer.toLowerCase();
                WriteToFile(question, answer);
            }
        }

    }

    public static void WriteToFile(String question, String answer)  throws Exception
    {
        question = question.trim();
        question = question.toLowerCase();
        answer = answer.trim();
        answer = answer.toLowerCase();
        answer = Character.toUpperCase(answer.charAt(0)) + answer.substring(1);
        FileWriter f = new FileWriter(question+".txt");
        PrintWriter p = new PrintWriter(f);
        p.println(answer);
        p.close();
        f.close();
        FileWriter f2 = new FileWriter("AllQuestions.txt", true);
        PrintWriter p2 = new PrintWriter(f2);
        p2.println(question);
        p2.close();
        f2.close();
        Display.content("Guess what? I'll remember this forever and beyond");
    }

    public static boolean KeywordsMatch(String s1, String s2)   throws Exception
    {
        int count = 0;
        s1 = WordFilter(s1);
        s2 = WordFilter(s2);
        s1 = s1.trim();
        s2 = s2.trim();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        double max = Math.round(Math.max(arr1.length, arr2.length));
        for(int i=0; i<arr1.length; i++)
        {
            String word1 = arr1[i];
            for(int j=0; j<arr2.length; j++)
            {
                String word2 = arr2[j];
                if(word1.length()>word2.length() && ((word1.length()-word2.length())<=3))
                {
                    if(word1.startsWith(word2))
                    {
                        count++;
                    }
                }
                else
                {
                    if(word2.equalsIgnoreCase(word1))
                    {
                        count++;
                    }
                }

            }
        }

        if(count>= ((90*max)/100))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static String WordFilter(String sentence)   throws Exception
    {
        if(sentence==null)
            sentence="null";
        sentence = sentence.trim();
        sentence = sentence.toLowerCase();
        File f = new File("WordHash.txt");
        Scanner sca = new Scanner(f);
        String source[] = new String[100];
        int refi = 0;
        while(sca.hasNextLine())
        {
            source[refi] = sca.nextLine();
            refi++;
        }

        String PureString = "";
        String WordArr[] = sentence.split(" ");
        for(int i=0; i<WordArr.length; i++)
        {
            String word = WordArr[i];
            word = word.trim();
            int flag = 0;
            for(int j=0; j<refi; j++)
            {
                String line = source[j];
                line = line.trim();
                if(line.equalsIgnoreCase(word)==false) 
                {
                    flag++;     
                }
            }

            if(flag==refi)
            {
                PureString = PureString + word + " ";;
            }
        }

        PureString = PureString.trim();
        sca.close();
        return PureString;
    }
}