package com.paulo.state;

public class CoffeMachine implements State {

	public static double QUANTITY_IN_MILILITERS = 1000; // 1 liter
	private double amoutDeposit = 0;
	
	private State currentState;

	public CoffeMachine() {
		this.currentState = new DepositMoneyState();
		if (QUANTITY_IN_MILILITERS <= 0) {
			this.currentState = new EmptyMachineState();
		}
	}


	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
	public void setAmoutDeposit(double amoutDeposit) {
		this.amoutDeposit = amoutDeposit;
	}
	
	public double getAmoutDeposit() {
		return amoutDeposit;
	}



	@Override
	public void depositMoney(CoffeMachine coffeMachine, double amount) {
		currentState.depositMoney(coffeMachine, amount);
	}


	@Override
	public void fillCup(CoffeMachine coffeMachine) {
		currentState.fillCup(coffeMachine);
	}

}
