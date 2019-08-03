package io.choerodon.study.infra.mapper;

import io.choerodon.study.infra.dto.UserDTO;
import io.choerodon.mybatis.common.Mapper;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:17
 * @desc:
 */
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserDTO> {
}
