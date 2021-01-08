package com.paulo.state;

public class FillCupState implements State{

	private static final int ML_PER_CENTS = 50;
	
	@Override
	public void depositMoney(CoffeMachine coffeMachine, double amount) {
		System.out.println("Is not necessary deposit money");
	}

	@Override
	public void fillCup(CoffeMachine coffeMachine) {
		
		if (!(coffeMachine.getCurrentState() instanceof EmptyMachineState)) {
			System.out.println("Wait 5 seconds");
			System.out.println("Coffe filled");
			if (coffeMachine.QUANTITY_IN_MILILITERS == 0) {
				emptyMachine(coffeMachine);
			}
			coffeMachine.QUANTITY_IN_MILILITERS = coffeMachine.QUANTITY_IN_MILILITERS - ML_PER_CENTS * coffeMachine.getAmoutDeposit();
		} else {
			emptyMachine(coffeMachine);
		}
	}


}
