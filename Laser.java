import greenfoot.*;  

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    private boolean toRemove=false;
    private int vx=3;
    public void addedToWorld(World Galaxy)
    {
    
    }
    
    public void act()
    {
        if(!toRemove)
        {
            setLocation(getX()+vx,getY());
            Actor actor = getOneIntersectingObject(Enemy.class);
            if(actor!=null)
            {
                ((Enemy)actor).Soop(); 
            }
            if(getX()>getWorld().getWidth()+200)toRemove=true;
        }
        else
        {
            getWorld().removeObject(this);
        }
    }
}
