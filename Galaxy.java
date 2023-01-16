import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Galaxy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galaxy extends World
{
    private int jeda=0;
    public Galaxy()
    {    
        super(600, 400, 1,false);
        
        addObject(new Ship(), 100,200);
    }
    
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1)
        {
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(getHeight()))), getWidth()+200,py);
        }
    }
}
