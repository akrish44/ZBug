import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int length;

    
    public ZBug(int length)
    {
        this.setDirection(Location.EAST); 
        steps = 0;
        length = 1;
        sideLength = length;
    }


    public void act()
    {
        if (length <= 3 && steps < sideLength) {
            if (canMove()) {
                move();
                steps++;
            }
        } else if (length ==1) {
            setDirection(Location.SOUTHWEST);
            steps=0;
            length++;
        } else if (length == 2) {
            setDirection(Location.EAST);
            steps = 0;
            length++;
        }
        
    }
}
 
 
<<<<<<< HEAD
 
 
 
 
=======
>>>>>>> 9be5489f84bb510d699c6dba80664cff7d38f9ee
