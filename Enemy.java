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
    private boolean toRemove=false;
    
    public Enemy(int v)
    {
        vx=v;
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
        if(getX()<-200)toRemove=true;
    }
    
    public void Soop()
    {
        for(int i=0; i<10;i++)
        {
            getWorld().addObject(new Pocca(getImage()));
        }
        toRemove=true;
    }
    
    public void act()
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }
}
