package pkgTest;

import org.junit.Assert;
import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			Assert.assertTrue(d.getDieValue() >= 1 && d.getDieValue() <= 6);
		}

	}

}
