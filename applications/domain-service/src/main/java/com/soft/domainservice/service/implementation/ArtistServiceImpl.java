package com.soft.domainservice.service.implementation;

import com.soft.domainservice.entity.Artist;
import com.soft.domainservice.repository.ArtistRepository;
import com.soft.domainservice.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Override
    public Artist findById(String id) {
        return artistRepository.findById(id).orElse(new Artist());
    }
}
