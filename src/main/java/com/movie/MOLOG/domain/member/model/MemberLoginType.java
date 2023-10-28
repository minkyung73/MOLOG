package com.movie.MOLOG.domain.member.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberLoginType {
    BASIC_LOGIN(1, "LOCAL"),
    GOOGLE_LOGIN(2, "GOOGLE");

    private long id;
    private String type;

}
