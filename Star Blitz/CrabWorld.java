import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,203,254);
        Worm worm2 = new Worm();
        addObject(worm2,437,409);
        Worm worm3 = new Worm();
        addObject(worm3,256,45);
        Worm worm4 = new Worm();
        addObject(worm4,373,136);
        Worm worm5 = new Worm();
        addObject(worm5,135,431);
        Worm worm6 = new Worm();
        addObject(worm6,223,525);
        Worm worm7 = new Worm();
        addObject(worm7,518,503);
        Worm worm8 = new Worm();
        addObject(worm8,499,56);
        Worm worm9 = new Worm();
        addObject(worm9,395,286);
        Worm worm10 = new Worm();
        addObject(worm10,69,55);
        Worm worm11 = new Worm();
        addObject(worm11,86,186);
        Crab crab = new Crab();
        addObject(crab,262,317);
        Lobster lobster = new Lobster();
        addObject(lobster,240,159);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,317,516);
        lobster2.setLocation(48,309);
        lobster2.setLocation(48,369);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,373,531);
        removeObject(worm9);
        removeObject(worm2);
        removeObject(worm6);
        removeObject(worm5);
        removeObject(worm11);
        removeObject(worm10);
        removeObject(worm3);
        removeObject(worm4);
        removeObject(worm8);
        removeObject(worm7);
        lobster.setLocation(366,64);
        removeObject(lobster);
        removeObject(lobster2);
        worm.setLocation(280,99);
        crab.setLocation(288,334);
        worm.setLocation(245,185);
        crab.setLocation(322,308);
        lobster3.setLocation(252,31);
        worm.setLocation(287,158);
        lobster3.setLocation(274,32);
        crab.setLocation(265,470);
    }

    public void act()
    {
        if(getObjects(Lobster.class).isEmpty())
        Greenfoot.setWorld(new nivel1());
        if(getObjects(Crab.class).isEmpty())
        Greenfoot.setWorld(new gameover());
    }
}

