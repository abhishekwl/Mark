class CreateProcess extends MainEngine
{
    public static void main(String[] args)  throws Exception
    {
        hash(args[0]);
    }

    public static void hash(String input)   throws Exception
    {
        Runtime process = Runtime.getRuntime();
        input = input.trim();
        if(input.endsWith("?"))
        {
            input = input.substring(0, input.length()-1);
            input = input.trim();
        }
        input = input.toLowerCase();

        int v = input.indexOf(' ');
        String program = input.substring(v+1);
        program = FileIO.WordFilter(program);
        if((Adv.GetCurrentOS()).equalsIgnoreCase("windows"))
        {
            if(compare(program,"internet")==true|compare(program,"internet explorer")==true|compare(program,"ie")==true|compare(program,"web")==true|compare(program,"browser")==true)
            {
                try
                {
                    process.exec("C:/Program Files (x86)/Internet Explorer/iexplore.exe");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
            else if(compare(program,"map")==true|compare(program,"location")==true|compare(program,"plot")==true)
            {
                try
                {
                    process.exec("C:/Program Files/WindowsApps/Microsoft.BingMaps_2.0.2009.2356_x64__8wekyb3d8bbwe/Map.exe");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
            else if(compare(program,"explorer")==true|(compare(program,"file")==true&&compare(program,"manage")==true))
            {
                try
                {
                    process.exec("explorer");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }

            else if(compare(program,"note")==true)
            {
                try
                {
                    process.exec("notepad");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
            else if(compare(program,"media")==true|compare(program,"play")==true|compare(program,"song")==true|compare(program,"turn")==true)
            {
                try
                {
                    process.exec("C:/Program Files/Windows Media Player/wmplayer.exe");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
            else if(compare(program,"cmd")==true|compare(program,"command")==true)
            {
                try
                {
                    process.exec("C:/Windows/System32/cmd.exe");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
            else if(compare(program,"calc")==true)
            {
                try
                {
                    process.exec("C:/Windows/WinSxS/wow64_microsoft-windows-calc_31bf3856ad364e35_10.0.10240.16384_none_bc131d3be9ca049c/calc.exe");
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
            else
            {
                try
                {
                    process.exec(program);
                }
                catch(Exception e)
                {
                    Display.content("Oops, something went wrong. That's not my fault, it's the operating system's mistake.\nFor enquiring mins :-\nERROR : "+e.getMessage());
                }
            }
        }
        Display.content("Done");
    }
}