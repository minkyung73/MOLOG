package com.movie.MOLOG.domain.movie.dto;

import com.movie.MOLOG.domain.movie.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MovieDTO {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SaveMovieRequestDto {
        // 영화 등록 요청 dto

        private String id;
        private String title;
        private Integer year;
        private String genre;
        private String director;
        private String actors;
        private String posterUrl;

        public Movie toEntity() {
            return Movie.builder()
                    .id(this.getId())
                    .title(this.title)
                    .year(this.year)
                    .genre(this.genre)
                    .director(this.director)
                    .actors(this.actors)
                    .posterUrl(this.posterUrl)
                    .build();
        }
    }
}
