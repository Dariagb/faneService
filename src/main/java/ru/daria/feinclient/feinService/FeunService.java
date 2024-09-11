package ru.daria.feinclient.feinService;

import org.springframework.stereotype.Service;

@Service
public class FeunService {
    public Long calculationOfTheOxade(Long volume){
        Long oxade=volume*60;
        return oxade;
    }
}
