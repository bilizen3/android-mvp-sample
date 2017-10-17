package com.billflores.android_mvp_sample.activity;

import com.billflores.android_mvp_sample.entity.Person;

import java.util.ArrayList;

/**
 * Created by bill on 2/10/17.
 */

public interface MainActivity {

    interface View{
        void showresult(String result);
        void showError(String error);
        void showList(ArrayList<Person> persons);
    }

    interface Presenter{
        void showresult(String result);
        void alcuadrado(String data);
        void showError(String error);
        void showList();
    }

    interface Model{
        void alcuadrado(String data);
    }



}
