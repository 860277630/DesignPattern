package com.example.demo.decorator.InterfaceType;

public abstract class BaseCookImpl implements BaseCook{
    private BaseCook baseCook;

    public BaseCookImpl(BaseCook baseCook){
        this.baseCook = baseCook;
    }

    @Override
    public void cookDish(){
        this.baseCook.cookDish();
    }

}
