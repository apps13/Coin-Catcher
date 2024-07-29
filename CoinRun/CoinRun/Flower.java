import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
            MyWorld.points=MyWorld.points+1;
            getWorld().removeObject(this);
            return;
        }
       }
    }    
    
    public boolean isOffScreen()
    {
    if (getX() == 0 ||getX()== getWorld().getWidth() -1) 
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
