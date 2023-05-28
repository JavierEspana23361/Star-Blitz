import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void eat(int num)
    {
        Actor Lobster;
        Lobster =  getOneObjectAtOffset(0, 0, Lobster.class);
        if (Lobster != null)
        {
            World world; 
            world = getWorld();
            world.removeObject(Lobster);
            Greenfoot.playSound("eating.wav");
            num++;
            num = (Lobster != null) ? num + 22 : num;
        }
    } 
    public void moveAndTurn(int num)
    {
        move(num);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-15);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(15);
        }
    }
    public void act() 
    {
        int num = 6;
        moveAndTurn(num);
        eat(num);
        
    }   
}
