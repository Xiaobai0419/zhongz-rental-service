package com.zhongz.rental.rest;

import com.zhongz.rental.domain.ZhongzValidateCode;
import com.zhongz.rental.result.base.Result;
import com.zhongz.rental.service.IZhongzValidateCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 验证码 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-12
 */
@Api(tags = "zhongz-validate-code")
@Controller
@RequestMapping("/system/zhongzValidateCode")
public class ZhongzValidateCodeController extends BaseController
{
	@Autowired
	private IZhongzValidateCodeService zhongzValidateCodeService;
	
	/**
	 * 获取验证码
	 */
	@ApiOperation(value="获取验证码")
	@PostMapping("/get")
	@ResponseBody
	public Result get(ZhongzValidateCode zhongzValidateCode)
	{		
		return zhongzValidateCodeService.get(zhongzValidateCode);
	}
}
