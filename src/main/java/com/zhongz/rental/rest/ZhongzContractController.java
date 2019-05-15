package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzContract;
import com.zhongz.rental.param.ZhongzUserOrderParam;
import com.zhongz.rental.result.base.Result;
import com.zhongz.rental.service.IZhongzContractService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 合同 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-17
 */
@Api(tags = "zhongz-contract")
@Controller
@RequestMapping("/system/zhongzContract")
public class ZhongzContractController extends BaseController
{
	@Autowired
	private IZhongzContractService zhongzContractService;
	
	/**
	 * 查询用户合同期内所有生效合同列表
	 *
	 * @param zhongzUserOrderParam 用户信息
	 * @return 订单集合
	 */
	@ApiOperation(value="查询用户合同期内所有生效合同列表")
	@PostMapping("/listUserRenew")
	@ResponseBody
	public Result<ZhongzContract> selectZhongzUserContractList(ZhongzUserOrderParam zhongzUserOrderParam)
	{
		return zhongzContractService.selectZhongzUserContractList(zhongzUserOrderParam);
	}

	/**
	 * 查询用户所有签约合同列表（包括已失效历史合同）
	 *
	 * @param zhongzUserOrderParam 用户信息
	 * @return 订单集合
	 */
	@ApiOperation(value="查询用户所有签约合同列表（包括已失效历史合同）")
	@PostMapping("/listUserAll")
	@ResponseBody
	public Result<ZhongzContract> selectZhongzUserContractAllList(ZhongzUserOrderParam zhongzUserOrderParam)
	{
		return zhongzContractService.selectZhongzUserContractAllList(zhongzUserOrderParam);
	}
}
