package com.bingbing.paper.Vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SchoolRankVo {

    @ApiModelProperty("院校所在地")
    private String cityName;

    @ApiModelProperty("院校名称")
    private String schoolName;

    @ApiModelProperty("院校排名")
    private Integer schoolRank;

    @ApiModelProperty("院校联系方式")
    private String schoolTel;

    @ApiModelProperty("院校院网")
    private String schoolWebUrl;

    @ApiModelProperty("院校隶属")
    private String affiliation;

    @ApiModelProperty("院校等级")
    private String grade;

    @ApiModelProperty("用户id")
    private String userId;

}
