package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzCouponPolicy;
import com.zhongz.rental.service.IZhongzCouponPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 优惠券策略 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-12
 */
@Controller
@RequestMapping("/system/zhongzCouponPolicy")
public class ZhongzCouponPolicyController extends BaseController
{
	@Autowired
	private IZhongzCouponPolicyService zhongzCouponPolicyService;

	/**
	 * 查询优惠券策略列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public List<ZhongzCouponPolicy> list(ZhongzCouponPolicy zhongzCouponPolicy)
	{
		return zhongzCouponPolicyService.selectZhongzCouponPolicyList(zhongzCouponPolicy);
	}
}
