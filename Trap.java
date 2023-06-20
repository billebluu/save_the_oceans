import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trap extends Actor
{
    private int speed;
    static GreenfootImage[] traps = {new GreenfootImage("Trap2.png"), 
        new GreenfootImage("Trap3.png"), new GreenfootImage("Trap4.png"),
        new GreenfootImage("Trap5.png")};
    
    public Trap(){
        this.speed = speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    /**
     * Act - do whatever the Trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
        setLocation(getX(), getY()+speed);
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
        if(isTouching(Mermaid.class)){
            setLocation(getX(),340);
            for(int i=0; i<4; i++){
                Greenfoot.delay(5);
                removeTouching(Mermaid.class);
                setImage(traps[i]);
                if(i==3){
                    Greenfoot.stop();
                    Greenfoot.delay(5);
                    Greenfoot.setWorld(new GameOver());
                    StartButton.bgm.pause();
                    Greenfoot.playSound("SFX_LOSE.mp3");
                }
            }
        }
        if(isTouching(Mermaid2.class)){
            setLocation(getX(),340);
            for(int i=0; i<4; i++){
                Greenfoot.delay(5);
                removeTouching(Mermaid2.class);
                setImage(traps[i]);
                if(i==3){
                    Greenfoot.stop();
                    Greenfoot.delay(5);
                    Greenfoot.setWorld(new GameOver());
                    StartButton.bgm.pause();
                    Greenfoot.playSound("SFX_LOSE.mp3");
                }
            }
        }
        if(isTouching(Mermaid3.class)){
            setLocation(getX(),340);
            for(int i=0; i<4; i++){
                Greenfoot.delay(5);
                removeTouching(Mermaid3.class);
                setImage(traps[i]);
                if(i==3){
                    Greenfoot.stop();
                    Greenfoot.delay(5);
                    Greenfoot.setWorld(new GameOver());
                    StartButton.bgm.pause();
                    Greenfoot.playSound("SFX_LOSE.mp3");
                }
            }
        }
        if(isTouching(Mermaid4.class)){
            setLocation(getX(),340);
            for(int i=0; i<4; i++){
                Greenfoot.delay(5);
                removeTouching(Mermaid4.class);
                setImage(traps[i]);
                if(i==3){
                    Greenfoot.stop();
                    Greenfoot.delay(5);
                    Greenfoot.setWorld(new GameOver());
                    StartButton.bgm.pause();
                    Greenfoot.playSound("SFX_LOSE.mp3");
                }
            }
        }
        if(isTouching(Mermaid5.class)){
            setLocation(getX(),340);
            for(int i=0; i<4; i++){
                Greenfoot.delay(5);
                removeTouching(Mermaid5.class);
                setImage(traps[i]);
                if(i==3){
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
