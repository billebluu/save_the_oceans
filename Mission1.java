import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mission1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mission1 extends World
{

    /**
     * Constructor for objects of class Mission1.
     * 
     */
    public Mission1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        OKButton oKButton = new OKButton();
        addObject(oKButton,344,422);
    }
}
