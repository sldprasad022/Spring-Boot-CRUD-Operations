package com.girus.musicapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.girus.musicapi.entity.Music;
import com.girus.musicapi.repository.MusicRepository;

@Service
public class MusicServiceImpl implements MusicService
{
	@Autowired
	private MusicRepository musicRepository;

	@Override
	public ResponseEntity<Music> saveSong(Music music)
	{
		Music savedSong = musicRepository.save(music);
		return new ResponseEntity<Music> ;
	}

	@Override
	public Music getSongById(Long id) 
	{
		Music retrivedSong= musicRepository.findById(id).get();
		return retrivedSong;
	}

	@Override
	public List<Music> allSongs()
	{
		List<Music> all = musicRepository.findAll();
		return all;
	}

	@Override
	public String deleteById(Long id) 
	{
		musicRepository.deleteById(id);
		return null;
	}

}
