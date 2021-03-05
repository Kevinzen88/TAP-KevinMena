package ejercicio.ejercicio1;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{
  /**
  *
  */
  private static final long serialVersionUID = 1L;
  public Main() {
    this.setSize(300,200);
    this.setVisible(true);
  }
  Run|Debug
    public static void main ( String args[]) {
    Main window = new Main();
    window.addwindowListener(new windowadapter(){
      public void windowclosing(windowEvent e) {
        System.exit(0);
      }
    });
  }
}
