package com.devsuperior.dslist.repository;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRespository extends JpaRepository<GameList, Long> {
}
