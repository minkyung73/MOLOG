package com.movie.MOLOG.domain.detail.model;

import com.movie.MOLOG.domain.diary.model.Diary;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Detail {
    @Id
    @Column(name = "detail_id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "diary_id")
    private Diary diary;

    @Enumerated(value = STRING)
    private DetailType detailType;

    private String text;

    private int x;
    private int y;
}
