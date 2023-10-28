package com.movie.MOLOG.domain.movie.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movie_name;

    private String director;

    private String stars;   // List<String> 가능한지

    private String movieImgUrl;

}
