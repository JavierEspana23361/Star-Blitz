import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    flecha flecha = new flecha();
    private int opcion=0;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        prepare();
        Greenfoot.playSound("musica.mp3");
    }
    
    private void prepare()
    {
        gametitulo gametitulo = new gametitulo();
        addObject(gametitulo,343,105);
        gametitulo.setLocation(400,116);
        addObject (new jugar () ,400,250) ;
        addObject (new salir (), 400, 350);
        addObject (flecha, 275, 250) ;
        gametitulo.setLocation(275,102);
        gametitulo.setLocation(354,114);
        gametitulo.setLocation(271,82);
        gametitulo.setLocation(242,83);
        gametitulo.setLocation(261,119);
        gametitulo.setLocation(353,105);
        gametitulo.setLocation(427,105);
        gametitulo.setLocation(215,155);
        gametitulo.setLocation(341,157);
        gametitulo.setLocation(308,103);
        gametitulo.setLocation(281,116);
        removeObject(gametitulo);
        addObject(gametitulo,228,95);
        gametitulo.setLocation(329,110);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown ("UP") && opcion!=0) {opcion++; }
        if (Greenfoot.isKeyDown ("DOWN") && opcion!=1) {opcion--;}
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(275, 250 +(opcion*100));
        
        if (Greenfoot.isKeyDown ("SPACE") || Greenfoot. isKeyDown ("ENTER") ) 
        {
            switch (opcion){
            case 0: //jugar
            Greenfoot.setWorld(new CrabWorld());
            break;
            case 1: // salir
            Greenfoot. stop ();
            break;
            }
        }
    }
}
