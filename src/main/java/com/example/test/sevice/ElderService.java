package com.example.test.sevice;

import com.example.test.model.Elder;
import com.example.test.model.UserElder;

import java.util.List;

public interface ElderService {
    List<Elder> getElders();

    Elder saveElder(Elder elder);

    Elder getSingleElder(int id);

    void deleteElder(int id);

    Elder updateElder(Elder elder);

    List<Elder> getUserElders(int userid);

    UserElder addUserElder(UserElder userElder);
}
