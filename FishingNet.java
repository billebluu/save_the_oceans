import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishingNet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingNet extends Actor
{
    /**
     * Act - do whatever the FishingNet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
    public FishingNet(){
        this.speed = speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+speed);
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
        if(isTouching(Mermaid.class)){
            getWorld().removeObject(this);
            Greenfoot.delay(7);
            Greenfoot.setWorld(new GameOver());
            StartButton.bgm.pause();
            Greenfoot.playSound("SFX_LOSE.mp3");
        }
    }
}
