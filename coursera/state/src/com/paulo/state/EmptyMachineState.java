package com.paulo.state;

public class EmptyMachineState implements State {

	@Override
	public void depositMoney(CoffeMachine coffeMachine, double amount) {
		sendMessage();
	}

	@Override
	public void fillCup(CoffeMachine coffeMachine) {
		sendMessage();
	}

	@Override
	public void emptyMachine(CoffeMachine coffeMachine) {
		sendMessage();
	}
	
	private void sendMessage() {
		System.out.println("The machine is out of coffee");
	}

}
