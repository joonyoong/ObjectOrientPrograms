import java.util.*;
// Date Class
// 1/27/22
// JunyeongShin
class MyDate implements DateInterface
{
    int Day;
    int Dow;
	int Month;
    int Year;
	
	
    public int getDay() 
	{
        return Day;
    }

    public int getDow() 
	{
        return Dow;
    }

    public int getMonth() 
	{
        return Month;
    }

    public int getYear() 
	{
        return Year;
    }
   

	public void set(int m, int d, int y, int dow) 
	{
        Day = d;
        Dow = dow;
        Month = m;
        Year = y;

    }
	
    public void tomorrow()
    {
        Day++;
        Dow++;
        if (Dow==7)
        {
            Dow=0;
        }
        if (Month==1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12)
        {
            if (Day==32)
            {
                Day=1;
                Month++;
            if (Month==13)
            {
                Month=1;
                Year++;
            }
            }
        }

        if (Month==4 || Month == 6 || Month == 9 || Month == 11)
        {
            if (Day==31)
            {
                Day=1;
                Month++;
            }
        }
        
        if (Month==2)
        {
            if (Year%4==0)
            {
                if (Year%100!=0)
                {
                    if (Day==30)
                    {
                        Day=1;
                        Month++;
                    }
                }
        
            else if (Year%100==0)
            {
                if (Year%400==0)
                {
                    if (Day==30)
                    {
                        Day=1;
                        Month++;
                    }
                }
                else if (Year%400!=0)
                {
                    if (Day==29)
                    {
                        Day=1;
                        Month++;
                    }
                }
            }
            }
            else
            {
                if (Day==29)
                {
                    Day=1;
                    Month++;
                }
            }
        }
    }
    public void yesterday()
    {

    }
    public void today()
    {

    }
    public String toString() 
	{
        String MonthsW="";
        if (Month==1)
        {
            MonthsW="January";
        }
        else if (Month==2)
        {
            MonthsW="February";

        }
        else if (Month==3)
        {
            MonthsW="March";

        }
        else if (Month==4)
        {
            MonthsW="April";

        }
        else if (Month==5)
        {
            MonthsW="May";

        }
        else if (Month==6)
        {
            MonthsW="June";

        }
        else if (Month==7)
        {
            MonthsW="July";

        }
        else if (Month==8)
        {
            MonthsW="August";

        }
        else if (Month==9)
        {
            MonthsW="September";

        }
        else if (Month==10)
        {
            MonthsW="October";

        }
        else if (Month==11)
        {
            MonthsW="November";
 
        }
        else if (Month==12)
        {
            MonthsW="December";

        }
        String Dotw = "";
        if (Dow==0)
        {
            Dotw="Sunday";
        }
        else if (Dow==1)
        {
            Dotw="Monday";
        }
        else if (Dow==2)
        {
            Dotw="Tuesday";
        }
        else if (Dow==3)
        {
            Dotw="Wednesday";
        }
        else if (Dow==4)
        {
            Dotw="Thursday";
        }
        else if (Dow==5)
        {
            Dotw="Friday";
        }
        else if (Dow==6)
        {
            Dotw="Saturday";
        }
    

		return (Dotw+" "+MonthsW+" "+Day+ ", " +Year);
    }
}
