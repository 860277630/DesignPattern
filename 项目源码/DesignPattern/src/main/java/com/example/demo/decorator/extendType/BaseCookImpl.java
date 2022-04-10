package com.example.demo.decorator.extendType;

public abstract class BaseCookImpl extends BaseCook{
    private BaseCook baseCook;

    public BaseCookImpl(BaseCook baseCook){
        this.baseCook = baseCook;
    }

    @Override
    public void cookDish(){
        this.baseCook.cookDish();
    }
}
