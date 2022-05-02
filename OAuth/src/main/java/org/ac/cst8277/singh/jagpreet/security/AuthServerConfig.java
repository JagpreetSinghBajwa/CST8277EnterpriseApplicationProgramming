package org.ac.cst8277.singh.jagpreet.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import org.ac.cst8277.singh.jagpreet.security.jwt.JwtTokenEnhancer;

@SuppressWarnings("deprecation")
@Configuration
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

	@Bean("passwordEncoder")
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients
				.inMemory()
				.withClient("clientId")
				.secret(passwordEncoder().encode("client-secret"))
				.scopes("read", "write")
				.authorizedGrantTypes("authorization_code", "refresh_token")
				.redirectUris("http://localhost:8080/login/oauth2/code/github" )
				.autoApprove(true);
	}

	@Bean
	JwtTokenStore getAccessTokenConverter() {
		return new JwtTokenStore(JwtTokenEnhancer.getInstance());
	}
}