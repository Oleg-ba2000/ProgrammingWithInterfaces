package com.LigtItems;

public class Lightbulb extends  LightItem
{
    String _describe;
    public Lightbulb(int _lightPower)
    {
        super(_lightPower);
        this._describe = "LightBulb";
    }
    @Override
    public String toString()
    {
        return _lightPower + "lk ";
    }
}
