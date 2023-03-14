package com.soft.domainservice.controller;

import com.soft.domainservice.entity.Artist;
import com.soft.domainservice.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/artist")
@RequiredArgsConstructor
public class ArtistController {
    private final ArtistService artistService;

//    @CrossOrigin(origins = "http://localhost:8089")
    @GetMapping("/{id}")
    public Artist getById(@PathVariable String id, Principal principal) {
        System.out.println(principal.getName());
        return artistService.findById(id);

    }
}
