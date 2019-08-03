package io.choerodon.study.app.service.impl;

import io.choerodon.study.infra.fegin.OrganizationFeign;
import io.choerodon.study.app.service.OrganizationService;
import io.choerodon.study.infra.dto.OrganizationDTO;
import io.choerodon.study.infra.mapper.OrganizationMapper;
import io.choerodon.core.exception.CommonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 10:26
 * @desc:
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private OrganizationFeign organizationFeign;

//    public OrganizationServiceImpl( OrganizationMapper organizationMapper) {
//        this.organizationMapper = organizationMapper;
//    }

    @Override
    public OrganizationDTO createOne( OrganizationDTO organizationDTO) {
        if (organizationMapper.insert(organizationDTO) != 1) {
            throw new CommonException("error.organization.insert");
        }
        return organizationDTO;
    }

    @Override
    public OrganizationDTO query( Long id ) {
        return organizationMapper.selectByPrimaryKey(id);
    }

    @Override
    public OrganizationDTO queryByID( Long id ) {
        OrganizationDTO organizationDTO = organizationFeign.QueryByOrganizationID(id);
        return organizationDTO;
    }


}

