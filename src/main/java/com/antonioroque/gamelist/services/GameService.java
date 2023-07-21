package com.antonioroque.gamelist.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.antonioroque.gamelist.dto.GameMinDTO;
import com.antonioroque.gamelist.entities.Game;
import com.antonioroque.gamelist.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> list = gameRepository.findAll();
    return list.stream().map(GameMinDTO::new).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public GameMinDTO findById(Long id) {
    Game entity = gameRepository.findById(id).orElseThrow();
    return new GameMinDTO(entity);
  }
}
