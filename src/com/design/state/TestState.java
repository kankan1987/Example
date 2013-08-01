package com.design.state;

public class TestState {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new StateA());
		context.Request();
		context.Request();
	}
}
