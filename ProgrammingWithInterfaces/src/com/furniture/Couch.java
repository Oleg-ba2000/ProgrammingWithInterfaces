package com.furniture;


public class Couch extends Armchair
{
    public Couch(String _description, float square1, float square2)
    {
        super(_description,square1,square2);
    }
    @Override
    public String toString() {
        return _description + " has square : " + _square1[0] + "-" + _square1[1];
    }
}