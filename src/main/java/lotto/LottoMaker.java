package lotto;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class LottoMaker {
    private List<List<Integer>> lottoNumbers = new ArrayList<>();

    public void makeRandomLottoNumbers(int purchaseNumber) {
        while (lottoNumbers.size() < purchaseNumber) {
            List<Integer> lottoNumber = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            if (!lottoNumbers.equals(lottoNumbers)) {
                lottoNumbers.add(lottoNumber);
            }
        }
    }
}
