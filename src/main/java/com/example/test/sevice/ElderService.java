package com.example.test.sevice;

import com.example.test.model.Elder;

import java.util.List;

public interface ElderService {
    List<Elder> getElders();

    Elder saveElder(Elder elder);

    Elder getSingleUser(int id);

    void deleteElder(int id);

    Elder updateElder(Elder elder);

    List<Elder> getUserElders(int userid);
}
