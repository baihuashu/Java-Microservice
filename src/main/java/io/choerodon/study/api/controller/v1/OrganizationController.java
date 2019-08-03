package io.choerodon.study.api.controller.v1;

import io.choerodon.base.enums.ResourceType;
import io.choerodon.study.app.service.OrganizationService;
import io.choerodon.study.app.service.UserService;
import io.choerodon.study.infra.dto.OrganizationDTO;
import io.choerodon.study.infra.dto.ProjectDTO;
import io.choerodon.study.infra.dto.UserDTO;
import io.choerodon.base.annotation.Permission;
import io.choerodon.study.infra.mapper.ProjectMapper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:09
 * @desc:
 */
@RestController
@RequestMapping("/v1/organization")
public class OrganizationController {
    private Logger logger = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private UserService userService;
    //因为逻辑简单，这里直接调用mapper。
    @Autowired
    private ProjectMapper projectMapper;


    @Permission(permissionPublic = true)
    @GetMapping ("/{organization_id}")
    @ApiOperation("根据organization_id查询组织机构，并插入到本地数据库")
    public OrganizationDTO queryByOrganizationID( @PathVariable Long organization_id){
        OrganizationDTO organizationDTO = organizationService.queryByID(organization_id);
        logger.debug("查询到组织机构: "+organizationDTO);
        //插入数据组织机构信息
        organizationService.createOne(organizationDTO);
        //插入项目信息
        List<ProjectDTO> projects = organizationDTO.getProjects();
        for(ProjectDTO p:projects){
            projectMapper.insert(p);
        }
        return organizationDTO;
    }


    @ApiOperation("根据organization_id和user_id查询用户，并插入到本地数据库")
    @Permission(permissionPublic = true)
//    @Permission(type = ResourceType.SITE)
    @GetMapping("/{organization_id}/users/{user_id}")
    public UserDTO queryByOrganizationIDandUserID( @PathVariable Long organization_id, @PathVariable Long user_id ){
        UserDTO userDTO = userService.queryByOrganizationIDandUserID(organization_id, user_id);
        logger.debug("查询到用户为: "+userDTO);
        //插入数据
        userService.createOne(userDTO);
        return userDTO;
    }

    @Permission(permissionPublic = true)
//    @Permission(type = ResourceType.SITE)
    @ApiOperation("根据id查local组织")
    @GetMapping("/local/{id}")
    public OrganizationDTO queryByOrganizationId(@PathVariable Long id){
        OrganizationDTO organization = organizationService.query(id);
        if(organization!=null){
            logger.debug("查询到的组织为: "+organization);
        }
        return organization;
    }
    @Permission(permissionPublic = true)
//    @Permission(type = ResourceType.SITE)
    @ApiOperation("根据id查本机用户")
    @GetMapping("/local/users/{id}")
    public UserDTO queryByUserId(@PathVariable Long id){
        UserDTO user = userService.query(id);
        if(user!=null){
            logger.debug("查询到的用户为: "+user);
        }
        return user;
    }






}
