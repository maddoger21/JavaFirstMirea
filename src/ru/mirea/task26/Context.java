package ru.mirea.task26;

class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy){
        this.strategy =strategy;
    }
    void pay(){
        strategy.pay();
    }
    void collectData(){
        strategy.collectData();
    }
}
