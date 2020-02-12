package com.glqdlt.ex.controllerviewresolver;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Jhun
 * 2020-02-12
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * {@link HelloComponent} 를 보세요. 아래 주석 처리한 것은 기본적으로 이미 등록되어 있는 ViewResolver 라
     * 혹시나 레거시 프로젝트에 구성해야할 경우에 BeanNameViewResolver 를 추가해야한다는 걸 보여주려고 해놓음.
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
//        BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
//        registry.viewResolver(beanNameViewResolver);
    }
}
