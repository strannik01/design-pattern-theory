package com.dev21.pd7.decorator;

public class ConcreteComponent extends Component {

	@Override
	public void makeHouse() {
		System.out.println("Original House is complete. It is closed for modification.");
	}

}
