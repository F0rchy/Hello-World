package com.max.idea;

public class MyFloat
{
    private long mantissa;
    private long exponent;
    private long myInteger;
    private long myFraction;
    private long resultInteger;
    private long resultFraction;
    private long resultExp;

    public MyFloat(long mantissa, long exponent)
    {
        this.mantissa = mantissa;
        this.exponent = exponent;
        intFract();
        this.resultFraction = 0;
        this.resultInteger = 0;
    }

    private void intFract()
    {
        this.myInteger = (long)(this.mantissa / Math.pow(10, this.exponent));
        this.myFraction = (long)(this.mantissa % Math.pow(10, this.exponent));
    }

    public void sum(MyFloat b)
    {
        this.resultExp = this.exponent <= b.exponent ? b.exponent : this.exponent;
        if(this.exponent >= b.exponent)
        {
        }
        else
        {
            this.myFraction *= (long)(Math.pow(10, b.getExponent() - this.exponent));
        }
        this.resultFraction = this.myFraction + b.myFraction;
        this.resultInteger += this.resultFraction / (long)(Math.pow(10, this.resultExp));
        this.resultFraction = this.resultFraction % (long)(Math.pow(10, this.resultExp));
        this.resultFraction += (this.myInteger + b.getMyInteger());
        System.out.println(this.resultInteger + "." + this.resultFraction);

    }

    public long getMyInteger()
    {
        return myInteger;
    }

    public long  getMyFraction()
    {

        return myFraction;
    }
    public void setMyFraction(long myFraction)
    {

        this.myFraction = myFraction;
    }
    public long getExponent()
    {

        return exponent;
    }
}
