package com.zhongz.rental.rest;

import com.zhongz.rental.domain.ZhongzUser;
import com.zhongz.rental.param.ZhongzUserOrderParam;
import com.zhongz.rental.param.ZhongzUserParam;
import com.zhongz.rental.result.LoginResult;
import com.zhongz.rental.result.base.Result;
import com.zhongz.rental.service.IZhongzUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-15
 */
@Api(tags = "zhongz-user")
@Controller
@RequestMapping("/system/zhongzUser")
public class ZhongzUserController extends BaseController
{

	@Autowired
	private IZhongzUserService zhongzUserService;

	/**
	 * 用户登录
	 */
	@ApiOperation(value="用户登录")
	@PostMapping("/login")
	@ResponseBody
	public LoginResult zhongzUserLogin(ZhongzUserParam zhongzUserParam)
	{
		return zhongzUserService.zhongzUserLogin(zhongzUserParam);
	}

	/**
	 * 用户登出
	 */
	@ApiOperation(value="用户登出")
	@PostMapping("/logout")
	@ResponseBody
	public LoginResult zhongzUserLogout(ZhongzUserOrderParam zhongzUserOrderParam)
	{
		return zhongzUserService.zhongzUserLogout(zhongzUserOrderParam);
	}

	/**
	 * 修改用户昵称
	 */
	@ApiOperation(value="修改用户昵称")
	@PostMapping("/nickNameUpd")
	@ResponseBody
	public LoginResult zhongzUserNickNameUpd(ZhongzUserOrderParam zhongzUserOrderParam)
	{
		return zhongzUserService.updateZhongzUserNickName(zhongzUserOrderParam);
	}

	/**
	 * 修改用户头像
	 */
	@ApiOperation(value="修改用户头像")
	@PostMapping("/headPortraitUpd")
	@ResponseBody
	public LoginResult zhongzUserHeadPortraitUpd(@RequestParam("file") MultipartFile file, ZhongzUserOrderParam zhongzUserOrderParam, HttpServletRequest request)
	{
		return zhongzUserService.updateZhongzUserHeadPortrait(file,zhongzUserOrderParam,request);
	}

	/**
	 * 查询老带新已邀请用户列表
	 *
	 * @param zhongzUserOrderParam 用户信息
	 * @return 用户集合
	 */
	@ApiOperation(value="查询老带新已邀请用户列表")
	@PostMapping("/listInvited")
	@ResponseBody
	public Result<ZhongzUser> selectZhongzUserInvitedList(ZhongzUserOrderParam zhongzUserOrderParam)
	{
		return zhongzUserService.selectZhongzUserInvitedList(zhongzUserOrderParam);
	}
}
