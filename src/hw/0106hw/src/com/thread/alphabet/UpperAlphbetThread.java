package com.thread.alphabet;

public class UpperAlphbetThread implements Runnable {

	public void UpperAlphbetThread() {
	}

	@Override
	public void run() {

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
	}
}
