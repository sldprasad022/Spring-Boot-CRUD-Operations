package com.girus.musicapi.service;

import java.util.List;

import com.girus.musicapi.entity.Music;

public interface MusicService 
{
	public Music saveSong(Music music);
	
	public Music getSongById(Long id);
	
	public List<Music> allSongs();
	
	public String deleteById(Long id);
}
