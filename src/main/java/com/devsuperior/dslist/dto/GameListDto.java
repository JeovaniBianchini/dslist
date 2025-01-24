package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

import java.util.Objects;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(){
    }

    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameListDto that = (GameListDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
