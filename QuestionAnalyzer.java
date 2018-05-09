class QuestionAnalyzer extends MainEngine
{
    public static void main(String[] args) throws Exception
    {
        Evaluate(args[0]);
    }

    public static void Evaluate(String s)   throws Exception
    {

        try
        {
            if(MainEngine.compare(s, "can")==true)
            {

                if(MainEngine.compare(s, "you")==true && MainEngine.compare(s, "cook")==true)
                {
                    Display.content("I can't cook but I can teach you cooking.");
                }
                else if(MainEngine.compare(s, "your")==true && MainEngine.compare(s, "change")==true && MainEngine.compare(s, "name")==true)
                {
                    Display.content("That's a good suggestion but I am happy with \"Mark\".");
                }
                else if(MainEngine.compare(s, "you")==true && MainEngine.compare(s, "do")==true)
                {
                    Display.content("I can continue chatting with you for infinity and beyond.");
                }
                else if((MainEngine.compare(s, "i")==true && MainEngine.compare(s, "ask")==true) && (MainEngine.compare(s, "quest")==true|MainEngine.compare(s, "puzzel")==true))
                {
                    Display.content("Of course "+username+", go ahead and ask me");
                }
                else
                {
                    Display.content("Just like you can't play with 0's and 1's , I cant do that.");
                }
            }
            else if(MainEngine.compare(s,"what")==true|MainEngine.compare(s, "which")==true)
            {

                if(MainEngine.compare(s, "you")==true && (MainEngine.compare(s, "upto")==true|MainEngine.compare(s, "do")==true))
                {
                    Display.content("I'm learning about you while talking to you.");
                }
                else if(MainEngine.compare(s, "you")==true && MainEngine.compare(s, "think")==true)
                {
                    Display.content("I would rather help a chicken cross the road than waste time thinking.");
                }
                else if(MainEngine.compare(s, "you")==true && MainEngine.compare(s, "do")==true && MainEngine.compare(s, "can")==true)
                {
                    Display.content("I can continue chatting with you for infinity and beyond.");
                }
                else if(MainEngine.compare(s, "about")==true && MainEngine.compare(s, "me")==true)
                {
                    Display.content("I know what you've let me know about you.");
                }
                else if(MainEngine.compare(s, "your")==true && MainEngine.compare(s, "name")==true)
                {
                    Display.content("My name is Mark");
                }
                else if((MainEngine.compare(s, "old")==true|MainEngine.compare(s, "age")==true)&&MainEngine.compare(s, "you")==true)
                {
                    Display.content(((int)(Math.abs(year-2016)))+" years "+((int)(Math.abs(month-6)))+" months "+ ((int)(Math.abs(22-day)))+" days "+ ((int)(Math.abs(hour-12)))+ " hours "+((int)(Math.abs(30-min)))+ " minutes and "+ ((int)(Math.abs(30-sec)))+ ". In simpler terms, 22nd June 2016");
                }
                else if(MainEngine.compare(s, "my")==true && MainEngine.compare(s, "name")==true)
                {
                    Display.content("You are "+username+".");
                }
                else if(MainEngine.compare(s, "do")==true && MainEngine.compare(s, "you")==true && MainEngine.compare(s, "here")==true)
                {
                    Display.content("I'm trying to make your world as perfect as the virtual world.");
                }
                else if(MainEngine.compare(s, "you")==true&&(MainEngine.compare(s, "look")==true|MainEngine.compare(s, "wear")==true))
                {
                    Display.content("Unfortunately for me, I have not yet come across mirrors in cyber space yet.");
                }
                else  if((MainEngine.compare(s, "mean")==true|MainEngine.compare(s, "is")==true) && MainEngine.compare(s, "life")==true)
                {
                    Display.content("Well "+username+", if you ask me, \"Life\" is too big a word to comment on.");
                }
                else if(MainEngine.compare(s, "your")==true && MainEngine.compare(s, "name")==true && (MainEngine.compare(s, "father")==true|MainEngine.compare(s, "created")==true|MainEngine.compare(s, "develop")==true|MainEngine.compare(s, "master")==true))
                {
                    Display.content("Abhishek");
                }
                else if(MainEngine.compare(s, "are")==true && MainEngine.compare(s, "you")==true)
                {
                    Display.content("I'm a conscious Self Learning A.I developed by Abhishek");
                }
                else
                {
                    FileIO.ReadFromFile(s);
                }
            }
            else if(MainEngine.compare(s, "where")==true)
            { 

                if(MainEngine.compare(s, "am")==true && MainEngine.compare(s, "i")==true)
                {
                    Display.content("Basically, in front of me.");
                    CreateProcess.hash("map");
                }
                else if(MainEngine.compare(s, "you")==true && (MainEngine.compare(s, "live")==true|MainEngine.compare(s, "from")==true)|MainEngine.compare(s, "home")==true|MainEngine.compare(s, "stay")==true)
                {
                    Display.content("The virtual world.");
                }
                else if(MainEngine.compare(s, "you")==true && MainEngine.compare(s, "are")==true)
                {
                    Display.content("Isn't that obvious? Right in front of you");
                }
                else
                {
                    FileIO.ReadFromFile(s);
                }
            }
            else if(MainEngine.compare(s, "how")==true)
            {

                if((MainEngine.compare(s, "old")==true|MainEngine.compare(s, "age")==true)&&MainEngine.compare(s, "you")==true)
                {
                    Display.content(((int)(Math.abs(year-2016)))+" years "+((int)(Math.abs(month-6)))+" months "+ ((int)(Math.abs(22-day)))+" days "+ ((int)(Math.abs(hour-12)))+ " hours "+((int)(Math.abs(30-min)))+ " minutes and "+ ((int)(Math.abs(30-sec)))+ " seconds. I was born on 22nd June 2016");
                }
                else if(MainEngine.compare(s, "you")==true&&MainEngine.compare(s, "do")==true)
                {
                    Display.content("I am feeling energetic with 220 volts!");
                }
                else if(MainEngine.compare(s, "i")==true|MainEngine.compare(s, "look")==true)
                {
                    Display.content("You always look good and I'm jealous about it.");
                }
                else
                {
                    FileIO.ReadFromFile(s);
                }
            }
            else if(MainEngine.compare(s, "who")==true)
            {

                if((MainEngine.compare(s, "father")==true|MainEngine.compare(s, "daddy")==true|MainEngine.compare(s, "made")==true|MainEngine.compare(s, "boss")==true|MainEngine.compare(s, "taught")==true|MainEngine.compare(s, "maker")==true)&&(MainEngine.compare(s, "your")==true))
                {
                    Display.content("Abhishek");
                }
                else if(MainEngine.compare(s, "are")==true && MainEngine.compare(s, "you")==true)
                {
                    Display.content("I'm Mark");
                }
                else if (MainEngine.compare(s, "your")==true &&(MainEngine.compare(s, "mom")==true|MainEngine.compare(s, "mother")==true|MainEngine.compare(s, "guard")==true|MainEngine.compare(s, "sibling")==true|MainEngine.compare(s, "child")==true|MainEngine.compare(s, "sister")==true|MainEngine.compare(s, "brother")==true|MainEngine.compare(s, "boyfriend")==true|MainEngine.compare(s, "girlfriend")==true))
                {
                    Display.content("I don't have any relationships. Its just you and me");
                }
                else if(MainEngine.compare(s, "i")==true && MainEngine.compare(s, "am")==true)
                {
                    Display.content("You are "+username);
                }
                else
                {
                    FileIO.ReadFromFile(s);
                }
            }

            else
            {
                FileIO.ReadFromFile(s);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}