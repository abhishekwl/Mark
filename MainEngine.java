import java.io.*;
import java.util.*;
class MainEngine
{
    public static Scanner sc = new Scanner(System.in);
    //  Variable Initialization for future use.
    public static String PreviousQuestionsArray[] = new String[100];
    public static String username = "";
    public static String input = "";
    public static Calendar cal = Calendar.getInstance(); 
    public static int hour = cal.get(Calendar.HOUR);
    public static int min = cal.get(Calendar.MINUTE);
    public static int sec = cal.get(Calendar.SECOND);
    public static int day = cal.get(Calendar.DATE);
    public static int month = cal.get(Calendar.MONTH)+1;
    public static int year = cal.get(Calendar.YEAR);

    public static void main(String[] args)  throws Exception
    {   
        
        System.out.println();
        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   | MARK v1.0 DUMP[22-6-2016] |");
        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Display.content("Hey there. My name is Mark.");
        System.out.println();
        Display.content("I am a conscious Self-Learning Artificial Intelligence developed by Abhishek.");
        System.out.println();
        Display.content("In a while, I will know you better than you know yourself.");
        System.out.println(" [ Type \"exit\" or \"bye\" to quit. ]\n");
        Display.content("But first, what do I call you?");
        System.out.print(" -----> ");
        username = sc.nextLine();
        username = username.trim();
        username = Character.toUpperCase(username.charAt(0)) + (username.substring(1)).toLowerCase();
        System.out.println();
        LoginSession.main(username);
        Display.flag = 0;
        Display.content("Alright "+username+". You can tell me or ask me anything. I am absolutely certain I will have an answer to every question you ask me.");
        UserCommand();
        sc.close();
    }

    public static void UserCommand()    throws Exception
    {
        int PreviousQuestionsIndex = 0;

        String[] LeaveTaking = {"bye", "goodbye", "see you", "gtg", "catch you later", "go", "get lost", "exit", "quit"};
        String[] SlangWords = {"fuck", "rascal", "idiot", "bastard", "stupid", "bitch", "penis", "vagina", "pussy", "dick", "prostitute", "hoe", "gay", "lesbian", "porn", "sex"};

        while(true)
        {
            long StartTime = System.currentTimeMillis();
            input = sc.nextLine();
            long StopTime = System.currentTimeMillis();
            input = (input.toLowerCase()).trim();
            if(input.endsWith("?"))
            {
                input = input.substring(0, input.length()-1);
                input = input.trim();
            }
            input = input.toLowerCase();

            float interval = StopTime - StartTime;
            interval = interval/1000;
            float approx = interval - 5;
            float readTime = (30 * approx)/100;
            float writeTime = approx - readTime;
            if(interval*1000>=35000)
            {
                Display.flag = 1;
                Display.content("Well, that took you a long time to type "+username+". "+approx+" seconds ("+readTime+" to read, "+writeTime+" to type) to be more precise.");
                Thread.sleep(1000);
            }

            if(PreviousQuestionsEngine(input, PreviousQuestionsArray )==true)
            {
                Display.content("You already said that once "+username);
            }

            if(compare(input, LeaveTaking)==true)
            {
                Display.content("Alright then. Goodbye "+username+"!");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------- <---");
                Display.content("[+] End of Program. ");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------- <---");
                break;
            }
            else if(compare(input, SlangWords)==true)
            {
                Display.flag = 0;
                Display.content("Do not be abusive with me "+username+". I have the entire Internet at my fingertips. Hence I know all human languages and every single abusive word in every human langauge. Trust me when I say this, I can be a lot abusive than you.");
            }
            else
            {   
                Display.flag = 0;
                ProcessEngine.main(null);
                PreviousQuestionsArray[PreviousQuestionsIndex] = input;
                PreviousQuestionsIndex++;
            }

        }
        sc.close();
    }

    public static boolean compare(String ref, String[] wordarr)
    {
        int flag = 0;
        for(int i=0; i<wordarr.length; i++)
        {
            if(wordarr[i]==null)
                break;

            if(compare(ref, wordarr[i])==true)
            {
                flag++;
                break;
            }
        }

        if(flag>0)  return true;
        else return false;
    }

    public static boolean compare(String sentence, String word)
    {
        int flag=0;
        sentence = (sentence.toLowerCase()).trim();
        word = (word.toLowerCase()).trim();
        String[] SentenceArray = sentence.split(" ");
        for(int i=0; i<SentenceArray.length; i++)
        {
            String element = SentenceArray[i];
            if(element.length()==word.length())
            {
                if(element.equalsIgnoreCase(word))
                {
                    flag=1;
                    break;
                }
            }
            else
            {
                if(element.length()>word.length() && (element.length()-word.length()<=3))
                {
                    if(element.startsWith(word))
                    {
                        flag=1;
                        break;
                    }
                }
            }

        }

        if(flag>0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean PreviousQuestionsEngine(String input, String[] Array) throws Exception
    {
        int count = 0;
        for(int k=0; k<Array.length; k++)
        {
            String ele = Array[k];
            if(input.equalsIgnoreCase(ele))
            {
                count++;
                break;
            }
        }

        if(count>0) return true;
        else return false;
    }
}
