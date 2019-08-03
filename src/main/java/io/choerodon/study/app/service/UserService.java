package io.choerodon.study.app.service;

import io.choerodon.study.infra.dto.UserDTO;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:19
 * @desc:
 */
public interface UserService {
    UserDTO createOne ( UserDTO userDTO);
    UserDTO query(Long id);

    UserDTO queryByOrganizationIDandUserID( Long organization_id, Long user_id );
}
