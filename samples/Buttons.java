//to enable graphic interfaces.
import javax.swing.*;

class Buttons extends JFrame 
{
//creating a panel for the window.	
	JPanel pnl = new JPanel();

	ClassLoader ldr = this.getClass().getClassLoader();

	// step 1
//to create the link to the Image to be displayed on the button
	java.net.URL tickURL = ldr.getResource("duke.png");
	java.net.URL crossURL = ldr.getResource("cross.png");

	// step 2
//use the linked image as an image icon for the button.
	ImageIcon tick = new ImageIcon( ldr.getResource("duke.png") );
	ImageIcon cross = new ImageIcon( crossURL );

	// merging steps 1 and 2
//ImageIcon tick = new ImageIcon( "tick.png" );
//ImageIcon cross = new ImageIcon( "cross.png" );

	// creating three new buttons
	JButton btn = new JButton( "click Me" );
	JButton tickBtn = new JButton( tick );
	JButton crossBtn = new JButton( "STOP", cross );
	
	public Buttons()
	{
		super("The Buttons Window");
		setSize( 500,200 );  // setSize(w,h)
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		
		pnl.add( btn );
		pnl.add( tickBtn );
		pnl.add( crossBtn );

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		Buttons gui = new Buttons();
	} 
}
