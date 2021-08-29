package com.media;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class UserDto {

    private String userName;

    private Integer age;

    private Date birthday;
}
