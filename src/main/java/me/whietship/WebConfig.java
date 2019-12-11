package me.whietship;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class))
//defalt filter사용하지 않고,Controller만 빈으로 등록하겠다.
public class WebConfig {
}
