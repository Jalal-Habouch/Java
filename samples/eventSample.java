import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eventSample extends JFrame implements ActionListener{

	JPanel pnl = new JPanel();
	JLabel head= new JLabel("ARITHMETIC");
	
	Font f1= new Font("Mono", Font.BOLD, 22);
	
	JTextField t1 = new JTextField(15);
	JTextField t2 = new JTextField(15);
	JButton op_btn_add = new JButton(" + ");
	JButton op_btn_minus = new JButton(" - ");
	JButton op_btn_multi = new JButton(" x ");
	JButton op_btn_divid = new JButton(" / ");
	JButton clr = new JButton("CLR");
	
	JTextField ans = new JTextField("0",15);
	
	public eventSample(){
		super("events program");
		setSize(200,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
		add(pnl);
		head.setFont(f1);
		pnl.add(head);
		pnl.add(t1);
		pnl.add(t2);
		
		op_btn_add.addActionListener(this);
		op_btn_minus.addActionListener(this);
		op_btn_multi.addActionListener(this);
		op_btn_divid.addActionListener(this);
		clr.addActionListener(this);
		
		pnl.add(op_btn_add);
		pnl.add(op_btn_minus);
		pnl.add(op_btn_multi);
		pnl.add(op_btn_divid);
		pnl.add(ans);
		pnl.add(clr);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		int var1 = Integer.parseInt(t1.getText());
		int var2 = Integer.parseInt(t2.getText());
		int result=0;
		
		if(event.getSource()==op_btn_add)
		{
		result = var1+var2;
		ans.setText(Integer.toString(result));
		}
		
		if(event.getSource()==op_btn_minus)
		{
		result = var1-var2;
		ans.setText(Integer.toString(result));
		}
		
		if(event.getSource()==op_btn_multi)
		{
		result = var1*var2;
		ans.setText(Integer.toString(result));
		}
		if(event.getSource()==op_btn_divid)
		{
		result = var1/var2;
		ans.setText(Integer.toString(result));
		}
		
		if(event.getSource()==clr)
		{
		result = 0;
		ans.setText(Integer.toString(result));
		t1.setText("0");
		t2.setText("0");
		}
	
	}

	public static void main(String[] args) {

		eventSample win1 = new eventSample();
	}

}
