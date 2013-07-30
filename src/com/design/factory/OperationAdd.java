package com.design.factory;

public class OperationAdd extends Operation {

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return this.getNumberA()+this.getNumberB();
	}

}
