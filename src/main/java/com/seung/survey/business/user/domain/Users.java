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
    private Long userId;
    @Column
    private String phoneNum;
    @Column
    private String address;
    @Column
    private String addressDetails;
    @Column
    private String storeName;
    @Column
    private String accountId;
    @Column
    private String password;

}
