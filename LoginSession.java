import java.util.*;
import java.io.*;
class LoginSession extends MainEngine
{
    public static void main(String username)  throws Exception
    {
        int hour2=0, min2=0, sec2=0, day2=0, month2=0, year2=0;
        try
        {
            File file = new File(username+"_login.txt");
            Scanner sc4 = new Scanner(file);
            int arr[] = new int[6];
            int index = 0;
            String s = "";
            while(sc4.hasNextLine())
            {
                s = sc4.nextLine();
                arr[index] = Integer.parseInt(s);
                index++;
            }
            Calendar cal2 = Calendar.getInstance(); 
            hour2 = arr[0];
            min2 = arr[1];
            sec2 = arr[2];
            day2 = arr[3];
            month2 = arr[4];
            year2 = arr[5];
            min2 = (int)(Math.abs(min2));
            sec2 = (int)(Math.abs(sec2));
            hour2 = (int)(Math.abs(hour2));
            month2 = (int)(Math.abs(month2));
            year2 = (int)(Math.abs(year2));
            day2 = (int)(Math.abs(day2));
            int min3 = (int)(Math.abs(MainEngine.min-min2));
            int sec3 = (int)(Math.abs(MainEngine.sec-sec2));
            int hour3 = (int)(Math.abs(MainEngine.hour-hour2));
            int day3 = (int)(Math.abs(MainEngine.day-day2));
            int month3 = (int)(Math.abs(MainEngine.month-month2));
            int year3 = (int)(Math.abs(MainEngine.year-year2));
            Display.content("Welcome back "+username+" :)");
            System.out.println("[ Your first login was on "+day2+"/"+month2+"/"+year2+" at "+hour2+":"+min2+":"+sec2+ " ]\n[ It's been "+year3+" years "+month3+" months "+day3+" days "+hour3+" hours "+min3+" minutes "+sec3+" seconds since we first met! ]");
            System.out.println();
            FileWriter fw = new FileWriter(username+"_login.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(hour2);
            pw.println(min2);
            pw.println(sec2);
            pw.println(day2);
            pw.println(month2);
            pw.println(year2);
            pw.close();
            fw.close();
            sc4.close();
        }
        catch(FileNotFoundException e)
        {
            Calendar cal2 = Calendar.getInstance(); 
            hour2 = cal.get(Calendar.HOUR);
            min2 = cal.get(Calendar.MINUTE);
            sec2 = cal.get(Calendar.SECOND);
            day2 = cal.get(Calendar.DATE);
            month2 = cal.get(Calendar.MONTH)+1;
            year2 = cal.get(Calendar.YEAR);
            min2 = (int)(Math.abs(min2));
            sec2 = (int)(Math.abs(sec2));
            hour2 = (int)(Math.abs(hour2));
            month2 = (int)(Math.abs(month2));
            year2 = (int)(Math.abs(year2));
            day2 = (int)(Math.abs(day2));
            Display.content("Well, you are new");
            FileWriter fw = new FileWriter(username+"_login.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(hour2);
            pw.println(min2);
            pw.println(sec2);
            pw.println(day2);
            pw.println(month2);
            pw.println(year2);
            pw.close();
            fw.close();
        }
    }
}