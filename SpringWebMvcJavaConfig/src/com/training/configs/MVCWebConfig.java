package com.training.configs;

import com.training.dao.MedicineDao;
import com.training.dao.UserDao;
import com.training.entities.Medicine;
import com.training.entities.Users;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "com.training")
@EnableWebMvc
public class MVCWebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ModelAndView mdlView(){
        return new ModelAndView();
    }

    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }


    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        dataSource.setUsername("oracle");
        dataSource.setPassword("oracle123");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());

        return  jdbcTemplate;
    }

    @Bean
    public Users user(){
        return new Users();
    }

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public Medicine medicine() {return new Medicine();}

    @Bean
    public MedicineDao medicineDao() {return new MedicineDao();}

}
