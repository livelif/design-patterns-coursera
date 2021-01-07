package com.paulo.composite;

public class Song implements IComponent {

	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	@Override
	public void setPlaybackSpeed(float fasterSpeed) {
		System.out.println("Playing song: " + songName + " with speed: " + fasterSpeed);
	}


	@Override
	public String getName() {
		return songName;
	}

	@Override
	public void play() {
		System.out.println("Playing song: " + songName);
	}

	public String getArtist() {
		return artist;
	}
	
}
