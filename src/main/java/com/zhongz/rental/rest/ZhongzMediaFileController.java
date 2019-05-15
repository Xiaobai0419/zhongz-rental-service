package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzMediaFile;
import com.zhongz.rental.service.IZhongzMediaFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 媒体文件 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-16
 */
@Api(tags = "zhongz-media-file")
@Controller
@RequestMapping("/system/zhongzMediaFile")
public class ZhongzMediaFileController extends BaseController
{
	@Autowired
	private IZhongzMediaFileService zhongzMediaFileService;
	
	/**
	 * 查询房源展示媒体文件列表
	 */
	@ApiOperation(value="查询房源展示媒体文件列表")
	@PostMapping("/listHouseFiles")
	@ResponseBody
	public List<ZhongzMediaFile> listHouseFiles(ZhongzMediaFile zhongzMediaFile)
	{
		return zhongzMediaFileService.selectZhongzMediaFileByHouseEntity(zhongzMediaFile);
	}
}
