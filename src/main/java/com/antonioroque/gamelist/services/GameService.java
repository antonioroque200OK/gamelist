package com.antonioroque.gamelist.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.antonioroque.gamelist.dto.GameDTO;
import com.antonioroque.gamelist.dto.GameMinDTO;
import com.antonioroque.gamelist.entities.Game;
import com.antonioroque.gamelist.projections.GameMinProjection;
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
  public GameDTO findById(Long id) {
    Game entity = gameRepository.findById(id).get();
    // TODO implement optional and exception handling
    return new GameDTO(entity);
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
  }
}
