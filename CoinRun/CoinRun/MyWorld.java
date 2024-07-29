import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int timer;
    private int timer1;
    public static int points;
    Random random = new Random();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepareGrass();
        timer=0;
        timer1=0;
        points=0;
    }
    
    public void act() 
    {
        timer=timer+1;
        timer1=timer1+1;
        if (timer==60)
        {
        addFlower(); 
        timer=0;
        }
        
        if (timer1==240)
        {
            addCactus();
            timer1=0;
        }
    }
    
    public void addCactus()
    {
       int low = 40;
       int high = 560;
       int rand = random.nextInt(high-low) + low; 
       Cactus cactus = new Cactus();
       addObject(cactus,800,rand);
    }
    
    
    public void addFlower()
    {
       int low = 40;
       int high = 560;
       int rand = random.nextInt(high-low) + low; 
       Flower flower = new Flower();
       addObject(flower,800,rand);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepareGrass()
    {
        Grass grass = new Grass();
        Grass grass2= new Grass();
        Grass grass3 = new Grass();
        Grass grass4 = new Grass();
        Grass grass5 = new Grass();
        Grass grass6 = new Grass();
        Grass grass7 = new Grass();
        Grass grass8 = new Grass();
        Grass grass9 = new Grass();
        Grass grass10 = new Grass();
        Grass grass11 = new Grass();
        Grass grass12 = new Grass();
        Grass grass13 = new Grass();
        Grass grass14 = new Grass();
        Grass grass15 = new Grass();
        Grass grass16 = new Grass();
        addObject(grass,50,590);
        addObject(grass2,100,590);
        addObject(grass3,150,590);
        addObject(grass4,200,590);
        addObject(grass5,250,590);
        addObject(grass6,300,590);
        addObject(grass7,350,590);
        addObject(grass8,400,590);
        addObject(grass9,450,590);
        addObject(grass10,500,590);
        addObject(grass11,550,590);
        addObject(grass12,600,590);
        addObject(grass13,650,590);
        addObject(grass14,700,590);
        addObject(grass15,750,590);
        addObject(grass16,800,590);
        Bee bee = new Bee();
        addObject(bee,59,350);
    }
}
  