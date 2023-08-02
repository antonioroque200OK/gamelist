package com.antonioroque.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.antonioroque.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
