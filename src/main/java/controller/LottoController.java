package controller;

import domain.Lotto;
import domain.LottoMachine;
import domain.MyLotto;
import domain.WinStatus;

import java.util.List;

public class LottoController {

    private LottoMachine lottoMachine = new LottoMachine();
    private MyLotto myLotto = new MyLotto();
    private WinStatus winStatus = new WinStatus();

    public MyLotto totalLotto(int count) {
        for (int i = 0; i < count; i++) {
            List<Integer> nowLotto = lottoMachine.randomBall();
            myLotto.add(nowLotto);
        }
        return myLotto;
    }

    public WinStatus resultReturn(Lotto winLotto) {
        for (Lotto currentLotto  : myLotto.getLotto()) {
            int price = currentLotto .numberCheck(winLotto);
            winStatus.correct(price);
        }
        return winStatus;
    }

}
