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
@Data
@NoArgsConstructor
@Table(name = "t_tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();
}
