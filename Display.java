class Display extends MainEngine
{
    static int flag = 1;
    public static void main(String[] args)  throws Exception
    {
        content(args[0]);
    }

    public static void content(String x)    throws Exception
    {

        x = x.trim();
        System.out.print(" MARK : ");
        for(int i=0; i<x.length(); i++)
        {

            if((i!=0)&&(i%130==0))
            {
                System.out.println();
                System.out.print("        ");
            }
            System.out.print(x.charAt(i));
            Thread.sleep(45);
        }

        if((x.endsWith("?")==false)&&(x.endsWith(".")==false)&&(x.endsWith("!")==false)&&(x.endsWith(")")==false))
        {
            System.out.print(".");
        }
        System.out.println();
        TextToSpeech.main(x);
        if(flag==0) System.out.println();
        if(flag==0 && (x.startsWith("You already said that once")==false) && (x.startsWith("Alright you beat me in this. Ask me something else")==false) && (x.startsWith("Welcome back")==false) && (x.startsWith("Well, you are new")==false) )
        {
            System.out.print(" -----> ");
        }
    }
}
