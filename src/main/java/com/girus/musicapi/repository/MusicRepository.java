package com.girus.musicapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girus.musicapi.entity.Music;
@Repository
public interface MusicRepository extends JpaRepository<Music, Long>
{

}
