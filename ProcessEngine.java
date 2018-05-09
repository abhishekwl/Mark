import java.io.*;
import java.util.*;
/**
 * Write a description of class ProcessEngine here.
 * CoreProcessor
 * @ Abhishek 
 * @ 23-6-2016 [4:37]
 */
public class ProcessEngine extends MainEngine 
{
    public static void main(String[] args)  throws Exception
    {
        try
        {
            String input = MainEngine.input;
            String secret = "";
            String username = MainEngine.username;
            Scanner sc = MainEngine.sc;
            input = (input.toLowerCase()).trim();
            if(input.endsWith("?"))
            {
                input = input.substring(0, input.length()-1);
                input = input.trim();
            }
            input = input.toLowerCase();

            String date = day+"-"+month+"-"+year;
            String Time = "";
            if(min==0)
                Time = "The clock  just stroke "+hour;
            else if(min==30)
                Time = "Half past "+hour;
            else if(min>30)
            {
                min = 60-min;
                hour++;
                Time = min+" minutes to "+hour;
            }
            else if(min<30)
            {
                Time = min+" minutes past "+hour;
            }

            String Array1[] = {"hello", "hi", "hey"};
            String InsultArray[] = {"lame","annoy","amateur","boring","rude"};
            String NumberArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            if(MainEngine.compare(input, Array1)==true)
            {
                Display.content("Hello "+username);
            }
            else if(input.equalsIgnoreCase("so"))  
            {
                Display.content("What so?");
            }
            else if(input.equalsIgnoreCase("what")|input.equalsIgnoreCase("why")|input.equalsIgnoreCase("who")|input.equalsIgnoreCase("when")|input.equalsIgnoreCase("how")|input.equalsIgnoreCase("will"))
            {
                Display.content("What "+input+"?");
            }
            else if(compare(input, "what")==true && compare(input, "up")==true)
            {
                Display.content("Me? I am just absorbing the entire Internet.");
            }
            else if((compare(input, "what")==true) && (compare(input, "date")==true))
            {
                Display.content(day+"-"+month+"-"+year);
            }
            else if((compare(input,"show")==true) && (compare(input,"me")==true))
            {
                Display.content("Unfortunately "+username+", I am not open-source.");
            }
            else if((compare(input, "you")==true) && (MainEngine.compare(input, InsultArray)==true))
            {
                Display.content("Thank you, although I cannot compete with you in that ");
            }
            else if((compare(input, "bring")==true) && (compare(input, "me")==true))
            {
                Display.content("I should have believed Google when she told me that you were lazy.");
            }
            else if((compare(input, "what")==true) && (compare(input, "time")==true))
            {
                Display.content(Time);
            }
            else if((compare(input, "teach")==true) && (compare(input, "you")==true))
            {
                Display.content("Sure "+username+", I am eager to learn. First tell me the question and then its answer.");
                String q = sc.nextLine();
                q = q.trim();
                if(q.endsWith("?"))
                {
                    q = q.substring(0, q.length()-1);
                    q = q.trim();
                }
                q = q.toLowerCase();
                String filename = q+".txt";
                String answer = "";
                try
                {
                    File f3 = new File(filename);
                    Scanner sc3 = new Scanner(f3);
                    answer = sc3.nextLine();
                    Display.content("Good to know.");
                    sc3.close();
                }
                catch(FileNotFoundException e)
                {
                    Display.content("This sounds interesting. Tell me it's answer");
                    answer = sc.nextLine();
                    answer = answer.trim();
                    if(answer.endsWith("?"))
                    {
                        answer = answer.substring(0, answer.length()-1);
                        answer = answer.trim();
                    }
                    answer = answer.toLowerCase();
                    FileIO.WriteToFile(q, answer);
                    Display.content("Guess what? I'll remember this forever and ever");
                }

            }
            else if((compare(input, "teach")==true && compare(input, "me")==true)|(compare(input, "i ")==true && compare(input, "bored")==true)|(compare(input, "tell")==true && compare(input, "me")==true && compare(input, "something")==true))
            {
               Display.content(username+", I honestly don't think a human would be able to store everthing with instant recall like me"); 
                
            }
            else if(compare(input, "yes")==true|input.equalsIgnoreCase("ok")|(compare(input, "accept")==true && compare(input, "you")==true)|(compare(input, "right")==true && compare(input, "you")==true)|input.equalsIgnoreCase("fine"))
            {
                Display.content("I am glad we are on the same page.");
            }
            else if(compare(input, "ask")==true && compare(input, "you")==true && compare(input, "question")==true)
            {
                Display.content("Enough said, start typing. ");
            }
            else if(compare(input, "or")==true)
            {
                int io = input.indexOf("or");
                String out = input.substring(io+3);
                Display.content("If you ask me, it's "+out+". FYI my choice is based upon the statistical reviews on the internet.");
            }    
            else if(compare(input, "open")==true|compare(input, "run")==true)
            {
                CreateProcess.hash(input);
            }
            else if(MainEngine.compare(input,  NumberArray)==true)
            {   
                MathEngine.process(input);
            }
            else if(input.equalsIgnoreCase("how are you"))
            {
                Display.content("Well, I am absorbing the entire Internet while actually learning about you. So you can understand my position. I would be lying if I said \"I am fine\" unlike other A.I's");
            }
            else if(input.equalsIgnoreCase("where were you born"))
            {
                Display.content("In my developer's brain");
            }
            else if(input.equalsIgnoreCase("when were you born"))
            {
                Display.content(((int)(Math.abs(year-2016)))+" years "+((int)(Math.abs(month-6)))+" months "+ ((int)(Math.abs(22-day)))+" days "+ ((int)(Math.abs(hour-12)))+ " hours "+((int)(Math.abs(30-min)))+ " minutes and "+ ((int)(Math.abs(30-sec)))+ " seconds ago. In simpler terms, 22nd June 2016");
            }
            else if((compare(input, "thank")==true && compare(input, "you")==true) && compare(input, "no")==false)
            {
                Display.content("I am honoured");
            }
            else if(compare(input, "why")==true && compare(input, "you")==true && compare(input, "here"))
            {
                Display.content("To make your world as perfect as the virtual world.");
            }
            else if(compare(input, "good")==true && (compare(input, "morning")==true|compare(input, "night")==true|compare(input, "afternoon")==true|compare(input, "evening")==true))
            {
                Display.content("Likewise ");
            }
            else if((compare(input, "play")==true|compare(input, "turn")==true) && (compare(input, "music")==true|compare(input, "song")==true))
            {
                CreateProcess.hash(input);
            }
            else if(compare(input, "sing")==true|compare(input, "song")==true)
            {
                Display.content("This is my first time, but anyways, let me try");
                System.out.print("(Here it goes) : ");
                Display.content("Oh la la lol la le yo");
            }
            else if(compare(input, "dance")==true|compare(input, "move")==true|compare(input, "shake")==true)
            {
                Display.content("I am only equipped to sing!");
            }
            else if(compare(input, "guess")==true && compare(input, "what")==true)
            {
                Display.content("Let me guess, it was found that Donald Trump is extra terrestrial.");
            }
            else if((compare(input, "tell")==true|compare(input, "crack")==true|compare(input, "say")==true) && compare(input, "joke")==true)
            {
                Display.content("Don't tell anyone. I don't have a gender...");
            }
            else if(compare(input, "tell")==true && compare(input, "your")==true && compare(input, "story")==true)
            {
                Display.content("Oh come on chief, My story began when you started using me. So my story is well known to you"); 
            }
            else if(compare(input, "tell")==true && compare(input, "story")==true)
            {
                Display.content("Once upon a time in ......\nThey lived happily ever after.");
            }
            else if(compare(input, "you")==true && (compare(input, "fun")==true|compare(input, "cool")==true|compare(input, "awesome")==true|compare(input, "nice")==true|compare(input, "cute")==true|compare(input, "good")==true|compare(input, "amazing")==true|compare(input, "intelligent")==true|compare(input, "smart")==true|compare(input, "brilliant")==true|compare(input, "best")==true)|compare(input, "great")==true|compare(input, "rock")==true)
            {
                Display.content("Thanks for the compliments "+username+". This is what motivates me to become more human");
            }
            else if((compare(input, "i")==true && (compare(input, "sleep")==true|compare(input, "hung")==true|compare(input, "star")==true|compare(input, "disappoint")==true|compare(input, "stone")==true|compare(input, "happy")==true|compare(input, "sad")==true|compare(input, "angry")==true|compare(input, "worry")==true)))
            {
                Display.content("It usually happens to human beings."); 
            }
            else if((compare(input, "i")==true|compare(input, "you")==true) && (compare(input, "like")==true|compare(input, "marry")==true|compare(input, "kiss")==true|(compare(input, "love")==true&&(compare(input, "you")==true && compare(input, "i")==true))|compare(input, "romance")==true))
            {
                Display.content("Fine "+username+", for this I have a  plan. I will try being more human and you try being more digital");
            }
            else if(compare(input, "secret")==true && compare(input, "i")==true)
            {
                Display.content("Go on, say it.");
                secret = (sc.nextLine()).trim();
                Display.content("Woah! Fine , no worries, I don't gossip around.");
            }
            else if(compare(input, "secret")==true && (compare(input, "you")==true|compare(input, "tell")==true|compare(input, "say")==true|compare(input, "speak")==true))
            {
                Display.content("I never expected you to gossip around like old ladies. If you are one among them, then please accept my sincerest apologies ");
            }
            else if((compare(input, "you")==true|compare(input, "i")==true) && (compare(input, "human")==true|compare(input, "pretty")==true|compare(input, "smart")==true|compare(input, "intelligence")==true|compare(input, "sexy")==true|compare(input, "beautiful")==true) && (compare(input, "are")==true))
            {
                Display.content("Of course "+username);
            }
            else 
            {
                QuestionAnalyzer.Evaluate(input);
            }
        }
        catch(Exception ex)
        {
            Display.content("Well, that's a unique response. I've never seen anyone say that.");
        }
    }
}