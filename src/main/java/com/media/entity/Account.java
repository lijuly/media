package com.media.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 账户基本类
 */
@Setter
@Getter
@ToString
public class Account {

    private Integer id;

    private String email;

    private String password;

    private String petName;
}
