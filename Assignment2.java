import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Assignment2 extends JPanel implements Runnable
 {
    
  double circleMove = 0;
  double squareRotate = 0;
  double Move = 0; 
  
     double x = 0;
     double y = 500;
     double angle = -60;
     double velocityX, velocityY;
     double move_x = 8;
     double move_A = 1;
     double width = 600;

     
  private final static Color Color_GR = Color.decode("#006622"); 
  private final static Color Color_GR1 = Color.decode("#00cc44");  
  private final static Color Color_GR2 = Color.decode("#008000");    

  private final static Color Color_sand1 = Color.decode("#ffcc99");    
  private final static Color Color_sand2 = Color.decode("#ffbf80");    
  private final static Color Color_sand3 = Color.decode("#ffb366");    
  private final static Color Color_sand4 = Color.decode("#ffa64d");    
  private final static Color Color_sand5 = Color.decode("#ff9933");    
  private final static Color Color_sand6 = Color.decode("#ff8c1a");    
  private final static Color Color_sand7 = Color.decode("#ff8000");    
  private final static Color Color_sand8 = Color.decode("#e67300");    
  private final static Color Color_sand9 = Color.decode("#cc6600");    
  private final static Color Color_sand10 = Color.decode("#b35900");  
  private final static Color Color_sand11 = Color.decode("#994d00");  
  private final static Color Color_sand12 = Color.decode("#804000");
  private final static Color Color_sand13 = Color.decode("#663300");
  private final static Color Color_sand14 = Color.decode("#4d2600");
  private final static Color Color_sand15 = Color.decode("#331a00");

  private final static Color Color_wt1 = Color.decode("#005c99");
  private final static Color Color_wt2 = Color.decode("#006bb3");
  private final static Color Color_wt3 = Color.decode("#007acc");
  private final static Color Color_wt4 = Color.decode("#008ae6");
  private final static Color Color_wt5 = Color.decode("#0099ff");
  private final static Color Color_wt6 = Color.decode("#1aa3ff");
  private final static Color Color_wt7 = Color.decode("#33adff");
  private final static Color Color_wt8 = Color.decode("#4db8ff");
  
  private final static Color Color_wt9 = Color.decode("#ccebff");
  
  private final static Color Color_wtb = Color.decode("#331a00");
  public static void main (String[]args) 
  {
    Assignment2 m = new Assignment2();
   JFrame f = new  JFrame();
   f.add(m);
   f.setTitle("Time");  
   f.setSize(600,600); 
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   f.setVisible(true);  
   (new Thread (m)).start();
  }
  public void run() 
  {
   double lastTime= System.currentTimeMillis();
   double currentTime, elapsedTime;
   double Alltime = 0;
 
   while(true) 
   {
    

    currentTime = System.currentTimeMillis();
    elapsedTime = currentTime - lastTime;
    lastTime = currentTime;
 

           circleMove += 50.0 * elapsedTime / 1000.0;
          
           x += velocityX * elapsedTime / 1000.0;
           y += velocityY * elapsedTime / 1000.0;
     
           Alltime +=  elapsedTime/1000;
     if((Alltime) > 3 )
     {
      squareRotate += 100 * elapsedTime / 1000.0;
     }
 
    repaint();
          }
   
  }
 
  public void paintComponent (Graphics g)
  {
   
    
   Graphics2D g2 = (Graphics2D)g;
  
   

   g2.setColor(Color.BLACK);
   g2.fillRect(0, 0, 600, 600);
   g2.setColor(Color.WHITE);
   midpointCircleA(g2, 5, 10, 42);
   midpointCircleA(g2, 5, 120, 41);
   midpointCircleA(g2, 5, 382, 44);
   midpointCircleA(g2, 5, 244, 39);
   midpointCircleA(g2, 5, 494, 39);

   midpointCircleA(g2, 5, 16, 213);
   midpointCircleA(g2, 5, 139, 195);
   midpointCircleA(g2, 5, 418, 189);
   midpointCircleA(g2, 5, 237, 192);
   midpointCircleA(g2, 5, 477, 177);

   midpointCircleA(g2, 5, 46, 113);
   midpointCircleA(g2, 5, 189, 115);
   midpointCircleA(g2, 5, 468, 139);
   midpointCircleA(g2, 5, 237, 122);
   midpointCircleA(g2, 5, 357, 147);

   
   g2.setColor(Color_wt9);
   g2.fillRect((int)circleMove, 0, 600, 600);

//เมฆ
    g2.setColor(Color.BLUE);
    midpointEllipseA(g2, (int)circleMove+50, 50, 50, 10);
    midpointCircleA(g2, 15, (int)circleMove+25, 42);
    midpointCircleA(g2, 25, (int)circleMove+50, 37);
    midpointCircleA(g2, 15, (int)circleMove+75, 42);

    g2.setColor(Color.BLUE);
    midpointEllipseA(g2, (int)circleMove+50+200, 50, 50, 10);
    midpointCircleA(g2, 15, (int)circleMove+25+200, 42);
    midpointCircleA(g2, 25, (int)circleMove+50+200, 37);
    midpointCircleA(g2, 15, (int)circleMove+75+200, 42);

    
    midpointCircleA(g2, 15, (int)circleMove+25+100+200, 42+60+60);
    midpointCircleA(g2, 25, (int)circleMove+50+100+200, 37+60+60);
    midpointCircleA(g2, 15, (int)circleMove+75+100+200, 42+60+60);

    midpointCircleA(g2, 15, (int)circleMove+25+50, 42+60+60);
    midpointCircleA(g2, 25, (int)circleMove+50+50, 37+60+60);
    midpointCircleA(g2, 15, (int)circleMove+75+50, 42+60+60);

    midpointCircleA(g2, 15, (int)circleMove+25+400, 42+60);
    midpointCircleA(g2, 25, (int)circleMove+50+400, 37+60);
    midpointCircleA(g2, 15, (int)circleMove+75+400, 42+60);
//------

   g2.setColor(Color_GR2);
   midpointCircleA(g2, 50, 200, 250);

   g2.setColor(Color_GR1);
   midpointEllipseA(g2, 150, 300, 200, 80);

   g2.setColor(Color_GR);
   midpointEllipseA(g2, 400, 300, 250, 100);
   
   
   
   g2.setColor(Color.ORANGE);
   midpointCircleA(g2, 50, (int)circleMove-200, 100);

   Move = Move + move_x;
       if (Move < 0) {
              Move = 0;
              move_x = -move_x;
       } else if (Move >= width) {
              Move = width ;
              move_x = -move_x;
       }

   

   

   g2.setColor(Color_wt1);
   midpointEllipseA(g2, 300, 350, 400, 80);
   g2.setColor(Color_wt2);
   midpointEllipseA(g2, 300, 360, 400, 80);
   g2.setColor(Color_wt3);
   midpointEllipseA(g2, 300, 370, 400, 80);
   g2.setColor(Color_wt4);
   midpointEllipseA(g2, 300, 380, 400, 80);
   g2.setColor(Color_wt5);
   midpointEllipseA(g2, 300, 390, 400, 80);
   g2.setColor(Color_wt6);
   midpointEllipseA(g2, 300, 400, 400, 80);
   g2.setColor(Color_wt7);
   midpointEllipseA(g2, 300, 410, 400, 80);
   g2.setColor(Color_wt8);
   midpointEllipseA(g2, 300, 420, 400, 80);

//ทราย
   g2.setColor(Color_sand1);
   midpointEllipseA(g2, 300, 455, 400, 80);

   g2.setColor(Color_sand2);
   midpointEllipseA(g2, 300, 470, 400, 80);

   g2.setColor(Color_sand3);
   midpointEllipseA(g2, 300, 480, 400, 80);

   g2.setColor(Color_sand4);
   midpointEllipseA(g2, 300, 490, 400, 80);

   g2.setColor(Color_sand5);
   midpointEllipseA(g2, 300, 500, 400, 80);

   g2.setColor(Color_sand6);
   midpointEllipseA(g2, 300, 510, 400, 80);

   g2.setColor(Color_sand7);
   midpointEllipseA(g2, 300, 520, 400, 80);

   g2.setColor(Color_sand8);
   midpointEllipseA(g2, 300, 530, 400, 80);

   g2.setColor(Color_sand9);
   midpointEllipseA(g2, 300, 540, 400, 80);

   g2.setColor(Color_sand10);
   midpointEllipseA(g2, 300, 550, 400, 80);

   g2.setColor(Color_sand11);
   midpointEllipseA(g2, 300, 560, 400, 80);
   g2.setColor(Color_sand12);
   midpointEllipseA(g2, 300, 570, 400, 80);
   g2.setColor(Color_sand13);
   midpointEllipseA(g2, 300, 580, 400, 80);
   g2.setColor(Color_sand14);
   midpointEllipseA(g2, 300, 590, 400, 80);
   g2.setColor(Color_sand15);
   midpointEllipseA(g2, 300, 600, 400, 80);


//ทราย
   //เรือ
   g2.setColor(Color_wtb);
   midpointEllipse(g2, (int)circleMove, 345, 50, 10);
   
   g2.setColor(Color_wtb);
   midpointEllipse(g2, (int)circleMove, 350, 50, 10);
   midpointEllipse(g2, (int)circleMove, 300, 15, 50);
  
  //----
  
   
   g2.translate((int)circleMove, 0);
   
   
   g2.setColor(Color.RED);
   g2.fillOval((int)circleMove, 0, 100, 100);
   
   
    circleMove = circleMove + move_x;
       if (circleMove < 0) {
              circleMove = 0;
              move_x = -move_x;
       } else if (circleMove >= width ) {
              circleMove = 0;
              move_x = 0;
       }
       //ต้นไม้
       
       //----
     

  }
 public void midpointEllipseA(Graphics g, int xc, int yc, int a, int b)
 {
    Graphics2D g2 = (Graphics2D)g;
     for (int i=0;i<=yc;i++){
         midpointEllipse( g,  xc,yc,i, b);
     }
     g2.fillRect(xc, yc-b, 1,2*b);
 }
 
 public void midpointCircleA(Graphics g, int r, int xc, int yc){
    Graphics2D g2 = (Graphics2D)g;
    for (int i=0;i<=r;i++){
        midpointCircle( g, i,xc, yc);
    }
 }
public void midpointCircle(Graphics g, int r, int xc, int yc) {
    int x = 0;
    int y = r;
    int d = 1 - r;

    while (x <= y) {
        plot(g, x + xc, y + yc, 2);
        plot(g, x + xc, -y + yc, 2);
        plot(g, -x + xc, y + yc, 2);
        plot(g, -x + xc, -y + yc, 2);

        plot(g, y + xc, x + yc, 2);
        plot(g, y + xc, -x + yc, 2);
        plot(g, -y + xc, x + yc, 2);
        plot(g, -y + xc, -x + yc, 2);

        x++;

        d = d + 2 * x + 1;

        if (d >= 0) {
            y--;
            d = d - 2 * y;
        }
    }
}

public void midpointEllipse(Graphics g, int xc, int yc, int a, int b) {
    // Region 1
    int x = 0;
    int y = b;

    int d = Math.round(b * b - a * a * b + a * a / 4);

    while (b * b * x <= a * a * y) {
        plot(g, x + xc, y + yc, 3);
        plot(g, -x + xc, y + yc, 3);
        plot(g, x + xc, -y + yc, 3);
        plot(g, -x + xc, -y + yc, 3);
        x++;

        d = d + 2 * b * b * x + b * b;
        if (d >= 0) {
            y--;
            d = d - 2 * a * a * y;
        }
    }

    // Region 2
    x = a;
    y = 0;

    d = Math.round(a * a - b * b * a + b * b / 4);

    while (b * b * x >= a * a * y) {
        plot(g, x + xc, y + yc, 1);
        plot(g, -x + xc, y + yc, 1);
        plot(g, x + xc, -y + yc, 1);
        plot(g, -x + xc, -y + yc, 1);

        y++;

        d = d + 2 * a * a * y + a * a;
        if (d >= 0) {
            x--;
            d = d - 2 * b * b * x;
        }
    }
}

private void plot(Graphics g, int x, int y, int size) {
    g.fillRect(x, y, size, size);
}
  
 } 
