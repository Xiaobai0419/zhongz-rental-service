package com.zhongz.rental.rest;

import com.zhongz.rental.domain.ZhongzComment;
import com.zhongz.rental.result.base.Result;
import com.zhongz.rental.service.IZhongzCommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 管家留言 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-12
 */
@Api(tags = "zhongz-comment")
@Controller
@RequestMapping("/system/zhongzComment")
public class ZhongzCommentController extends BaseController
{
	@Autowired
	private IZhongzCommentService zhongzCommentService;

	/**
	 * 新增保存管家留言
	 */
	@ApiOperation(value="新增保存管家留言")
	@PostMapping("/add")
	@ResponseBody
	public Result addSave(ZhongzComment zhongzComment)
	{		
		return zhongzCommentService.insertZhongzComment(zhongzComment);
	}
}
