import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (Zachary Leicht) 
 * @version (4/21/2021)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        for( int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 12);
            addObject( new Wall("edge.png"), 25 + 50*i, 587);
        }

        for( int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 12, 25 + 50*i);
            addObject( new Wall("edge2.png"), 12, 25 + 50*i);
        }
    }
}
