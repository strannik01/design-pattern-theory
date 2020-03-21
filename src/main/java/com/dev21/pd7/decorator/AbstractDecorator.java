package com.dev21.pd.decorator;

public class AbstractDecorator extends Component {
	
	protected Component component;
	
	public void setTheComponent(Component component) {
		this.component = component;
	}

	@Override
	public void makeHouse() {
		if (component != null) {
			component.makeHouse();
		}
	}

}
