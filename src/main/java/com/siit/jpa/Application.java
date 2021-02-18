package com.siit.jpa;

import com.siit.jpa.model.EmployeeEntity;
import com.siit.jpa.repository.DepartmentRepository;
import com.siit.jpa.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
@EnableJpaRepositories
@EnableTransactionManagement
public class Application implements CommandLineRunner {

    private static SpringApplication springApplication = new SpringApplication(Application.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        springApplication.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<EmployeeEntity> allEmployees = employeeService.getAllEmployees();
        System.out.println(allEmployees);

        EmployeeEntity entity = new EmployeeEntity();
        entity.setName("New");

        employeeService.saveNewEmployee(entity);

        System.out.println(departmentRepository.findAll());

        System.out.println(employeeService.getFromInterval(LocalDate.of(1981,1,1), LocalDate.of(1981,12,31)));

        System.out.println(employeeService.getByNameCustomQuery("CLARK"));

    }

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("password");
//        dataSource.setUrl(
//                "jdbc:mysql://localhost:3306/hr");
//
//        return dataSource;
//    }

}
