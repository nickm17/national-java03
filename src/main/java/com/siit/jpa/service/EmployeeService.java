package com.siit.jpa.service;

import com.siit.jpa.model.EmployeeEntity;
import com.siit.jpa.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeEntity> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public EmployeeEntity saveNewEmployee(EmployeeEntity newEmployee){
        return employeeRepository.save(newEmployee);
    }

    @Transactional(rollbackOn = Exception.class)
    public EmployeeEntity updateEmployeeJob(int id){
        Optional<EmployeeEntity> byId = employeeRepository.findById(id);

        if (byId.isPresent()){
            byId.get().setJob("AltJob");
        }

//        employeeRepository.save(byId.get());

        return byId.get();
    }

    public List<EmployeeEntity> getFromInterval(LocalDate start, LocalDate end){
        System.out.println(employeeRepository.findAllByHiredateBetween(start, end));
        return employeeRepository.findAllByHiredateAfterAndHiredateBefore(start, end);
    }

    public List<EmployeeEntity> getByNameCustomQuery(String name){
        return employeeRepository.findAllByNameCustomQuery(name);
    }

}
