package io.choerodon.study.infra.fegin;

import io.choerodon.study.infra.dto.OrganizationDTO;
import io.choerodon.study.infra.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: zhenle.Wang
 * @date: 2019-08-03 09:26
 * @desc:
 */
@FeignClient("iam-service")
public interface OrganizationFeign {
    @GetMapping("v1/organizations/{organization_id}")
    OrganizationDTO QueryByOrganizationID( @PathVariable("organization_id") Long organization_id );

    @GetMapping("v1/organizations/{organization_id}/users/{user_id}")
    UserDTO queryByOrganizationIDandUserID (@PathVariable("organization_id") Long organization_id,@PathVariable("user_id") Long user_id);

}
