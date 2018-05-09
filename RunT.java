class RunT
{
    public static void main(String s) 
    {
        RunT1 r1= new RunT1(s);
        RunT2 r2 = new RunT2(s);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t2.start();
        t1.start();
    }
}