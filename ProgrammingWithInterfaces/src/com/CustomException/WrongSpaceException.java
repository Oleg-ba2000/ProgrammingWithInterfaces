package com.CustomException;

public class WrongSpaceException extends  Exception
{
    public WrongSpaceException(String errorMessage)
    {
        super(errorMessage);
    }
}
