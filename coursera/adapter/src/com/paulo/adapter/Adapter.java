package com.paulo.adapter;

public class Adapter {

	public static void main(String[] args) {
		CoffeeMachineInterface coffeMachine = new CoffeeTouchscreenAdapter();
		coffeMachine.chooseFirstSelection();
		coffeMachine.chooseSecondSelection();
	}

}
