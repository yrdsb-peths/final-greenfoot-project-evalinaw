import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ball travelling back and forth
 * 
 * @author Wang
 * @version Jan 2023
 */
public class PingPong extends Actor
{
    GreenfootImage[] idleRight = new GreenfootImage[4];
    GreenfootImage[] idleLeft = new GreenfootImage[4];

    // Direction the pingpong is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Act - do whatever the PingPong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animatePingPong();
    }
    
    public PingPong()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/flame_idle/idle" + i + ".png");
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/flame_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
        }
        
        animationTimer.mark();
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animatePingPong()
    {
        if(animationTimer.millisElapsed() < 400)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
        setImage(idleLeft[imageIndex]);
        imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
}
