import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
        {
            move(18);
            if (Greenfoot.getRandomNumber(100) < 10)
            {
                turn(Greenfoot.getRandomNumber(90) - 45);
            }
            if (getX() <= 5 || getX() >= getWorld().getWidth() - 5);
            {
                turn(175);
            }
            if (getY() <= 5 || getY() >= getWorld().getWidth() - 5);
            {
                turn(175);
            }
            eat();
        }
    public void eat()
    {
        Actor Crab;
        Crab =  getOneObjectAtOffset(0, 0, Crab.class);
        if (Crab != null)
        {
            World world; 
            world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("eating.wav");
        }
    } 
    public Worm()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /3;
        int myNewWidth = (int)myImage.getWidth () /3;
        myImage.scale (myNewWidth, myNewHeight);
    }
}   
