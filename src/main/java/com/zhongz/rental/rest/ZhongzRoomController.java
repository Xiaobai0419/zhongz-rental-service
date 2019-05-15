package com.zhongz.rental.rest;

import java.util.List;

import com.zhongz.rental.domain.ZhongzRoom;
import com.zhongz.rental.service.IZhongzRoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 房间 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-04-12
 */
@Api(tags = "zhongz-room")
@Controller
@RequestMapping("/system/zhongzRoom")
public class ZhongzRoomController extends BaseController
{
	@Autowired
	private IZhongzRoomService zhongzRoomService;

	/**
	 * 查询指定房屋所有房间集合
	 */
	@ApiOperation(value="查询指定房屋所有房间集合")
	@ApiImplicitParam(name = "houseId", value = "", required = true, dataType = "String")
	@PostMapping("/listByHouseId")
	@ResponseBody
	public List<ZhongzRoom> listZhongzRoomByHouseId(String houseId)
	{
		return zhongzRoomService.selectZhongzRoomByHouseId(houseId);
	}

	/**
	 * 查询房间信息
	 */
	@ApiOperation(value="查询房间信息")
	@ApiImplicitParam(name = "id", value = "", required = true, dataType = "String")
	@PostMapping("/single")
	@ResponseBody
	public ZhongzRoom selectZhongzRoomById(String id)
	{
		return zhongzRoomService.selectZhongzRoomById(id);
	}
}
