package com.yyg.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：Type
 *
 * @author 杨雨光
 * @version 1.0
 * @date 2019/9/25 18:51
 */
@Entity
@Table(name = "t_type")
@Data
@NoArgsConstructor
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message = "分类名称不能为空")
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
