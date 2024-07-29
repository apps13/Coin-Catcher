import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int gravity=1;
 
    public void act() 
    {
        move();
       
   }    
      
    
    public void move(){
        int y=getY(); int x=getX();
        if(Greenfoot.isKeyDown("Up")){
            if (y>40)
            {
                y=y-5;
            }
        }
        if(Greenfoot.isKeyDown("Down")){
           if (y<560) 
           {
               y=y+5;
           }
        }
        if (Greenfoot.isKeyDown("Right")){
            if (x<760)
            {
                x=x+5;
            }
        }
        if (Greenfoot.isKeyDown("Left")){
            if (x>40)
            {
                x=x-5;
            }
        }
       
        setLocation(x,y);
    }
    
   
    
   
}
