package cn.yunlingfly.springbootmybatisplus.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Id;

@Data
@TableName("test")
public class TestEntity {
    @Id
    private String id;
    private String name;
}
