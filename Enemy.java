import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vx=0;
    public Enemy(int v)
    {
        vx=v;
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
    }
    
    public void act()
    {
        move();
    }
}
