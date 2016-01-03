package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by admin on 03.01.2016.
 */
// �������, ��� ��� ������������
@Configuration
// �������� MVC
@EnableWebMvc
// ��������� ��� ������ ����������� � ��������� ����������
@ComponentScan("com.controller")
public class WebAppConfig {

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        // ��������� ��� ����� ������ ���� ���-��������
        resolver.setPrefix("/views/");
        // ������ View ������� �� ����� ������������
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

}
