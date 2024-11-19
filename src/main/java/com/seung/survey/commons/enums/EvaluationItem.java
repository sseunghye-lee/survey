package com.seung.survey.commons.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum EvaluationItem implements IdEnum {
    CLEAN("CLEAN", "청결"),
    KIND("KIND", "친절"),
    PRICE("PRICE", "가격"),
    QUALITY("QUALITY", "품질"),
    USABILITY("USABILITY", "사용성");

    private final String id;
    private final String desc;

    @JsonValue
    public String getValue() {
        return this.name();
    }

    @JsonCreator
    public static EvaluationItem of(String name) {
        for (EvaluationItem obj : EvaluationItem.values()) {
            if (obj.name().equalsIgnoreCase(name)) {
                return obj;
            }
        }
        return null;
    }

    public static List<Map<String, String>> codes(){

        List<Map<String, String>> codes = new ArrayList<>();

        for (EvaluationItem obj : EvaluationItem.values()) {
            Map<String, String> map = new HashMap<>();

            map.put("name", obj.name());
            map.put("id", obj.getId());
            map.put("desc", obj.getDesc());

            codes.add(map);
        }

        return codes;
    }
}
