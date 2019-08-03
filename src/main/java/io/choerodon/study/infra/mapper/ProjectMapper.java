package io.choerodon.study.infra.mapper;

import io.choerodon.mybatis.common.Mapper;
import io.choerodon.study.infra.dto.ProjectDTO;
import io.choerodon.study.infra.dto.UserDTO;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:17
 * @desc:
 */
@org.apache.ibatis.annotations.Mapper
public interface ProjectMapper extends Mapper<ProjectDTO> {
}
