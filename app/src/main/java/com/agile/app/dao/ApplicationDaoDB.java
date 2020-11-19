package com.agile.app.dao;

import com.agile.app.entity.Application;
import com.agile.app.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationDaoDB implements ApplicationDao{

    ApplicationRepository applicationRepository;


    @Override
    public void addApplication(Application application) {
        applicationRepository.save(application);
    }
}
