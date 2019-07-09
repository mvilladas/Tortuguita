package EjemploBase;

import ch.aplu.turtle.Turtle;

public class HIloTriangulosGrandes extends Thread{
     private Turtle tortuga;

    public HIloTriangulosGrandes(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
      this.tortuga.setPos(100,100);
      this.tortuga.left(45);
      this.tortuga.forward(70);
      this.tortuga.left(90);
      this.tortuga.forward(70);
      this.tortuga.left(135);
      this.tortuga.forward(100);
      this.tortuga.left(45);
      this.tortuga.forward(70);
      this.tortuga.left(135);
      this.tortuga.forward(100);
    }
}
