package com.soft.domainservice.controller;

import com.soft.domainservice.entity.Artist;
import com.soft.domainservice.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/artist")
@RequiredArgsConstructor
public class ArtistController {
    private final ArtistService artistService;

    @GetMapping("/{id}")
    public Artist getById(@PathVariable String id, Principal principal) {
        System.out.println(principal.getName());

        return artistService.findById(id);
    }
}
