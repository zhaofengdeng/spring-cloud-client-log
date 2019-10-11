package com.project.controller;

import java.util.Date;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.framework.util.RequestUtil;
import com.project.model.LogOperation;
import com.util.base.ModelUtil;
import com.util.form.AjaxForm;


@RestController
@RequestMapping(value = "/log_operetion")
public class LogOperationController {

	@RequestMapping("/save_by_request_param")
	public AjaxForm beginByRequestParam(@RequestParam Map<String, Object> params,HttpServletRequest request) {
		return save(params,request);
	}

	@RequestMapping("/save_by_request_body")
	public AjaxForm beginByRequestBody(@RequestBody Map<String, Object> params,HttpServletRequest request) {
		return save(params,request);
	}

	private AjaxForm save(Map<String, Object> params,HttpServletRequest request) {
		AjaxForm ajaxForm = new AjaxForm();
		ajaxForm.setError(null);
		LogOperation model = ModelUtil.toModel(params, LogOperation.class);
		model.setIpAddress(RequestUtil.getIpAddress(request));
		model.save();
		if (model.getId() != null) {
			ajaxForm.setSuccess(model.getId());
		}
		return ajaxForm;
	}
	
	@RequestMapping("/update_by_request_param")
	public AjaxForm updateByRequestParam(@RequestParam Map<String, Object> params) {
		return update(params);
	}

	@RequestMapping("/update_by_request_body")
	public AjaxForm updateByRequestBody(@RequestBody Map<String, Object> params) {
		return update(params);
	}
	private AjaxForm update(Map<String, Object> params) {
		LogOperation model = ModelUtil.toModel(params, LogOperation.class);
		AjaxForm ajaxForm = new AjaxForm();
		ajaxForm.setError(null);
		if(model.getId()!=null) {
			model.update();
			ajaxForm.setSuccess(null);
		}
		return ajaxForm;
	}
}
