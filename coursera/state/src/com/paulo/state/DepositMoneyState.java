package com.paulo.state;

public class DepositMoneyState implements State {

	@Override
	public void depositMoney(CoffeMachine coffeMachine, double amount) {
		if (!(coffeMachine.getCurrentState() instanceof EmptyMachineState)) {
			System.out.println("Money deposited");
			coffeMachine.setCurrentState(new FillCupState());
			coffeMachine.setAmoutDeposit(amount);
		} else {
			emptyMachine(coffeMachine);
		}
		
	}

	@Override
	public void fillCup(CoffeMachine coffeMachine) {
		System.out.println("Deposit money first");
	}

	
}
