package com.design.state;
/**
 * 状态模式 主体
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
