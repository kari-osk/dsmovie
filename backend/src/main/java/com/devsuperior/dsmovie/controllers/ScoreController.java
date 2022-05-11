package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.DTO.MovieDTO;
import com.devsuperior.dsmovie.DTO.ScoreDTO;
import com.devsuperior.dsmovie.services.MovieService;
import com.devsuperior.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping(value="/{id}")
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

    //@GetMapping
    //public Page<MovieDTO> findAll(Pageable pageable) {
      //  return service.findAll(pageable);
    //}
}
