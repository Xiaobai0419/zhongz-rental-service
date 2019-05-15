package com.zhongz.rental.rest;

import com.ruoyi.common.core.controller.BaseController;
import com.zhongz.rental.domain.ZhongzComment;
import com.zhongz.rental.param.ZhongzPictureParam;
import com.zhongz.rental.result.PictureResult;
import com.zhongz.rental.result.base.Result;
import com.zhongz.rental.service.IZhongzCommentService;
import com.zhongz.rental.service.IZhongzPictureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 业务图片上传 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-12
 */
@Api(tags = "zhongz-picture")
@Controller
@RequestMapping("/system/zhongzPicture")
public class ZhongzPictureController extends BaseController
{
	@Autowired
	private IZhongzPictureService zhongzPictureService;

	/**
	 * 业务图片上传
	 */
	@ApiOperation(value="业务图片上传 1 报修图片 2 保洁图片")
	@PostMapping("/add")
	@ResponseBody
	public PictureResult addSave(MultipartFile file, ZhongzPictureParam zhongzPictureParam, HttpServletRequest request)
	{		
		return zhongzPictureService.uploadFile(file,zhongzPictureParam,request);
	}
}
