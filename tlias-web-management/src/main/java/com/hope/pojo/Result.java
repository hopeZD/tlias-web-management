package com.hope.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Result {
    private Integer code; //响应码， 1.代表成功 2.代表失败
    private String mag; //响应信息描述字符串
    private Object data; //返回的数据

    
}
