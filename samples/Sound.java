import javax.swing.*;
import java.awt.event.*;	

class Sound extends JFrame implements ActionListener	
{
	JPanel pnl = new JPanel();
	
	ClassLoader ldr = this.getClass().getClassLoader();	
	java.applet.AudioClip audio = JApplet.newAudioClip( ldr.getResource("flourish.mid") );

	JButton playBtn = new JButton("Play");	
	JButton stopBtn = new JButton("Stop");

	public Sound()
	{
		super("Swing Window");
		setSize( 500, 200 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		add(pnl);
	
		playBtn.addActionListener(this);	
		stopBtn.addActionListener(this);

		pnl.add( playBtn );
		pnl.add( stopBtn );
		
		setVisible(true);		
	}

	public void actionPerformed( ActionEvent event )	
	{
		if (event.getSource() == playBtn) audio.play();
		
		if (event.getSource() == stopBtn) audio.stop();
	}

	public static void main(String[] args)
	{
		Sound snd = new Sound();
	}
}
