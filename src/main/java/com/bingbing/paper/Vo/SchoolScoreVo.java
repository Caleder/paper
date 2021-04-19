package com.bingbing.paper.Vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SchoolScoreVo {

    @ApiModelProperty("院校名称")
    private String schoolName;

    @ApiModelProperty("院校报录比")
    private String schoolApplyAdmit;

    @ApiModelProperty("院校复试线")
    private String schoolScore;

    @ApiModelProperty("院校初复试")
    private Boolean beginRepeat;

    @ApiModelProperty("院校资料")
    private String schoolFile;

    @ApiModelProperty("院校学年")
    private String schoolYear;

}
