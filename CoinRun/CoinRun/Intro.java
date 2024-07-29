import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends Actor
{
    /**
     * Act - do whatever the Intro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Intro()
    {
        setImage(new GreenfootImage("Hello!\nWelcome to Flower Hunt!\nCollect flowers to gain points.\nWatch out for cactii!!\nHit spacebar to begin :)", 35, null, null));
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
