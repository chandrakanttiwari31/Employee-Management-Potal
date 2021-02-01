package com.emp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class employeeDispatcher	extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			Class[] configFiles={employeeConfig.class};
			
			return configFiles;
		}

		@Override
		protected String[] getServletMappings() {
			String[] mapping={"/"};
			return mapping;
		}

	}

