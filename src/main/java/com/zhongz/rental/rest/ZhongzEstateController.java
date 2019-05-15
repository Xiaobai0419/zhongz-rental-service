package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzEstate;
import com.zhongz.rental.service.IZhongzEstateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 小区 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
@Api(tags = "zhongz-estate")
@Controller
@RequestMapping("/system/zhongzEstate")
public class ZhongzEstateController extends BaseController
{
	@Autowired
	private IZhongzEstateService zhongzEstateService;

	/**
	 * 查询小区列表
	 */
	@ApiOperation(value="查询小区列表")
	@PostMapping("/list")
	@ResponseBody
	public List<ZhongzEstate> list()
	{
		return zhongzEstateService.selectZhongzEstateList();
	}

	/**
	 * 查询小区详情
	 */
	@ApiOperation(value="查询小区详情")
	@ApiImplicitParam(name = "id", value = "", required = true, dataType = "String")
	@PostMapping("/single")
	@ResponseBody
	public ZhongzEstate single(String id)
	{
		return zhongzEstateService.selectZhongzEstateById(id);
	}
}
