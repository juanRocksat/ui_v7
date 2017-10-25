package entrada_salida;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestField3 extends TestField2
{
	private JTextField user=new JTextField();
	private JTextField pass = new JTextField();
	private JButton bLogin = new JButton("Ingresar");
	
	private void seteoDeEspacios()
	{
		setLayout(null);
		setSize(300,300);
		user.setBounds(10,50,100,100);
		pass.setBounds(10,70,100,100);
		add(user);add(pass);
		bLogin.setBounds(10,110,100,100);
		add(bLogin);
		bLogin.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bLogin)
		{
			mostrarLoginCorrecto();
		}
	}
	private void mostrar()
	{
		setear();
		setBounds(5,5,140,150);
		setVisible(true);
	}
	private void mostrarLoginCorrecto()
	{
		if(pass.getText()=="1234")
		{
			mostrarEmergente("Correcto !!");
		}
		else{
			mostrarEmergente("!Error  !");
		}
	}
	private void mostrarEmergente(String s)
	{
		JOptionPane.showMessageDialog(null,s);
	}
	public static void main(String[] args) throws InterruptedException
	{
		(new TestField3()).mostrar();
		disponiblePorSegundos(20);
		
	}

}
