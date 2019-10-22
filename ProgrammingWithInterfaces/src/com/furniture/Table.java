package com.furniture;

public class Table extends  Furniture
{
    public Table(String _description,float _square)
    {
        super( _description, _square);
    }
    @Override
    public String toString() {
        return _description + " has square : " + _square;
    }
}
