package com.movie.MOLOG.domain.movie.dao;

import com.movie.MOLOG.domain.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

}
