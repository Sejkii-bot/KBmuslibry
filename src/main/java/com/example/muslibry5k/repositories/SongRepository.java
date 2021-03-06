package com.example.muslibry5k.repositories;

import com.example.muslibry5k.model.Artist;
import com.example.muslibry5k.model.Song;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> getAllByArtistsIsContaining(Artist artist);

    Optional<Song> getFirstByIsmn(String ismn);

}