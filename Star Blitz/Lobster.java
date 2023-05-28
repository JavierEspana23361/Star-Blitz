import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(175);
        }
        if (getY() <= 5 || getY() >= getWorld().getWidth() - 5)
        {
            turn(175);
        }
    }
    public Lobster()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /4;
        int myNewWidth = (int)myImage.getWidth () /4;
        myImage.scale (myNewWidth, myNewHeight);
    }
}
