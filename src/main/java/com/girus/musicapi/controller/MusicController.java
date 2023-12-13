package com.girus.musicapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.girus.musicapi.entity.Music;
import com.girus.musicapi.service.MusicServiceImpl;

@RestController
public class MusicController 
{
	@Autowired
	private MusicServiceImpl musicServiceImpl;
	
	
	@PostMapping("/save")
	public ResponseEntity<Music> saveSong(@RequestBody Music music)
	{
		Music savedSong = musicServiceImpl.saveSong(music);
		return new ResponseEntity<Music>(savedSong
	}
}
