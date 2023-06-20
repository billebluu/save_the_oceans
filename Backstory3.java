import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backstory3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backstory3 extends World
{
    /**
     * Constructor for objects of class Backstory3.
     * 
     */
    public Backstory3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Backstory3());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NextStory3 nextStory3 = new NextStory3();
        addObject(nextStory3,631,477);
    }
}
