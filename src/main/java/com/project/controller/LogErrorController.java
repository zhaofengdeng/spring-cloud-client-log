package com.project.controller;

import java.util.Map;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.LogError;
import com.util.base.ModelUtil;
import com.util.form.AjaxForm;

@RestController
@RequestMapping(value = "/log_error")
public class LogErrorController {
	@RequestMapping("/save_by_request_param")
	public AjaxForm beginByRequestParam(@RequestParam Map<String, Object> params) {
		return save(params);
	}

	@RequestMapping("/save_by_request_body")
	public AjaxForm beginByRequestBody(@RequestBody Map<String, Object> params) {
		return save(params);
	}

	private AjaxForm save(Map<String, Object> params) {
		AjaxForm ajaxForm = new AjaxForm();
		ajaxForm.setError(null);
		LogError model = ModelUtil.toModel(params, LogError.class);
		model.save();
		if (model.getId() != null) {
			ajaxForm.setSuccess(model.getId());
		}
		return ajaxForm;
	}
	
}
