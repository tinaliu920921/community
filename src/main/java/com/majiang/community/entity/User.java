package com.majiang.community.entity;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: tina.liu
 * @create: 2019-11-15 08:57
 **/
@Data
public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;



}
