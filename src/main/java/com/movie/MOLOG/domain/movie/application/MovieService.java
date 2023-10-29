package com.movie.MOLOG.domain.movie.application;

import com.movie.MOLOG.domain.movie.dao.MovieRepository;
import com.movie.MOLOG.domain.movie.dto.MovieDTO.*;
import com.movie.MOLOG.domain.movie.model.Movie;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MovieService {

    private final MovieRepository movieRepository;

    @Transactional
    public String saveMovie(SaveMovieRequestDto saveMovieRequestDto) {

        // 이미 저장되어 있는 영화인 경우 return
        // TODO: 이럴 경우 아래와 같이 처리하는 게 맞는지 확인 필요
        String id = saveMovieRequestDto.getId();
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if(movieOptional.isPresent()
                && movieRepository.existsById(movieOptional.get().getId()))
            return "already exist movie";

        // DB에 해당 영화가 없을 경우 저장
        Movie movie = saveMovieRequestDto.toEntity();
        Movie saveMovie = movieRepository.save(movie);

        return saveMovie.getId();
    }

}
