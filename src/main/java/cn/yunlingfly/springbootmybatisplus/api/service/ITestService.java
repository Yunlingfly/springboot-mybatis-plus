package cn.yunlingfly.springbootmybatisplus.api.service;

import cn.yunlingfly.springbootmybatisplus.api.dto.TestDTO;
import cn.yunlingfly.springbootmybatisplus.domain.entity.TestEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ITestService extends IService<TestEntity> {
    IPage<TestDTO> getPageByName(Page page, String name);
}
