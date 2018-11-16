package com.github.alexgreench.mvppattern;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    MainPresenter(MainContract.View view){
        this.view = view;
    }

    @Override
    public void inputText(String text) {
        String reverse_text = new StringBuilder(text).reverse().toString();
        view.showToast(reverse_text);
    }
}
