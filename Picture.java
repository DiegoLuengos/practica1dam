/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle earth;
    private Circle sun2;
    private Circle sun;
    private Person diego;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        earth = new Circle();
        earth.changeColor("green");
        earth.makeVisible();
        earth.moveVertical(165);
        earth.changeSize(1500);
        earth.moveHorizontal(-750);
        
        sun2 = new Circle();
        sun2.changeColor("blue");
        sun2.moveHorizontal(-200);
        sun2.moveVertical(-40);
        sun2.changeSize(80);
        sun2.makeVisible();

        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("blue");
        }
    }
    public void moveSun()
    {
        if (sun !=null)
        {
        sun.slowMoveVertical(170);
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        earth.changeColor("black");
    }
}
public void moonWalk()
{
    if (wall != null)
    {
        diego = new Person();
        diego.moveHorizontal(-350);
        diego.moveVertical(30);
        diego.makeVisible();
        diego.slowMoveHorizontal(375);
    

}
}
}
