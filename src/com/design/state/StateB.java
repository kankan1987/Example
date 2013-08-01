package com.design.state;

public class StateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new StateA());
	}

	public String getState(){
		return "½øÈëB×´Ì¬.......";
	}
}
