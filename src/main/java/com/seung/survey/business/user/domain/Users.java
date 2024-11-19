package com.seung.survey.business.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint COMMENT '사용자 아이디'")
    private Long userId;
    @Column(columnDefinition = "varchar(50) COMMENT '휴대폰 번호'")
    private String phoneNum;
    @Column(columnDefinition = "varchar(255) COMMENT '주소'")
    private String address;
    @Column(columnDefinition = "varchar(255) COMMENT '상세주소'")
    private String addressDetails;
    @Column(columnDefinition = "varchar(100) COMMENT '매장명'")
    private String storeName;
    @Column(columnDefinition = "varchar(255) COMMENT '계정 아이디'")
    private String accountId;
    @Column(columnDefinition = "varchar(255) COMMENT '비밀번호'")
    private String password;

}
