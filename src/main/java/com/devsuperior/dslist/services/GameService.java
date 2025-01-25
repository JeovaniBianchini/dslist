package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDto(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Game> newList = gameRepository.findAll();
        List<GameMinDto> dto = newList.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        List<GameMinProjection> newList = gameRepository.searchByList(listId);
        return newList.stream().map(x -> new GameMinDto(x)).toList();
    }
}
