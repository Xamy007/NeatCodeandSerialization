package com.mycompany.app;
import java.lang.Math; 
public class App 
{
    float s_interest(int principal,int rate,int time)
    {
        return principal*(rate/100)*time;
    }
    float c_interest(int principal,int rate,int noc,int time)
    {
        return (float) ((double) principal * (Math.pow((1 + (rate / 100) / noc), noc * time)));
    }
}
