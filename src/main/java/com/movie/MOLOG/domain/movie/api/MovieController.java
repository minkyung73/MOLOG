package com.movie.MOLOG.domain.movie.api;

import com.movie.MOLOG.domain.movie.application.MovieService;
import com.movie.MOLOG.domain.movie.dto.MovieDTO.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    /**
     * 영화 등록 API
     * 사용자가 다이어리 작성하겠다고 클릭한 영화를 저장
     * 이미 DB에 있는 영화일 경우 저장 X
     * */
    @PostMapping(value = "/api/saveMovie")
    public ResponseEntity<String> saveMovie(
            @RequestBody SaveMovieRequestDto saveMovieRequestDto)
    {
        String movie = movieService.saveMovie(saveMovieRequestDto);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

}
