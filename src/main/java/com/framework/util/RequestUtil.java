package com.framework.util;

import javax.servlet.http.HttpServletRequest;

import com.util.base.StringUtil;

public class RequestUtil {
	private RequestUtil() {
	}

	private static final Boolean isIP(String ip) {
		if (StringUtil.isNullOrEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
			return false;
		}
		return true;

	}

	/**
	 * 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址;
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	public static final String getIpAddress(HttpServletRequest request) {
		// 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址
		String ip = request.getHeader("X-Forwarded-For");
		if (!isIP(ip)) {

			if (!isIP(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (!isIP(ip)) {
				ip = request.getHeader("HTTP_CLIENT_IP");
			}
			if (!isIP(ip)) {
				ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			}
			if (!isIP(ip)) {
				ip = request.getRemoteAddr();
			}
		} else if (ip.length() > 15) {
			String[] ips = ip.split(",");
			for (int index = 0; index < ips.length; index++) {
				String strIp = ips[index];
				if (!("unknown".equalsIgnoreCase(strIp))) {
					ip = strIp;
					break;
				}
			}
		}
		return ip;
	}

}
