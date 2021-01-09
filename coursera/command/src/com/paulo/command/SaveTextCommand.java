package com.paulo.command;

public class SaveTextCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Save documentation");
	}

	@Override
	public void unexecute() {
		System.out.println("Can't save");
	}

}
