
public class Ball {
int x;
int y;
int dirTwo;
int sOne;
int collision;

public Ball(){
	x = 290;
	y = 345;
	sOne = 1;
}

public int getX(){
	return x;
}

public int getY(){
	return y;
}

public int getDirection(){
	return dirTwo;
}

public int getSpeed(){
	return sOne;
}

public int getCollision(){
	return x - 290;
}

public int changeDirection(int direction){
	return direction;
}

}

