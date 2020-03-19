package com.ideashin.one.team.common.constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author: Shin
 * @Date: 16/3/2020 22:02
 * @Blog: ideashin.com
 */
@Getter
@AllArgsConstructor
public enum HttpStatusConstants {
    BAD_GATEWAY(502, "从上游服务器接收到无效的响应");

    private int status;
    private String content;
}
