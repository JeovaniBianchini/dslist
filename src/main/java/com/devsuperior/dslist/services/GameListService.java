package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRespository gameListRespository;

    @Transactional
    public List<GameListDto> findAll(){
        List<GameList> list = gameListRespository.findAll();
        return list.stream().map(x -> new GameListDto(x)).toList();
    }
}
