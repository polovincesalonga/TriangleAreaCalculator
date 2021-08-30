import javax.swing.JFrame;


public class TriangleAreaCalculator {

    public static void main(String[] args)
    {
        TriangleGUI triangle = new TriangleGUI(); 

        triangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        triangle.pack(); 
        triangle.setVisible(true);
    }
    
}
