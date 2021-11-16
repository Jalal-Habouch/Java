import javax.swing.*;

class TextFields extends JFrame 
{
	JPanel pnl = new JPanel();

	// set the text field column visible width, not the maximum size
	JTextField txt1 = new JTextField(10) ;
	JTextField txt2 = new JTextField( "Default Text", 38 ) ;
	
	// creating textarea object with 5 lines and 37 character width
	JTextArea txtArea = new JTextArea( 5, 37 ) ;
	
	// invisible input characters
	JPasswordField pass = new JPasswordField(8);
	
	// using text area as argument for the JScrollPane
	JScrollPane pane = new JScrollPane( txtArea ) ;

	public TextFields()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		// (T) to wrap lines if too long to fit in the field width
		txtArea.setLineWrap( true ) ;
		
		// wrapping at character(F) or word(T) boundaries 
		txtArea.setWrapStyleWord( true ) ;

		// scroll bar mode 
	//	pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		pnl.add( txt1 ) ;
		pnl.add( txt2 ) ;
		pnl.add(pass);
		pnl.add( pane ) ;

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		TextFields gui = new TextFields();
	} 
}
