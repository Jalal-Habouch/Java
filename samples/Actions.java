import javax.swing.* ;
import java.awt.event.* ; // package needed to add event listeners

class Actions extends JFrame implements ActionListener
// ActionListener recognizes push button events.
{
	JPanel pnl = new JPanel() ;

	JButton btn1 = new JButton( "Button 1" ) ;
	JButton btn2 = new JButton( "Button 2" ) ;
	JTextArea txtArea = new JTextArea( 5 , 38 ) ;

	public Actions()
	{
		super("Swing Window");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		btn1.addActionListener(this); // generates an event when btn1 gets clicked.
		btn2.addActionListener(this);

		//btn2.setEnabled( false ) ;
		//txtArea.setText( "Button 2 is Disabled" ) ;

		pnl.add( btn1 ) ;
		pnl.add( btn2 ) ;
		pnl.add( txtArea ) ;	
		
		setVisible( true );
	}

	// once the ActionListener recognizes the event of the button, it seeks
	// event-handler to to execute a response
	public void actionPerformed( ActionEvent event )
	{
		// getActionCommand method returns button text or content of text field.
		//txtArea.setText( event.getActionCommand() + " Clicked and Disabled" ) ;
		
		// getSource method identifies the object that generated the event
		if( event.getSource() == btn1) 
		{
			btn2.setEnabled( true ); 
			btn1.setEnabled( false ) ;
			txtArea.setText("you have click button1");
		}		
		
		if( event.getSource() == btn2)
		{
			btn1.setEnabled( true );
			btn2.setEnabled( false ) ;
			txtArea.setText("you have click button2");
		}	
	}

	public static void main( String[] args )
	{
		Actions gui = new Actions();
	}
}
