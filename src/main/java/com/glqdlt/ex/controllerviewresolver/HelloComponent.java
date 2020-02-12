package com.glqdlt.ex.controllerviewresolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Jhun
 * 2020-02-12
 */

/**
 *
 */
@Component("helloComponent")
public class HelloComponent extends AbstractView {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloComponent.class);

    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.info("I am Hello Component~");
        response.sendRedirect("http://www.naver.com");
    }
}
