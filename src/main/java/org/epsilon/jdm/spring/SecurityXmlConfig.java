package org.epsilon.jdm.spring;

import org.springframework.context.annotation.ComponentScan;

// @Configuration
// @ImportResource({ "classpath:webSecurityConfig.xml" })
@ComponentScan("org.epsilon.jdm.security")
public class SecurityXmlConfig {

	public SecurityXmlConfig() {
		super();
	}

}
