package com.imooc.bilibili.domain;

import lombok.Data;

import java.util.Date;

@Data
public class RefreshTokenDetail {

    private Long id;

    private String refreshToken;

    private Long userId;

    private Date createTime;

}
