package com.zhongz.rental.rest;

import com.zhongz.rental.domain.ZhongzManager;
import com.zhongz.rental.service.IZhongzManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 管家 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-12
 */
@Api(tags = "zhongz-manager")
@Controller
@RequestMapping("/system/zhongzManager")
public class ZhongzManagerController extends BaseController
{
	@Autowired
	private IZhongzManagerService zhongzManagerService;

	/**
	 * 查询管家信息
	 */
	@ApiOperation(value="查询管家信息")
	@PostMapping("/info")
	@ResponseBody
	public ZhongzManager info()
	{
		return zhongzManagerService.selectZhongzManager();
	}
}
