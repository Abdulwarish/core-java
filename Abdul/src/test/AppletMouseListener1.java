package test;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletMouseListener1 extends Applet implements MouseListener{
	public void init(){
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent me){
		showStatus("Mouse Presded..");
	}
	public void mouseClicked(MouseEvent me){
		showStatus("mouse Clicked");
	}
	
	public void mouseExited(MouseEvent e) {
		showStatus("mouse exited");
		
	}
	
	public void mouseReleased(MouseEvent e) {
		showStatus("mouse Released");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		showStatus("mouse enterd");
		
	}
	public void paint(Graphics g) {
		setBackground(Color.blue);
		setForeground(Color.CYAN);
		String msg = null;
		g.drawString(msg, 200, 200);
		}
}