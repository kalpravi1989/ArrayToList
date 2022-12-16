package arrayTolistOmitLength;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayToList {
	private List<String> toList(String[] s, int len) {
		List<String> res = new ArrayList<String>(Arrays.asList(s));
		System.out.println(res);
		for (int i = 0; i < res.size(); i++) {
			if (res.get(i).length() == len) {
				res.remove(i);
				i--;
			}
		}
		return res;
	}
	@Test
	public void test1() {
		String[] s = { "a", "bb", "b", "ccc" };
		int len = 2;
		List<String> ans = toList(s, len);
		List<String> exp = Arrays.asList("a", "b", "ccc");
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}

	@Test
	public void test2() {
		String[] s = { "a", "bb", "b", "ccc" };
		int len = 0;
		List<String> ans = toList(s, len);
		List<String> exp = Arrays.asList("a", "bb", "b", "ccc");
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}

	@Test
	public void test3() {
		String[] s = { "a", "bb", "b", "ccc" };
		int len = 4;
		List<String> ans = toList(s, len);
		List<String> exp = Arrays.asList("a", "bb", "b", "ccc");
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}

	@Test
	public void test4() {
		String[] s = { "aaaa", "bbbb", "bbbb", "cccc" };
		int len = 4;
		List<String> ans = toList(s, len);
		List<String> exp = Arrays.asList();
		if (ans.size() != 0) {
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}
	}

	@Test
	public void test5() {
		String[] s = { "aaaa", "bbbb", "bbbb", "cccc" };
		int len = 20;
		List<String> ans = toList(s, len);
		List<String> exp = Arrays.asList("aaaa", "bbbb", "bbbb", "cccc");
		if (ans.size() != 0) {
			for (int i = 0; i < ans.size(); i++) {
				Assert.assertEquals(ans.get(i), exp.get(i));
			}
		}
	}
}
