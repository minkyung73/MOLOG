package com.movie.MOLOG.domain.diary.model;

import com.movie.MOLOG.domain.member.model.MemberBase;
import com.movie.MOLOG.domain.model.BaseTimeEntity;
import com.movie.MOLOG.domain.movie.model.Movie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Diary extends BaseTimeEntity {

    @Id
    @Column(name = "diary_id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private MemberBase member;

    @OneToOne(fetch =  LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
