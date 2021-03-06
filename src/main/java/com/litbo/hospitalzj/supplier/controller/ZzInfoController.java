package com.litbo.hospitalzj.supplier.controller;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.ZzInfo;
import com.litbo.hospitalzj.supplier.service.SuInfoService;
import com.litbo.hospitalzj.supplier.service.ZzInfoService;
import com.litbo.hospitalzj.util.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zzinfo")
@Slf4j
public class ZzInfoController extends BaseController {
    @Autowired
    private ZzInfoService zzInfoService;
    @Autowired
    private SuInfoService suInfoService;

    @RequestMapping("/{suId}")
    public ResponseResult<ZzInfo> getByCode(@PathVariable("suId") Integer suId) {
        ZzInfo data=zzInfoService.findZzById(suId);
        return new ResponseResult<ZzInfo>(SUCCESS,data);
    }
    @RequestMapping("/update")
    public ResponseResult<Void> update(ZzInfo zzInfo) {
        zzInfoService.update(zzInfo);
        return new ResponseResult<Void>(SUCCESS);
    }
    @RequestMapping("/insert")
    @Transactional
    public ResponseResult<Void> insert(@RequestParam("suId")String suId,  ZzInfo zzInfo) {
        try{
            System.out.println(zzInfo);
            zzInfoService.insert(zzInfo);
            suInfoService.insertNowTime(suId);
            suInfoService.updateState(Integer.parseInt(suId), 0);
            return new ResponseResult<Void>(SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            log.error(zzInfo.toString());
            log.error(e.getMessage());
            return new ResponseResult<>(ERROR);
        }


    }
}
