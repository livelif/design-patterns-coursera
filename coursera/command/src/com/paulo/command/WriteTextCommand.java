package com.paulo.command;

public class WriteTextCommand implements Command{

	private String text;
	
	public WriteTextCommand(String text) {
		this.text = text;
	}

	@Override
	public void execute() {
		Paper.writeText(text);
	}

	@Override
	public void unexecute() {
		System.out.println("Unable to execute command");
	}

}
