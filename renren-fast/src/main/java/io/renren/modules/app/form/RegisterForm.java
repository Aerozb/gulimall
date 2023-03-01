/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.app.form;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 注册表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@ApiModel(value = "注册表单")
public class RegisterForm {
	@ApiModelProperty(value = "手机号")
	@NotBlank(message = "手机号不能为空")
	private String mobile;

	@ApiModelProperty(value = "密码")
	@NotBlank(message = "密码不能为空")
	private String password;

}