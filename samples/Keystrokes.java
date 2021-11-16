import javax.swing.*;
import java.awt.event.* ;	

class Keystrokes extends JFrame implements KeyListener 
// KeyListener recognizes keyboard events when a key is pressed or released
{
	JPanel pnl = new JPanel();

	JTextField field  = new JTextField( 38 ) ;	
	JTextArea txtArea = new JTextArea( 5, 38 ) ;

	public Keystrokes()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		field.addKeyListener( this ) ; 
	
		pnl.add( field );	
		pnl.add( txtArea );

		setVisible( true );
	}

	public void keyPressed( KeyEvent event )	
	{
		txtArea.setText("Key Pressed") ;
	}

	public void keyReleased( KeyEvent event )	
	{
		int keyCode = event.getKeyCode();
		txtArea.append( "\nKey Code : " + keyCode );
		txtArea.append( "\nKey Text : " + event.getKeyText(keyCode));
	}

	public void keyTyped( KeyEvent event )	
	{
		txtArea.append("\nCharacter : " + event.getKeyChar()) ;
	}


	public static void main ( String[] args )
	{
		Keystrokes gui = new Keystrokes();
	} 
}

