package com.furniture;

public class Armchair extends Furniture
{
    public float[] _square1 = new float[2];
    public Armchair(String _description, float square1, float square2)
    {

        this._description = _description;
        this._square1[0] = square1;
        this._square1[1] = square2;
    }


    @Override
    public String toString() {
        return _description + " has square : " + _square1[0] + "-" + _square1[1];
    }
}