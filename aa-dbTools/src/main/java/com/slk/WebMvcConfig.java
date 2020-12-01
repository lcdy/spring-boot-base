package com.slk;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Component
public class WebMvcConfig extends WebMvcConfigurationSupport {
	@Override
	protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		System.out.println("\t注入FastJsonHttpMessageConverter");
		converters.add(new FastJsonHttpMessageConverter());
		super.extendMessageConverters(converters);
	}
}
