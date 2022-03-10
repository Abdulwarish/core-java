package test;
import java.awt.*;
import java. awt.event.*;
import java.applet.*;

public class AppletMouseListener extends Applet implements MouseListener {
public void init() {
addMouseListener(this);
}
public void mouseClicked(MouseEvent me) {
showStatus("Mouse clicked...");
}
public void mouseExited(MouseEvent me) {
showStatus("Mouse exited...");
}
public void mouseEntered(MouseEvent me) {
showStatus("Mouse entered...");
}
public void mouseReleased(MouseEvent me) {
showStatus("Mouse released...");
}
public void mousePressed(MouseEvent me) {
showStatus("Mouse pressed...");
}
}