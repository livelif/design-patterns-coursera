package com.paulo.state;

public class StateApp {

	public static void main(String[] args) {
		CoffeMachine coffeMachine = new CoffeMachine();
		coffeMachine.depositMoney(coffeMachine, 10);
		coffeMachine.fillCup(coffeMachine);
		System.out.println(coffeMachine.QUANTITY_IN_MILILITERS);
		
		coffeMachine = new CoffeMachine();
		coffeMachine.depositMoney(coffeMachine, 10);
		coffeMachine.fillCup(coffeMachine);
		System.out.println(coffeMachine.QUANTITY_IN_MILILITERS);
		
		
		coffeMachine = new CoffeMachine();
		coffeMachine.depositMoney(coffeMachine, 10);
		coffeMachine.fillCup(coffeMachine);
		System.out.println(coffeMachine.QUANTITY_IN_MILILITERS);
	}

}
