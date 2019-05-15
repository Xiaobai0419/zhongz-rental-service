package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzRentType;
import com.zhongz.rental.service.IZhongzRentTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 租赁时长类别 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-17
 */
@Api(tags = "zhongz-rent-type")
@Controller
@RequestMapping("/system/zhongzRentType")
public class ZhongzRentTypeController extends BaseController
{
	@Autowired
	private IZhongzRentTypeService zhongzRentTypeService;
	
	/**
	 * 查询租赁时长类别列表
	 */
	@ApiOperation(value="查询租赁时长类别列表")
	@PostMapping("/list")
	@ResponseBody
	public List<ZhongzRentType> list(ZhongzRentType zhongzRentType)
	{
		return zhongzRentTypeService.selectZhongzRentTypeList(zhongzRentType);
	}
}
