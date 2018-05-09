class RunT1 implements Runnable
{
    String s;
    RunT1(String y)
    {
        s = y;
    }
    public  void run()   
    {
        try
        {
            Display.content(s);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}