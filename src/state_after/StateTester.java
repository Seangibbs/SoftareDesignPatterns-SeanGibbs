package state_after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StateTester
{
    public static void main(String[] args)
    {
        CeilingFan cord = new CeilingFan();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            cord.pull();
        }
    }
    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try
        {
            line = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return line;
    }
}
