package com.design.state;

public class StateA extends State {

	@Override
	public void handle(Context context) {
		context.setState(new StateB());
	}
	
	public String getState(){
		return "½øÈëA×´Ì¬.......";
	}
}
