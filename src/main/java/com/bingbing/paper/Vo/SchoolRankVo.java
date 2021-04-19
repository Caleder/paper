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

}
