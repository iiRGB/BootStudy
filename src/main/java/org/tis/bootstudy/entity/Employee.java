package org.tis.bootstudy.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * description:
 *
 * @author zhaoch
 * @date 2018/4/19
 **/
@Data
public class Employee {

    @TableId
    private String id;

    private String name;

}
