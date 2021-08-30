import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JLabel; 
import javax.swing.JButton;
import javax.swing.JFormattedTextField; 
import javax.swing.JTextField; 
import javax.swing.JOptionPane; 
import java.text.NumberFormat; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import java.awt.Insets;




public class TriangleGUI extends JFrame implements ActionListener {

    private JLabel baseLabel; 
    private JLabel heightLabel;
    private JLabel areaLabel;
    private JTextField baseField; 
    private JTextField heightField; 
    private JTextField areaField;
    private JFormattedTextField baseInput; 
    private JFormattedTextField heightInput;
    private JButton calculate; 



    TriangleGUI() 
    {
        GridBagConstraints layout= null;

        setTitle("Triangle Area Calculator"); 



        //labels 
        heightLabel = new JLabel("Height"); 
        baseLabel = new JLabel("Base"); 
        areaLabel = new JLabel("Area"); 


        //text fields 
        heightField = new JTextField(15); 
        heightField.setEditable(false); 

        baseField = new JTextField(15); 
        baseField.setEditable(false); 

        areaField = new JTextField(10); 
        areaField.setEditable(false); 


        //button 
        calculate = new JButton("Calculate"); 
        calculate.addActionListener(this); 


        //input fields
        baseInput = new JFormattedTextField(NumberFormat.getIntegerInstance()); 
        baseInput.setEditable(true); 
        baseInput.setValue(0); 
        baseInput.setColumns(10); 


        heightInput = new JFormattedTextField(NumberFormat.getIntegerInstance()); 
        heightInput.setEditable(true); 
        heightInput.setValue(0); 
        heightInput.setColumns(10); 



        //layout 
        setLayout(new GridBagLayout()); 

        //position the height label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10);
        layout.gridx = 0; 
        layout.gridy = 0; 
        add(heightLabel, layout);


        //position the height text field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 0; 
        add(heightInput,layout); 


        //position the base label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridy = 1; 
        add(baseLabel,layout); 

        //position the base text field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 1; 
        add(baseInput,layout); 


        //result label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 0; 
        layout.gridy = 2; 
        add(areaLabel, layout); 


        //result text field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.gridx = 1; 
        layout.gridy = 2; 
        add(areaField,layout); 


        //JButton 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10);
        layout.gridx = 0; 
        layout.gridy = 4; 
        add(calculate,layout);

        
    }


    @Override 
    public void actionPerformed(ActionEvent event) 
    {
        int height; 
        int base; 

        TriangleArea triangle = new TriangleArea();

        base = ((Number) baseInput.getValue()).intValue(); 
        height = ((Number) heightInput.getValue()).intValue(); 

        areaField.setText(Integer.toString(triangle.getArea(base,height)));

    }


    
    
}
