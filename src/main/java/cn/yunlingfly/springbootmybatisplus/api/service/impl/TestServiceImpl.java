package cn.yunlingfly.springbootmybatisplus.api.service.impl;

import cn.yunlingfly.springbootmybatisplus.api.dto.TestDTO;
import cn.yunlingfly.springbootmybatisplus.api.service.ITestService;
import cn.yunlingfly.springbootmybatisplus.domain.entity.TestEntity;
import cn.yunlingfly.springbootmybatisplus.infra.mapper.ITestMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<ITestMapper, TestEntity> implements ITestService {
    @Autowired
    private ITestMapper testMapper;

    public IPage<TestDTO> getPageByName(Page page, String name) {
        return testMapper.getPageByName(page, name);
    }
}
