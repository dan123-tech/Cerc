package CERC;
import javax.swing.*;
import java.awt.event.*;

public class  Cerc extends JFrame implements ActionListener {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final double raza = 0;
	private JButton butonCalculeaza;
    private JTextField razaTextField;
    private JTextField rezultatTextField;
    
    public  Cerc() {
        setTitle("Calcul Aria Cerc");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JPanel panel = new JPanel();
        
        JLabel razaLabel = new JLabel("Raza:");
        panel.add(razaLabel);
        
        razaTextField = new JTextField(10);
        panel.add(razaTextField);
        
        butonCalculeaza = new JButton("Calculeaza");
        butonCalculeaza.addActionListener(this);
        panel.add(butonCalculeaza);
        
        JLabel rezultatLabel = new JLabel("Rezultat:");
        panel.add(rezultatLabel);
        
        rezultatTextField = new JTextField(10);
        rezultatTextField.setEditable(false);
        panel.add(rezultatTextField);
        
        String[] items1 = { "cerc", "cilindru", };
		JComboBox<String> dropdown1 = new JComboBox<>(items1);
		panel.add(dropdown1); 

		
			butonCalculeaza = new JButton("Calculeaza");
	        butonCalculeaza.addActionListener(this);
	        panel.add(butonCalculeaza);
		
				add(panel);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == butonCalculeaza) {
            double raza = Double.parseDouble(razaTextField.getText());
            Cerc cerc = new Cerc();
            double aria = cerc.calculeazaAria(raza);
            rezultatTextField.setText(String.valueOf(aria));
        }
    }
    
    private double calculeazaAria(double raza) {
		// TODO Auto-generated method stub
    	double area = Math.PI * raza*raza	;
	    return area;
	}

	public static void main(String[] args) {
        new  Cerc();
    }

	public double getRaza() {
		return raza;
	}
	public double ArieCilindru(double raza) {
		return raza;
		
	}
}
