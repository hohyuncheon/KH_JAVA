package e2018.exam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

//[Data("A"), Data("C")]
//실행결과 출력이 위와 같도록 Data 클래스를 수정하라.
public class Exam11 {

	static class Data {

		String value;

		public Data(String value) {
			this.value = value.toUpperCase();
		}

		@Override
		public String toString() {
			return "Data (\"" + value + "\")";
		}

		// string은 equals
		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Data)) {
				return false;
			}
			if (this.value.equals(((Data) obj).value)) {
				return true;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(value);
		}
	}

	public static void main(String[] args) {
		Collection<Data> a = new ArrayList<Data>();
		a.add(new Data("a"));
		a.add(new Data("b"));
		a.add(new Data("c"));

		a.remove(new Data("B"));

		System.out.println(a.toString());
	}

}