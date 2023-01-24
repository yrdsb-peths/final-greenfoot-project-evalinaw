import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Welcomes the user into the game world Opia.
 * 
 * @author Wang 
 * @version Jan 2023
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 400, 1); 
    }

    public void act()
    {
        // Move onto the instructions if user presses the space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
