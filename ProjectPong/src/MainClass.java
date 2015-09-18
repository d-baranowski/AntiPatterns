import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import javax.swing.JFrame;

public class MainClass extends JFrame {
	Random generator = new Random();
	
	private Image dbImage;
	private Graphics dbg;
	Player one = new Player();
	Player two = new Player();
	Ball bOne = new Ball();
	Collision cOne = new Collision();
	String score = (" Player 1: " + one.s + " Player 2: " + two.s);
	
	
	
	javax.swing.Timer t = new javax.swing.Timer(30, new ActionListener(){
		int cTwo;
		String initialScore = score;
		
    	public void actionPerformed(ActionEvent d){
    		if(bOne.y <= one.y + 20){
        		cTwo = 0;
        		cTwo = bOne.x - one.x;
            
        		if 	((cTwo >= -10) && (cTwo < 135)){
        			one.touched = true;
        			two.touched = false;
        			bOne.sOne = bOne.sOne + 0;
        			cOne.collide(cTwo, 1);
        			bOne.dirTwo = cOne.direct;
        	}
        	}
        	
        	if(bOne.y >= two.y - 20){
        		cTwo = 0;
            	cTwo = bOne.x - two.x;	
        	
        		if ((cTwo >= -10) && (cTwo < 135)){
        		two.touched = true;
            	one.touched = false;
            	bOne.sOne = bOne.sOne + 0;
            	cOne.collide(cTwo, 2);
            	bOne.dirTwo = cOne.direct;
        		}
        		}	
    	    	
    	if ((bOne.x >= 580) && (one.touched)){
    		bOne.dirTwo = 2;
    	}
    	
    	if ((bOne.x <= 0) && (one.touched)){
    		bOne.dirTwo = 5;
    	}
    	
    	if ((bOne.x >= 580) && (two.touched)){
    		bOne.dirTwo = -2;
    	}
    	
    	if ((bOne.x <= 0) && (two.touched)){
    		bOne.dirTwo = -5;
    	}
    	
    	if (bOne.dirTwo == 0){
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 10){
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 1){
    		bOne.x = bOne.x - (15 * bOne.sOne);
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 2){
    		bOne.x = bOne.x - (10 * bOne.sOne);
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 3){
    		bOne.x = bOne.x - (5 * bOne.sOne);
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 4){
    		bOne.x = bOne.x + (5 * bOne.sOne);
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 5){
    		bOne.x = bOne.x + (10 * bOne.sOne);
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == 6){
    		bOne.x = bOne.x + (15 * bOne.sOne);
    		bOne.y = bOne.y + (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == -1){
    		bOne.x = bOne.x - (15 * bOne.sOne);
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == -2){
    		bOne.x = bOne.x - (10 * bOne.sOne);
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == -3){
    		bOne.x = bOne.x - (5 * bOne.sOne);
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == -4){
    		bOne.x = bOne.x + (5 * bOne.sOne);
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == -5){
    		bOne.x = bOne.x + (10 * bOne.sOne);
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if (bOne.dirTwo == -6){
    		bOne.x = bOne.x + (15 * bOne.sOne);
    		bOne.y = bOne.y - (5 * bOne.sOne);
    	}
    	
    	if(bOne.y <= one.y - 20){
     	two.s = two.s + 1;
     	score = (" Player 1: " + one.s + " Player 2: " + two.s);
     	bOne.dirTwo = 10;
     	}
     	
     	if(bOne.y >= two.y + 20){
     		one.s = one.s + 1;
     		score = (" Player 1: " + one.s + " Player 2: " + two.s);
     		bOne.dirTwo = 0;
     		}
     	
    		if (score.equals(initialScore) == false){ 
    			t.start();
    			bOne.y = 345;
            	bOne.x = 290;
    			one.x = 230;
    			one.y = 20;
    			two.x = 230;
    			two.y = 680;
    			one.direction = 0;
    			two.direction = 0;
    			score = (" Player 1: " + one.s + " Player 2: " + two.s);
    			
    	     	t.setInitialDelay(1000);
    	     	t.restart();
    	     	
    			if (two.s > 8){
        			score = ("Player 1 WON !!!");
        			System.out.println(score);
        			t.stop();
        			t2.stop();
        		}
    			if (two.s > 8){
    				System.out.println(" Player 2 WON !!!");
    				t.stop();
    				t2.stop();
    			}
    		   initialScore = score;
    		}
    		
    	
        	
     	
    	    	    	
    	
    	}
    });	
	
	javax.swing.Timer t2 = new javax.swing.Timer(30, new ActionListener(){
			
    	public void actionPerformed(ActionEvent d){
    		if (one.x <= 0)
				one.x = 0;
    		if (one.x >= 450)
				one.x = 450;
    		if (two.x <= 0)
				two.x = 0;
    		if (two.x >= 450)
				two.x = 450;
    		
    	if (one.direction == 1){
    		one.x = one.x - 5;
    	}
    	
    	if (one.direction == 2){
    		one.x = one.x + 5;
    	}
    	if (two.direction == 1){
    		two.x = two.x - 5;
    	}
    	
    	if (two.direction == 2){
    		two.x = two.x + 5;
    	}
        	}
    });	
	
		
	
	public class AL extends KeyAdapter{ 
		 
		
		public void keyPressed(KeyEvent e){
			int keyCode = e.getKeyCode();
			
			if (keyCode == e.VK_A){
				two.direction = 1; 
				}
			if (keyCode == e.VK_D){
				two.direction = 2; 
				}
	
			
			
		}
	}
	
public class AL2 extends KeyAdapter{ 
		 
		
		public void keyPressed(KeyEvent e2){
			int keyCode2 = e2.getKeyCode();
			if (keyCode2 == e2.VK_LEFT){	
				one.direction = 1;
				}
				
			if (keyCode2 == e2.VK_RIGHT){
				one.direction = 2; 
				}
						
		}
	}
	
	
	public MainClass(){
		int roll = generator.nextInt(2);
		if (roll == 0){
			bOne.dirTwo = 10;
		}
		else
			bOne.dirTwo = 0;
		System.out.println("Random " + roll);
		addKeyListener(new AL());
		addKeyListener(new AL2());
		setTitle("Pong Training");
		setSize(600, 700);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		one.x = 230;
		one.y = 20;
		two.x = 230;
		two.y = 680;
		t.start();
		t2.start();
		
	}

	public static void main(String[] args) {
		new MainClass();
				
		
	}
	
	public void paint(Graphics g){
		dbImage = createImage(getWidth(), getHeight()); 
		dbg = dbImage.getGraphics(); 
		paintComponent(dbg); 
		g.drawImage(dbImage,0 ,0, this); 
	
	}
	
	public void paintComponent(Graphics g){
	Font font = new Font("Courier", Font.BOLD,15);
	g.fillOval(bOne.getX(), bOne.getY(), 20, 20);
	g.fillRect(one.x, one.y, 140, 20); 
	g.fillRect(two.x, two.y, 140, 20);
	g.setFont(font);
	g.drawString(score, 340, 365);
	repaint();
	}
}


