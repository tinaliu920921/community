package com.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: tina.liu
 * @create: 2019-11-14 14:17
 **/
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
