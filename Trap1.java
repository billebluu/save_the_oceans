import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trap1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trap1 extends Actor
{
    /**
     * Act - do whatever the Trap1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    static GreenfootImage[] traps = {new GreenfootImage("Trap2.png"), 
        new GreenfootImage("Trap3.png"), new GreenfootImage("Trap4.png"),
        new GreenfootImage("Trap5.png")};
        
    public Trap1(){
        this.speed = speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public void act()
    {
        // Add your action code here
        setLocation(getX(), getY()+speed);
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
        setLocation(getX(),340);
        if(isTouching(Mermaid2.class)){
            for(int i=0; i<4; i++){
                Greenfoot.delay(5);
                if(i==3){
                    removeTouching(Mermaid2.class);
                    setImage(traps[i]);
                    Greenfoot.stop();
                    Greenfoot.delay(5);
                    Greenfoot.setWorld(new GameOver());
                    StartButton.bgm.pause();
                    Greenfoot.playSound("SFX_LOSE.mp3");
                }
            }
        }
    }
}
