
public class Collision {
int collision;
int direct;
int player;


public int collide(int collision, int player){
	
	if ((collision == 60) && (player == 1)){
    	
    	direct = 0;
    
    	}
    	
    	if ((collision >= -10) && (collision <= 0) && (player == 1)){
    		
    		direct = 1;
    	}
    	
    	if ((collision >= 10) && (collision <= 20) && (player == 1)){
    		
    		direct = 2;
    	}
    	
    	if ((collision >= 30) && (collision <= 50) && (player == 1)){
    		direct = 3;
    	}
    	
    	if ((collision >= 61) && (collision <= 90) && (player == 1)){
    		
    		direct = 4;
    	}
    	
    	if ((collision >= 100) && (collision <= 110) && (player == 1)){
    		
    		direct = 5;
    	}
    	
    	if ((collision >= 120) && (collision <= 130) && (player == 1)){
    		
    		direct = 6;
    	}
    	
    	if ((collision == 60) && (player == 2)){
        	
        	direct = 10;
           	}
    	
    	if ((collision >= -10) && (collision <= 0) && (player == 2)){
    		
    		direct = -1;
    	}
    	
    	if ((collision >= 10) && (collision <= 20) && (player == 2)){
    		System.out.println("collision2");
    		direct = -2;
    	}
    	
    	if ((collision >= 30) && (collision <= 50) && (player == 2)){
    		
    		direct = -3;
    	}
    	
    	if ((collision >= 61) && (collision <= 90) && (player == 2)){
    		
    		direct = -4;
    	}
    	
    	if ((collision >= 100) && (collision <= 110) && (player == 2)){
    		
    		direct = -5;
    	}
    	
    	if ((collision >= 120) && (collision <= 130) && (player == 2)){
    		
    		direct = -6;
    	}
    	
     return	direct;
}
}