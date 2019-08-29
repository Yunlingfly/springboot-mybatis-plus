package cn.yunlingfly.springbootmybatisplus.api.controller;

import cn.yunlingfly.springbootmybatisplus.api.dto.Result;
import cn.yunlingfly.springbootmybatisplus.api.dto.TestDTO;
import cn.yunlingfly.springbootmybatisplus.api.service.ITestService;
import cn.yunlingfly.springbootmybatisplus.domain.entity.TestEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
    public Result<TestEntity> getOne(@PathVariable String id) {
        Result<TestEntity> result = new Result<>();
        TestEntity aa = testService.getById(id);
        if (aa == null) {
            result.error500("未找到对应实体");
        } else {
            result.setResult(aa);
            result.setSuccess(true);
        }
        return result;
    }

    @RequestMapping(value = "/list/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public Result<IPage<TestDTO>> queryPageList(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        Result<IPage<TestDTO>> result = new Result<>();
        // IPage的convert()方法做包装
        IPage<TestDTO> pageList = testService.getPageByName(new Page(pageNum, pageSize), "aa");

        result.setSuccess(true);
        result.setResult(pageList);
        return result;
    }
}
