package io.choerodon.study.app.service.impl;

import io.choerodon.study.infra.fegin.OrganizationFeign;
import io.choerodon.study.app.service.UserService;
import io.choerodon.study.infra.dto.UserDTO;
import io.choerodon.study.infra.mapper.UserMapper;
import io.choerodon.core.exception.CommonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:22
 * @desc:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrganizationFeign organizationFeign;


    @Override
    public UserDTO queryByOrganizationIDandUserID( Long organization_id, Long user_id ) {
        UserDTO userDTO = organizationFeign.queryByOrganizationIDandUserID(organization_id, user_id);
        return userDTO;
    }


    @Override
    public UserDTO createOne( UserDTO userDTO) {
        if (userMapper.insert(userDTO) != 1) {
            throw new CommonException("error.user.insert");
        }
        return userDTO;
    }

    @Override
    public UserDTO query( Long id ) {
        return userMapper.selectByPrimaryKey(id);
    }


}
