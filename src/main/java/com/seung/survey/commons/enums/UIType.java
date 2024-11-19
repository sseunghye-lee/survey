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
public enum UIType implements IdEnum {

    RADIO("RADIO", "라디오버튼"),
    TEXT("TEXT", "직접 입력");

    private final String id;
    private final String desc;

    @JsonValue
    public String getValue() {
        return this.name();
    }

    @JsonCreator
    public static UIType of(String name) {
        for (UIType obj : UIType.values()) {
            if (obj.name().equalsIgnoreCase(name)) {
                return obj;
            }
        }
        return null;
    }

    public static List<Map<String, String>> codes(){

        List<Map<String, String>> codes = new ArrayList<>();

        for (UIType obj : UIType.values()) {
            Map<String, String> map = new HashMap<>();

            map.put("name", obj.name());
            map.put("id", obj.getId());
            map.put("desc", obj.getDesc());

            codes.add(map);
        }

        return codes;
    }
}
