import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel3 extends World
{

    /**
     * Constructor for objects of class nivel3.
     * 
     */
    public nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        prepare();
    }
     
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
        worm.setLocation(156,126);
        Lobster lobster4 = new Lobster();
        addObject(lobster4,455,147);
        Lobster lobster5 = new Lobster();
        addObject(lobster5,542,498);
        lobster3.setLocation(70,556);
        worm.setLocation(293,132);
        lobster.setLocation(49,46);
        lobster4.setLocation(524,57);
        lobster2.setLocation(295,561);
        crab.setLocation(273,289);
        lobster2.setLocation(296,509);
        lobster3.setLocation(59,444);
        crab.setLocation(301,348);
        worm.setLocation(282,104);
        Worm worm12 = new Worm();
        addObject(worm12,359,98);
        worm.setLocation(240,102);
        worm12.setLocation(362,101);
        Lobster lobster6 = new Lobster();
        addObject(lobster6,515,264);
        Lobster lobster7 = new Lobster();
        addObject(lobster7,60,260);
        lobster7.setLocation(42,271);

        lobster5.setLocation(384,237);
        worm12.setLocation(503,526);
        worm12.setLocation(413,416);
        worm12.setLocation(452,471);
        crab.setLocation(284,303);
        worm.setLocation(134,175);
        lobster7.setLocation(40,157);
        lobster5.setLocation(98,32);
        lobster6.setLocation(525,534);
        lobster2.setLocation(410,522);
        lobster4.setLocation(505,416);
        lobster3.setLocation(54,517);
        Lobster lobster8 = new Lobster();
        addObject(lobster8,507,64);
        lobster8.setLocation(519,55);
        worm.setLocation(13,-4);
        worm.setLocation(52,49);
        worm.setLocation(83,72);
        worm.setLocation(111,179);
        lobster5.setLocation(157,44);
        lobster.setLocation(108,123);
        lobster4.setLocation(388,201);
        lobster8.setLocation(511,98);
        lobster8.setLocation(499,392);
        lobster2.setLocation(510,20);
        lobster4.setLocation(397,48);
        lobster8.setLocation(394,89);
        lobster2.setLocation(532,139);
        lobster8.setLocation(472,107);
        lobster6.setLocation(280,44);
        lobster3.setLocation(222,51);
        worm.setLocation(165,185);
        worm.setLocation(205,268);
        worm.setLocation(58,55);
        lobster.setLocation(110,153);
        lobster8.setLocation(432,173);
        lobster2.setLocation(519,169);
        lobster3.setLocation(320,69);
        lobster3.setLocation(244,64);
        worm12.setLocation(482,83);
        crab.setLocation(289,451);
        crab.setLocation(286,526);
    }

    public void act()
    {
        if(getObjects(Lobster.class).isEmpty())
        Greenfoot.setWorld(new boss());
        if(getObjects(Crab.class).isEmpty())
        Greenfoot.setWorld(new gameover());
    }
}
