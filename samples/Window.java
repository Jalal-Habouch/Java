// to include user interface components
// like buttons, textfields, etc
import javax.swing.*;

//Window class inherits JFrame attributes
class Window extends JFrame    
{
	JPanel pnl = new JPanel(); // creating a panel object on the frame
	
	public Window() // the constructor
	{
		super("title");
		setSize( 400,600 );   // set the width, height of Window
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		setVisible( true );
	}

	public static void main ( String[] args )
	{
		// creating new window object
		Window gui = new Window();
	} 
}
