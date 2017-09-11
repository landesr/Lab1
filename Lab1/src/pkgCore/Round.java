package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		Roll firstRoll = new Roll();
		ComeOutScore = firstRoll.getScore();
		if (ComeOutScore == 7 || ComeOutScore == 11 || ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			rolls.addLast(firstRoll);
		} else {
			rolls.addLast(firstRoll);
			int rollScore;
			do {
				Roll nextRoll = new Roll();
				rollScore = nextRoll.getScore();
				rolls.addLast(nextRoll);
			} while (rollScore != 7 && rollScore != ComeOutScore);
		}

		if (ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = pkgCore.eGameResult.NATURAL;
		} else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = pkgCore.eGameResult.CRAPS;
		} else if (rolls.getLast().getScore() == 7) {
			eGameResult = pkgCore.eGameResult.SEVEN_OUT;
		} else {
			eGameResult = pkgCore.eGameResult.POINT;
		}
	}
}
