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
    private Long surveyId;
    @Column
    @Convert(converter = StringConverter.class)
    private List<String> custom;
    @Column
    @Convert(converter = ElementConverter.class)
    private List<SurveyRequest> elements;
    @Column
    private LocalDateTime endDate;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Long projectId;
}
