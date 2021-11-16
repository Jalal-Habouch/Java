import javax.swing.* ;
// abstract window toolkit package
import java.awt.* ;

class Custom extends JFrame
{
	JPanel pnl = new JPanel();

	JLabel lbl1 = new JLabel( "Custom Background" ) ;
	JLabel lbl2 = new JLabel( "Custom Foreground" ) ;
	JLabel lbl3 = new JLabel( "Custom Font" ) ;

	// font and color classes
	Color customColor = new Color( 255, 0, 0 ) ;
	Font customFont = new Font("serif", Font.BOLD, 32 );

	public Custom()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		//  font and color methods
		lbl1.setOpaque( true ) ;		
		lbl1.setBackground( Color.YELLOW ) ;
		
		lbl2.setForeground( customColor ) ;
		
		lbl3.setFont( customFont ) ;

		pnl.add(lbl1);
		pnl.add(lbl2);
		pnl.add(lbl3);

		setVisible( true );
	}
	

	public static void main( String[] args ) 
	{
		Custom gui = new Custom() ;
	}	
}
