package desene;

public class Punct
{
    // instance variables - replace the example below with your own
    private int x, y;

    /**
     * Constructor for objects of class Punct
     */
    public Punct(int x, int y)
    {
        // initialise instance variables
        this.x=x;
        this.y=y;
    }

    public void translatez(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
}
