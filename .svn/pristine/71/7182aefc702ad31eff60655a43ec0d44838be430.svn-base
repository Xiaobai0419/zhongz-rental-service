package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzStructureType;
import com.zhongz.rental.service.IZhongzStructureTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 户型 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
@Api(tags = "zhongz-structure-type")
@Controller
@RequestMapping("/system/zhongzStructureType")
public class ZhongzStructureTypeController extends BaseController
{
	@Autowired
	private IZhongzStructureTypeService zhongzStructureTypeService;
	
	/**
	 * 查询户型列表
	 */
	@ApiOperation(value="查询户型列表")
	@PostMapping("/list")
	@ResponseBody
	public List<ZhongzStructureType> list()
	{
		return zhongzStructureTypeService.selectZhongzStructureTypeList();
	}
}
