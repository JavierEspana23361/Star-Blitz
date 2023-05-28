import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gamef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gamef extends Actor
{
    /**
     * Act - do whatever the gamef wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public gamef()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () *6;
        int myNewWidth = (int)myImage.getWidth () *6;
        myImage.scale (myNewWidth, myNewHeight);
    }
}   


