package com.paulo.command;

public class CommandApp {

	public static void main(String[] args) {
		Executer executer = new Executer();
		
		executer.execute(new WriteTextCommand("Text"));
		executer.execute(new SaveTextCommand());
	}

}
