package com.cheng.weixin.web.mobile.controller;

import com.cheng.weixin.web.mobile.model.Response;
import com.cheng.weixin.web.mobile.result.Promotion.CouponDto;
import com.cheng.weixin.web.mobile.security.IgnoreSecurity;
import com.cheng.weixin.web.mobile.service.SysPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desc:
 * Author: cheng
 * Date: 2016/6/21
 */
@RestController
@RequestMapping("promotion")
public class PromotionController extends BaseController {
    @Autowired
    private SysPromotionService promotionService;

    @IgnoreSecurity
    @RequestMapping(value = "v1/coupons")
    public ResponseEntity<Response> coupons() {
        List<CouponDto> coupons = promotionService.getCouponByUser();
        return success(coupons);
    }

}