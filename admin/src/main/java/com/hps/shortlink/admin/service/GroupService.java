package com.hps.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hps.shortlink.admin.dao.entity.GroupDO;

public interface GroupService extends IService<GroupDO> {

    void SaveGroup(String groupName);
}
