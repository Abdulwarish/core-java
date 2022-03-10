package test;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code=AppletKeyListener height=600 width=600></applet>
public class AppletKeyListener extends Applet implements KeyListener {
String msg="YOLO";
public void init() {
addKeyListener(this);
}
public void keyPressed(KeyEvent ke) {
showStatus("Key pressed");
}
public void keyReleased(KeyEvent ke) {
showStatus("Key up");
}
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}
public void paint(Graphics g) {
setBackground(Color.BLACK);
setForeground(Color.CYAN);
g.drawString(msg, 200, 200);
}
}