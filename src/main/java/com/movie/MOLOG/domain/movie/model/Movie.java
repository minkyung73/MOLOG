package com.movie.MOLOG.domain.movie.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @Column(name = "movie_id")
    private String id;

    private String title;
    private Integer year;

    private String genre;
    private String director;

    private String actors;

    private String posterUrl;

}
