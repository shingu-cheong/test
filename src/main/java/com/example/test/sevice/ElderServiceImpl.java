package com.example.test.sevice;

import com.example.test.model.Elder;
import com.example.test.model.UserElder;
import com.example.test.repository.ElderRepository;
import com.example.test.repository.UserElderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElderServiceImpl implements ElderService{

    @Autowired
    ElderRepository elderRepository;
    @Autowired
    UserElderRepository userElderRepository;

    @Override
    public List<Elder> getElders(){
        return (List<Elder>) elderRepository.findAll();
    }

    @Override
    public Elder saveElder(Elder elder){
        return elderRepository.save(elder);
    }

    @Override
    public  Elder getSingleElder(int id){
        Optional<Elder> elder = elderRepository.findById(id);
        if(elder.isPresent()){
            return elder.get();
        }
        throw  new RuntimeException("유저를 찾을 수 없음");
    }

    @Override
    public void deleteElder(int id){
        elderRepository.deleteById(id);
    }

    @Override
    public Elder updateElder(Elder elder){
        return elderRepository.save(elder);
    }

    @Override
    public  List<Elder> getUserElders(int userid){

        return elderRepository.findByUserId(userid);
    }

    @Override
    public UserElder addUserElder(UserElder userElder){
        return userElderRepository.save(userElder);
    }



}
