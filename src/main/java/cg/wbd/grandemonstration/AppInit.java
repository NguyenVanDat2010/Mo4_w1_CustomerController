package cg.wbd.grandemonstration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/** Tạo một dispatcher initializer để thay thế cho web.xml */

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
