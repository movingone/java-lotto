package domain;

import controller.LottoController;
import domain.Lotto;
import domain.LottoMachine;
import domain.MyLotto;
import domain.WinStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.LottoOutput;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoTest {
    @Test
    @DisplayName("로또 번호 확인")
    public void list() {
        List<Integer> mynumbers = new ArrayList<>(List.of(1, 2, 3, 9, 22, 33));
        Lotto lotto = new Lotto(mynumbers);
        List<Integer> winningNumber = List.of(1, 2, 3, 9, 22, 33);

        assertThat(lotto.getNumbers()).isEqualTo(winningNumber);
    }
}
