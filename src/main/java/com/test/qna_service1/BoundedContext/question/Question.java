package com.test.qna_service1.BoundedContext.question;

import com.test.qna_service1.BoundedContext.answer.Answer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Question {

    @Id // pk키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 키값 자동증가
    private Long id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
