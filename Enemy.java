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
        Actor actor = getOneIntersectingObject(Ship.class);
        if(actor!=null)
        {
            ((Ship)actor).Soop(); 
            Soop();
        }
        if(getX()<-100)toRemove=true;
    }
    
    public void Soop()
    {
        for(int i=0; i<10;i++)
        {
            int px=Greenfoot.getRandomNumber(40);
            int py=Greenfoot.getRandomNumber(40);
            getWorld().addObject(new Pocca(getImage()),getX()+px,py);
        }
        getWorld().addObject(new Bunda(),getX(),getY());
        toRemove=true;
    }
    
    public void act()
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }
}
