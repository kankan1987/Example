package com.design.state;
/**
 * ״̬ģʽ ����
 * @author kk
 *
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println(this.state.getState());
	}
	
	public void Request(){
		this.state.handle(this);
	}
}
