class MathEngine extends MainEngine
{
    public static void main(String[] args)  throws Exception
    {
        process(args[0]);
    }

    public static void process(String input)    throws Exception
    {
        String exp = ""; String x1=""; double a;int flag=0;
        try
        {
            if(compare(input,"square")==true&&compare(input,"root")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute square root of a null value");
                }
                a=Double.parseDouble(x1+"");
                Display.content("Square root of "+a+" is "+(Math.sqrt(a)));

            }
            else if(compare(input,"square")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                a = Double.parseDouble(x1+"");
                Display.content("Square of "+a+" is "+(Math.pow(a,2)));

            }
            else if(compare(input,"cube")==true&&compare(input,"root")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute cube root of a null value");
                }
                a = Double.parseDouble(x1+"");
                Display.content("Cube root of "+a+" is "+(Math.pow(a,0.3333)));

            }
            else if(compare(input,"cube")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute cube of a null value");
                }
                a = Double.parseDouble(x1+"");
                Display.content("Cube of "+a+" is "+(Math.pow(a,3)));

            }
            else if(compare(input,"factorial")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute the factorial of a null value");
                }

                a = Double.parseDouble(x1+"");
                int fact=1;
                for(int i=1;i<=a;i++)
                {
                    fact = fact*i;
                }
                Display.content("Factorial of "+a+" is " +fact);

            }
            else if(compare(input,"log")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute log of a null value");
                }
                a = Double.parseDouble(x1+"");
                Display.content("Logrithm of "+a+" is " +Math.log(a));
            }
            else if(compare(input,"round")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to round off a null value");
                }
                a = Double.parseDouble(x1+"");
                Display.content("Rounded up value of "+a+" is " +Math.round(a));

            }
            else if(compare(input,"expo")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute the exponent of a null value");
                }
                a = Double.parseDouble(x1+"");
                Display.content("Exponential value of "+a+" is " +Math.exp(a));

            }
            else if(compare(input,"abs")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {
                        x1=x1+x;
                        flag++;
                    }

                }

                if(flag==0)
                {
                    Display.content("It's not possible to compute the absolute value of a null value");
                }
                a = Double.parseDouble(x1+"");
                Display.content("Absolute value of "+a+" is " +Math.abs(a));
            }
            else if(compare(input,"sin")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {x1=x1+x;flag++;}

                }
                if(flag==0)
                {
                    Display.content("It's not possible to compute square root of a null value");
                }
                a=Double.parseDouble(x1+"");
                double r =Math.toRadians(a);
                Display.content("Sin value of "+a+" is " +Math.sin(r));
            }
            else if(compare(input,"cos")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {x1=x1+x;flag++;}

                }
                if(flag==0)
                {
                    Display.content("It's not possible to compute square root of a null value");
                }
                a=Double.parseDouble(x1+"");
                double r =Math.toRadians(a);
                Display.content("Cos value of "+a+" is " +Math.cos(r));
            }
            else if(compare(input,"tan")==true)
            {
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);
                    if(Character.isDigit(x)|x=='.')
                    {x1=x1+x;flag++;}

                }
                if(flag==0)
                {
                    Display.content("It's not possible to compute square root of a null value");
                }
                a=Double.parseDouble(x1+"");
                double r =Math.toRadians(a);
                Display.content("Tan value of "+a+" is " +Math.tan(r));
            }

            else
            {

                exp = "";
                for(int i=0; i<input.length(); i++)
                {
                    char x = input.charAt(i);

                    if(x=='+'|x=='-'|x=='*'|x=='/'|x=='%'|Character.isDigit(x)|x=='.')
                        exp = exp+x;
                }
                compute(exp);
            }
        }
        catch(Exception e)
        {
            Display.content("I know you are trying to trick me, why don't you use the calculator?");
            Runtime rs = Runtime.getRuntime();
            rs.exec("C:/Windows/System32/calc.exe");
        }
    }

    public static void compute(String exp) throws Exception
    {
        try
        {
            String t1 = "", t2="";
            char op = '\u0000';
            double op1 = 0, op2=0;
            double result = 32.69f;
            int q=0;
            for(int i=0; i<exp.length(); i++)
            {
                char x = exp.charAt(i);
                if(x=='+'|x=='-'|x=='*'|x=='/'|x=='%')
                {q = i; op=x; break;}
            }

            t1=exp.substring(0, q);
            t2=exp.substring(q+1, exp.length());
            op1=Double.parseDouble(t1);
            op2=Double.parseDouble(t2);
            if(op=='+') result=op1+op2;
            else if(op=='-')    result=op2-op1;
            else if(op=='*')    result=op1*op2;
            else if(op=='/')    result=op1/op2;
            else if(op=='%')    result=op1%op2;

            if(result!=32.69)
                Display.content("That operation gives you "+result);
        }
        catch(Exception ex)
        {
            Display.content("I know you are trying to trick me, why don't you use the calculator?");
            Runtime rs = Runtime.getRuntime();
            rs.exec("C:/Windows/System32/calc.exe");

        }

    }
}
