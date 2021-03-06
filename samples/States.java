import javax.swing.*;
import java.awt.event.* ;

class States extends JFrame implements ItemListener 
{
	JPanel pnl = new JPanel();

	JRadioButton rad1 = new JRadioButton( "White" ) ;
	JRadioButton rad2 = new JRadioButton( "Red" ) ;
	ButtonGroup wines = new ButtonGroup();		

	JCheckBox chk = new JCheckBox( "Pepperoni" ) ;	
	JTextArea txtArea = new JTextArea( 5, 38 ) ;

	String[] styles = { "Deep Dish", "Gourmet Style", "Thin & Crispy" } ;	
	JComboBox box = new JComboBox( styles ) ;

	public States()
	{
		super("Swing Window");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
	
		wines.add( rad1 ) ;
		wines.add( rad2 ) ;

		rad1.addItemListener( this ) ;	
		rad2.addItemListener( this ) ;
		chk.addItemListener( this ) ;
		box.addItemListener( this ) ;
		
		pnl.add( rad1 );	
		pnl.add( rad2 );
		pnl.add( chk );
		pnl.add( box );
		pnl.add( txtArea ) ;

		setVisible( true );
	}

	public void itemStateChanged( ItemEvent event )
	{
		if( event.getItemSelectable() == rad1) txtArea.setText( "White wine selected" ) ;
		
		if( event.getItemSelectable() == rad2) txtArea.setText( "Red wine selected" ) ;

		if( ( event.getItemSelectable() == chk) && 
			( event.getStateChange() == ItemEvent.SELECTED ) )
		txtArea.append( "\nPepperoni selected\n" ) ;

		if( ( event.getItemSelectable() == box ) &&
			( event.getStateChange() == ItemEvent.SELECTED ) )
		txtArea.append( event.getItem().toString() + " selected"  );
	}

	public static void main ( String[] args )
	{
		States gui = new States();
	} 
}
