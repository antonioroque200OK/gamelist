package com.antonioroque.gamelist.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.antonioroque.gamelist.dto.GameListDTO;
import com.antonioroque.gamelist.entities.GameList;
import com.antonioroque.gamelist.repositories.GameListRepository;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> list = gameListRepository.findAll();
    return list.stream().map(GameListDTO::new).collect(Collectors.toList());
  }
}
