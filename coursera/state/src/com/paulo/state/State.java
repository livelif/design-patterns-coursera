package com.paulo.state;

public interface State {

	void depositMoney(CoffeMachine coffeMachine, double amount);
	void fillCup(CoffeMachine coffeMachine);
	default void emptyMachine(CoffeMachine coffeMachine) {
		System.out.println("Machine is Empty");
		coffeMachine.setCurrentState(new EmptyMachineState());
	}
}
