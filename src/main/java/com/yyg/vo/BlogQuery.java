package com.yyg.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：BlogQuery
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/28 14:08
 */
@Data
@NoArgsConstructor
public class BlogQuery {
    private String title;
    private Long typeId;
    private boolean recommend;
}
