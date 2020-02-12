package com.glqdlt.ex.controllerviewresolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jhun
 * 2020-02-12
 */
@Controller
@RequestMapping("/")
public class SomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeController.class);

    /**
     * {@link HelloComponent} 빈 이름이 'helloComponent' 인 찾습니다.
     * 빈 이름을 찾는 건 단순하나, http response 에 대한 핸들링 처리를 제대로 동작하려면
     * AbstractView 을 상속 받아 http response 에 대한 처리를 어떻게 핸들링 할지를 처리하는 추상 메소드를 구현해줘야 합니다.
     *
     * @return {@link HelloComponent}
     */
    @GetMapping("hello")
    public String returnBeanNameHelloComponent() {
        LOGGER.info("Call Hello Endpoint");
        return "helloComponent";
    }
}
