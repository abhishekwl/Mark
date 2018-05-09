class RunT2 implements Runnable
{
    String s;
    RunT2(String y)
    {
        s = y;
    }
    public void run()    
    {
        try
        {
            TextToSpeech.main(s);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
