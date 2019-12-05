package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("india").password("{noop}india").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //form based authentication
        /*http.authorizeRequests().antMatchers("/player").authenticated().and().formLogin().
                and().logout().logoutSuccessUrl("/player").deleteCookies("JSESSIONID").invalidateHttpSession(true);*/

        http.authorizeRequests().antMatchers("/player/**").authenticated().and().httpBasic().and().csrf().disable();
    }
}
