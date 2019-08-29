package cn.yunlingfly.springbootmybatisplus.infra.mapper;

import cn.yunlingfly.springbootmybatisplus.api.dto.TestDTO;
import cn.yunlingfly.springbootmybatisplus.domain.entity.TestEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ITestMapper extends BaseMapper<TestEntity> {
    IPage<TestDTO> getPageByName(IPage page, @Param("name") String name);
}
