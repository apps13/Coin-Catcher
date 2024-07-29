import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
     public void act() 
    {
       if (this.getWorld() != null)
       {
            setLocation(getX()-6,getY());
            if (isOffScreen()) 
            { 
               getWorld().removeObject(this);
               return;
            }
            if (touchesBee())
            {
                getWorld().setBackground(new GreenfootImage("bluerock.jpg"));
                getWorld().addObject(new GameEnd(),300,300);
                Greenfoot.stop();
                return;
            }
       }
       
    }    
    
    public boolean isOffScreen()
    {
    if (getX() == 0) 
    {
    return true;
    } 
    else 
    {
    return false;
    }
    }  
    
    public boolean touchesBee()
    {
        if(getOneIntersectingObject(Bee.class)!=null)
            return true;
        else
            return false;
    }
}
