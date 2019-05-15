package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzRequestServiceType;
import com.zhongz.rental.service.IZhongzRequestServiceTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 请求服务类型 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-07
 */
@Api(tags = "zhongz-request-service-type")
@Controller
@RequestMapping("/system/zhongzRequestServiceType")
public class ZhongzRequestServiceTypeController extends BaseController
{
	@Autowired
	private IZhongzRequestServiceTypeService zhongzRequestServiceTypeService;

	/**
	 * 查询报修类型列表
	 */
	@ApiOperation(value="查询报修类型列表")
	@PostMapping("/listRepairType")
	@ResponseBody
	public List<ZhongzRequestServiceType> listRepairType()
	{
		return zhongzRequestServiceTypeService.selectZhongzRequestServiceRepair();
	}

	/**
	 * 查询保洁类型列表
	 */
	@ApiOperation(value="查询保洁类型列表")
	@PostMapping("/listCleaningType")
	@ResponseBody
	public List<ZhongzRequestServiceType> listCleaningType()
	{
		return zhongzRequestServiceTypeService.selectZhongzRequestServiceCleaning();
	}
}
