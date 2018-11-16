package com.github.alexgreench.mvppattern;

public interface MainContract {

    interface View{
        void showToast(String msg);
    }

    interface Presenter{
        void inputText(String text);
    }
}
