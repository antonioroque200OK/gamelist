package com.antonioroque.gamelist.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.antonioroque.gamelist.dto.GameListDTO;
import com.antonioroque.gamelist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @GetMapping
  public List<GameListDTO> findAll() {
    return gameListService.findAll();
  }
}
