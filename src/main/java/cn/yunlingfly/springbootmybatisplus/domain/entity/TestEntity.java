package cn.yunlingfly.springbootmybatisplus.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test")
public class TestEntity {
    @TableId
    private String id;
    private String name;
}
