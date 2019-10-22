package com.Room;

import com.CustomException.WrongIlluminanceException;
import com.CustomException.WrongSpaceException;
import com.IAddLightItem;
import com.LigtItems.LightItem;
import com.LigtItems.Window;
import com.furniture.Armchair;
import com.furniture.Furniture;

import java.util.*;

public class Room implements IAddLightItem
{
    public String _name;
    public List<Furniture> furnitureList = new ArrayList<>();
    public List<LightItem> lightItems = new ArrayList<>();
    //Params of Square
    float _maxSquare;
    float _squareOfFurniture;
    float _avaivableSquare;
    //Class Window;
    private Window windows;
    //Params of Light
    private int _minLightPower;
    private int _maxLightPower;
    private int _fundedLight;

    public Room(float _maxSquare, String _name, Window window)
    {

        this._name = _name;
        this._maxSquare = _maxSquare;
        this.windows = window;
        SetPowerOfRoom();
    }
    public void SetPowerOfRoom()
    {
        _avaivableSquare = (70*_maxSquare)/100;
        _fundedLight+=windows._lightPower;
        _maxLightPower = 4000;
        _minLightPower = 300;
    }
   public void AddFurniture(Furniture furniture)
   {

       try
       {
           if(furniture._square+_squareOfFurniture > _avaivableSquare)
           {
               throw new WrongSpaceException("Not enough space");
           }
           else
           {
               if(furniture instanceof Armchair)
               {
                   if(((Armchair) furniture)._square1[0]+((Armchair)furniture)._square1[1]  +_squareOfFurniture > _avaivableSquare )
                   {
                       throw new WrongSpaceException("Not enough space");
                   }
                   else
                   {
                       _squareOfFurniture += ((Armchair)furniture)._square1[0] + ((Armchair)furniture)._square1[1];
                       furnitureList.add(furniture);
                   }

               }
               else
               {
                   _squareOfFurniture+=furniture._square;
                   furnitureList.add(furniture);
               }
           }
       }
       catch (WrongSpaceException ex)
       {
           System.out.println(ex.getMessage());
       }


   }

   public String toString()
   {
       float result = _maxSquare - _squareOfFurniture;
       String coomonString = "";
       int count = lightItems.size();
       for (LightItem lightItem:
               lightItems)
       {
           if (count>1)
           {
               coomonString+=lightItem.toString() + " and ";
               count--;
           }
           else if(count == 0)
           {
               coomonString+="don't exist";
           }
           else
           {
               coomonString+=lightItem.toString();
           }

       }
        return _name + " have : "+ "\n" + "Square is " +  _squareOfFurniture + " Free Square is " + result + "m^2" + "\n" + "\n"+
                "Illuminance is : " + "Windows with follow number : " + windows._countOfWindow + " with common power - " + windows._lightPower + "," + "lightbulb - " + coomonString ;
   }

    @Override
    public void AddLightItem(LightItem lightItem)
    {
        try
        {
            if (lightItem._lightPower + _fundedLight < _maxLightPower && lightItem._lightPower + _fundedLight > _minLightPower)
            {
                lightItems.add(lightItem);
            }
            else
            {
                throw new WrongIlluminanceException("not available Light");
            }
        }
        catch (WrongIlluminanceException ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}
