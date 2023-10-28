package com.movie.MOLOG.domain.member.model;


import com.movie.MOLOG.domain.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class MemberBase extends BaseTimeEntity {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String password;

    private String email;

    private String userName;

    @Enumerated(STRING)
    protected MemberLoginType memberLoginType;

}
