package com.design.factory;

/**
 * 工厂接口的实现
 * @author kk
 *
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
