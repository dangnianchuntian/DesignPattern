package com.zhanghan.zhdp.strategy;

public class CashContext {
    private CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "打8折收费":
                cs = new CashRebate("0.8");
                break;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;

        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
