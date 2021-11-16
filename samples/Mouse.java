import javax.swing.* ;
import java.awt.event.* ;	

class Mouse extends JFrame implements MouseMotionListener, MouseListener 	
// MouseListener recognizes mouse button actions and movement.
{
	JPanel pnl = new JPanel() ;

	JTextArea txtArea = new JTextArea( 8, 38 ) ;	
	int x, y ;

	public Mouse()
	{
		super("Swing Window");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		txtArea.addMouseMotionListener(this);	
		txtArea.addMouseListener(this);

		pnl.add( txtArea ) ;			

		setVisible( true );
	}

	public void mouseMoved   ( MouseEvent event) { x = event.getX(); y = event.getY();	}		
	public void mouseDragged ( MouseEvent event) {	}

	public void mouseEntered ( MouseEvent event) { txtArea.setText( "Mouse Entered" );	}
	public void mousePressed ( MouseEvent event) { txtArea.append( "\nMouse Pressed at X:" + x + " Y:" + y );	}	
	public void mouseReleased( MouseEvent event) { txtArea.append( "\nMouse Released") ;	}	
	public void mouseClicked ( MouseEvent event) {	}	
	public void mouseExited  ( MouseEvent event) {	}

	public static void main( String[] args )
	{
		Mouse gui = new Mouse();
	}
}
