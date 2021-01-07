package com.paulo.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void add(IComponent comp) {
		playlist.add(comp);
	}

	@Override
	public void setPlaybackSpeed(float fasterSpeed) {
		System.out.println("Playing playlist: " + playlistName + " with speed: " + fasterSpeed);
	}


	@Override
	public String getName() {
		return playlistName;
	}

	@Override
	public void play() {
		System.out.println("Playing playlist: " + playlistName);
	}

	
}
