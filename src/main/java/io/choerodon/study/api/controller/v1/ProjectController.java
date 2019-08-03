package io.choerodon.study.api.controller.v1;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.choerodon.base.annotation.Permission;
import io.choerodon.study.infra.dto.ProjectDTO;
import io.choerodon.study.infra.mapper.ProjectMapper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 15:00
 * @desc:
 */
@RestController
@RequestMapping("/v1/project")
public class ProjectController {
    private Logger logger = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private ProjectMapper projectMapper;

    @ApiOperation("分页查询项目")
    @GetMapping("/")
    @Permission(permissionPublic = true)
//    @Permission(type = ResourceType.SITE)
    public PageInfo list( Integer page ,Integer pageSize){
        PageHelper.startPage(page,pageSize);
        List<ProjectDTO> list = projectMapper.selectAll();
        PageInfo<ProjectDTO> pageInfo = new PageInfo<>(list);
        logger.debug("分页查询成功，当前页: "+page+"当前页大小： "+pageSize);
        return pageInfo;
    }
}
