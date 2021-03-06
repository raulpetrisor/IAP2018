import desene.*;

public class Desen
{
    private Punct p1, p2, p3;
    private Dreptunghi d1, d2;
    private Cerc c;

    /**
     * Constructor for objects of class Desen
     */
    public Desen()
    {
        // initialise instance variables
        p1 = new Punct(20, 30);
        d1 = new Dreptunghi(32,24,20,30);
        p2 = new Punct(45, 34);
        d2 = new Dreptunghi(20,30,45,34);
        p3 = new Punct(65, 75);
        c = new Cerc(124, 65, 75);
        System.out.println("Aria dreptunghiului d1 este " + d1.arie());
        System.out.println("Perim. dreptunghiului d1 este " + d1.perim());
        System.out.println("Aria cercului c este " + c.arie());
        System.out.println("Perim cercului c este " + c.perim());
        double s_arii = d1.arie() + d2.arie() + c.arie();
        double s_perim = d1.perim() + d2.perim() + c.perim();
    }

    public static void main(String s[])
    {
        Desen d = new Desen();
    }
}