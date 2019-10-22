package com.LigtItems;

public class Window extends LightItem
{

    public String _describe;
    public int  _countOfWindow;
    public Window(int countOfWindow)
    {

        this._describe = "Winwow";
        _countOfWindow = countOfWindow;
        _lightPower = 700 * _countOfWindow;
    }

    @Override
    public String toString()
    {
        return "count of Windows are " + _countOfWindow;
    }
}
