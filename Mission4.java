import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mission4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mission4 extends World
{

    /**
     * Constructor for objects of class Mission4.
     * 
     */
    public Mission4()
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
        OKButton5 oKButton5 = new OKButton5();
        addObject(oKButton5,351,425);
    }
}
