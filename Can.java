import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Can here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Can extends Actor
{
    /**
     * Act - do whatever the Can wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    static Actor choosenChara;
    public Can(){
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
    }
}
