package com.bingbing.paper.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户登录参数
 */
@Data
public class UserLoginParam {
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
    @ApiModelProperty(value = "验证码", required = true)
    private String code;
    @ApiModelProperty(value = "随机数", required = true)
    private String randomStr;

}
