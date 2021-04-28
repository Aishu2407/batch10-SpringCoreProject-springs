package com.te.sprincoreannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Import({EmployeeConfig2.class,DepartmentConfig.class})
@Configuration

public class AllConfig {

}
