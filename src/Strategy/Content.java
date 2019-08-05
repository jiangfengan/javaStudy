package Strategy;

public class Content {

    private Strategy strategy;

    public Content(String tag){
        switch (tag) {
            case "1":
                StrategyA strategyA=new StrategyA();
                this.strategy=strategyA;
                break;
            case "2":
                StrategyB strategyB=new StrategyB();
                this.strategy=strategyB;
                break;
            case "3":
                StrategyC strategyC=new StrategyC();
                this.strategy=strategyC;
                break;
        }
    }

    public double getMoney(){
        return strategy.getMoney();
    }
}
