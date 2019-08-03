package io.choerodon.study.app.service;

import io.choerodon.study.infra.dto.OrganizationDTO;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:20
 * @desc:
 */
public interface OrganizationService {
    OrganizationDTO createOne( OrganizationDTO organizationDTO);

    OrganizationDTO query(Long id);

    OrganizationDTO queryByID(Long id);


}
