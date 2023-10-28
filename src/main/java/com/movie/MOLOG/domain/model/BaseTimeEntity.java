package com.movie.MOLOG.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)  // BaseTimeEntiy 클래스에 Auditing 기능을 포함
@Getter
@MappedSuperclass   // BaseTimeEntity를 상속할 경우 필드들(createdDate, modifiedDate)도 칼럼으로 인식하도록
public class BaseTimeEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
