import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gametitulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gametitulo extends Actor
{
    /**
     * Act - do whatever the gametitulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gametitulo()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () *7;
        int myNewWidth = (int)myImage.getWidth () *7;
        myImage.scale (myNewWidth, myNewHeight);
    }
}
