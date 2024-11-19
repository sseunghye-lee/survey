package com.seung.survey.commons.dto.request.survey;

import com.seung.survey.commons.enums.EvaluationItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SurveyRequest {
    private EvaluationItem evaluationItem;
    private String title;
}
