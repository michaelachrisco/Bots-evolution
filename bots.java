//Dumb actions by bots. Action commander will be put on top of this class.

public class bot {
	public class java {

	}
	private boolean Food;
	private int X_axis;
//	private int Y_axis;
//	private boolean eye;
	
	
	public bot(int x_axis){
		Food=false;
		X_axis=x_axis;
	}
//moves the bot 1 right	
	public void command_move_x_right(){
		X_axis=X_axis+1;
		System.out.println("moved right now:"+X_axis);
	}
//moves the bot 1 left
	public void command_move_x_left(){
		X_axis=X_axis-1;
		System.out.println("moved left now:"+X_axis);
	}
	public void found_food(){
		Food=true;
		System.out.println("Food has been found!");
	}
	
}


