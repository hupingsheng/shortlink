package com.hps.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hps.shortlink.admin.dao.entity.GroupDO;
import com.hps.shortlink.admin.dto.req.ShortLinkGroupDeleteReqDTO;
import com.hps.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.hps.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

public interface GroupService extends IService<GroupDO> {

    void SaveGroup(String groupName);

    List<ShortLinkGroupRespDTO> listGroup();

    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    /**
     * 删除短链接分组
     * @param gid
     */
    void deleteGroup(String gid);
}
