import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Galaxy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galaxy extends World
{
    public Galaxy()
    {    
        super(600, 400, 1,false);
        
        addObject(new Ship(), 100,200);
    }
}
