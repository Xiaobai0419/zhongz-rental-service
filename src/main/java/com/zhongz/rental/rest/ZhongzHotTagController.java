package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzHotTag;
import com.zhongz.rental.service.IZhongzHotTagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 热度标签类别 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-04
 */
@Api(tags = "zhongz-hot-tag")
@Controller
@RequestMapping("/system/zhongzHotTag")
public class ZhongzHotTagController extends BaseController
{
	@Autowired
	private IZhongzHotTagService zhongzHotTagService;

	/**
	 * 查询热度标签类别列表
	 */
	@ApiOperation(value="查询热度标签列表")
	@PostMapping("/list")
	@ResponseBody
	public List<ZhongzHotTag> list()
	{
		return zhongzHotTagService.selectZhongzHotTagList();
	}
}
