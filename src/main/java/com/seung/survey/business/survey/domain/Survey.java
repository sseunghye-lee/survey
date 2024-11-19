package com.seung.survey.business.survey.domain;

import com.seung.survey.commons.converter.ElementConverter;
import com.seung.survey.commons.converter.StringConverter;
import com.seung.survey.commons.dto.request.survey.SurveyRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint COMMENT '설문지 아이디'")
    private Long surveyId;
    @Column(columnDefinition = "mediumText COMMENT '추가 기본 정보 수집'")
    @Convert(converter = StringConverter.class)
    private List<String> custom;
    @Column(columnDefinition = "mediumText COMMENT '평가 요소'")
    @Convert(converter = ElementConverter.class)
    private List<SurveyRequest> elements;
    @Column(columnDefinition = "LocalDateTime COMMENT '유효기간(만료)'")
    private LocalDateTime endDate;
    @Column(columnDefinition = "varchar(255) COMMENT '설문지 제목'")
    private String title;
    @Column(columnDefinition = "mediumText COMMENT '설문지 설명'")
    private String content;
    @Column(columnDefinition = "bigint COMMENT '서비스 아이디'")
    private Long projectId;
}
