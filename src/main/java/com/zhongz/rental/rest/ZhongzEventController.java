package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzEvent;
import com.zhongz.rental.service.IZhongzEventService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 活动 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-16
 */
@Api(tags = "zhongz-event")
@Controller
@RequestMapping("/system/zhongzEvent")
public class ZhongzEventController extends BaseController
{
	@Autowired
	private IZhongzEventService zhongzEventService;
	
	/**
	 * 查询前端显示活动列表
	 */
	@ApiOperation(value="查询前端显示活动列表")
	@PostMapping("/list")
	@ResponseBody
	public List<ZhongzEvent> list()
	{
		return zhongzEventService.selectZhongzEventsFrontEnd();
	}

	/**
	 * 查询前端显示活动详情
	 */
	@ApiOperation(value="查询前端显示活动详情")
	@ApiImplicitParams({@ApiImplicitParam(name = "id", value = "", required = true, dataType = "String"),
			@ApiImplicitParam(name = "eventHousePageUrl", value = "", required = true, dataType = "String"),
			@ApiImplicitParam(name = "mmap", value = "", required = false, dataType = "ModelMap")})
	@GetMapping("/single")
	public String single(String id,String eventHousePageUrl, ModelMap mmap)
	{
		return zhongzEventService.selectZhongzEvent(id,eventHousePageUrl,mmap);
	}
}
