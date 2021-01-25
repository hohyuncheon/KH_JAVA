package com.exception.number;

public class NumberProcess {

	public NumberProcess() {
		super();
	}

	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		// 1~100 사이 숫자면 실행
		if (num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			// 첫번째자리가 두번쨰자리의 배수면 실행
			if ((num1 % num2) == 0) {
				return true;

			} else {
				return false;
			}

		} else {
			throw new NumberRangeException("1~100사이의 값입력하시오");
		}
	}

}
