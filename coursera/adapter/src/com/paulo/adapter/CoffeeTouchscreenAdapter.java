package com.paulo.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	private OldCoffeeMachine oldMachine;

	public CoffeeTouchscreenAdapter() {
		oldMachine = new OldCoffeeMachine();
	}

	public void chooseFirstSelection() {
		oldMachine.selectA();
	}

	public void chooseSecondSelection() {
		oldMachine.selectB();
	}
}
