class Adv
{
    public static void main(String[] args)  throws Exception
    {
        System.out.println("Details :- ");
    }
    
    public static String GetCurrentOS()
    {
        String os = System.getProperty("os.name");
        os = os.toLowerCase();
        os = os.trim();
        if(os.indexOf("win")>=0)
        {
            return "Windows";
        }
        else
        {
            return "Unix";
        }
    }
    
    public static String GetCurrentWorkingDirectory()
    {
        String CurrWorkingDir = System.getProperty("user.dir");
        CurrWorkingDir = CurrWorkingDir.replace("\\", "/");
        return CurrWorkingDir;
    }
}