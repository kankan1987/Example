package com.design.state;
/**
 * ״̬ģʽ ״̬
 * @author kk
 *
 */
abstract class State {
	public abstract void handle(Context context);
	
	public abstract String getState(); 
}
