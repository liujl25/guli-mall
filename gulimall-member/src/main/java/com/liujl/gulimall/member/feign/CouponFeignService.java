package com.liujl.gulimall.member.feign;

import com.liujl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *
 * @author liujunlong
 * @date 2022/4/10 16:33
 */
@FeignClient("gulimall-coupon")
@Component
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
