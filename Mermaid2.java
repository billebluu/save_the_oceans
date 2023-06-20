import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mermaid2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mermaid2 extends Actor
{
    public Mermaid2(){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),
        (int)Math.round(getImage().getHeight()*0.9));
    }
    
    /**
     * Act - do whatever the Mermaid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        pressTheLeftButton();
        pressTheRightButton();
        touching();
    }
    
    public void pressTheLeftButton(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
            turning();
        }
    }
    
    public void pressTheRightButton(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
            turning();
        }
    }
    
    public void turning(){
        if(getRotation() == 180 && Greenfoot.isKeyDown("left") || 
           getRotation() == 0 && Greenfoot.isKeyDown("right")){
            turn(180);
            getImage().mirrorVertically();
        }
    }
    
    public void touching(){
        if(isTouching(Can.class)){
            MyWorld.score.add(1);
            MyWorld2.score.add(1);
            MyWorld3.score.add(1);
            MyWorld4.score.add(1);
            MyWorld5.score.add(1);
            Greenfoot.playSound("SFX_SCORE.mp3");
            removeTouching(Can.class);
        }
        if(isTouching(Bottle.class)){
            MyWorld.score.add(1);
            MyWorld2.score.add(1);
            MyWorld3.score.add(1);
            MyWorld4.score.add(1);
            MyWorld5.score.add(1);
            Greenfoot.playSound("SFX_SCORE.mp3");
            removeTouching(Bottle.class);
        }
        if(isTouching(Poison.class)){
            MyWorld.HP.add(-1);
            MyWorld3.HP.add(-1);
            MyWorld5.HP.add(-1);
            //Greenfoot.playSound("SFX_SCORE.mp3");
            removeTouching(Poison.class);
        }
        if(isTouching(StarfishBubble.class)){
            Bonus1.score.add(1);
            Bonus2.score.add(1);
            Greenfoot.playSound("SFX_SCORE.mp3");
            removeTouching(StarfishBubble.class);
        }
    }
}
