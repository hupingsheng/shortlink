package com.hps.shortlink.admin.controller;

import com.hps.shortlink.admin.common.convention.result.Result;
import com.hps.shortlink.admin.common.convention.result.Results;
import com.hps.shortlink.admin.dto.req.GroupSaveReqDTO;
import com.hps.shortlink.admin.dto.req.ShortLinkGroupDeleteReqDTO;
import com.hps.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.hps.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import com.hps.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody GroupSaveReqDTO requestParam){
        groupService.SaveGroup(requestParam.getName());
        return Results.success();
    }

    @GetMapping("/api/short-link/v1/group")
    public Result<List<ShortLinkGroupRespDTO>> listGroup(){
        return Results.success(groupService.listGroup());
    }

    @PutMapping("/api/short-link/v1/group")
    public Result<Void> updateGroup(@RequestBody ShortLinkGroupUpdateReqDTO requestParam){
        groupService.updateGroup(requestParam);
        return Results.success();
    }

    @DeleteMapping("/api/short-link/v1/group")
    public Result<Void> deleteGroup(@RequestParam  String gid){
        groupService.deleteGroup(gid);
        return Results.success();
    }

}
