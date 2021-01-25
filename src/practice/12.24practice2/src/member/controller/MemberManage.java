package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManage {

	Silver[] si = new Silver[10];
	Gold[] go = new Gold[10];
	Vip[] vi = new Vip[10];
	VVip[] vvi = new VVip[10];

	private int sLastIndex = 0;
	private int gLastIndex = 0;
	private int vLastIndex = 0;
	private int vvLastIndex = 0;

	public void silverInsert(Silver s) {
		if (sLastIndex < si.length)// index값이 최대 10이라 설정해줘서 그 이상 제한하는 코드.
			si[sLastIndex++] = s;
	}

	public void goldInsert(Gold g) {
		if (gLastIndex < go.length)
			go[gLastIndex++] = g;
	}

	public void VipInsert(Vip v) {
		if (vLastIndex < vi.length)
			vi[vLastIndex++] = v;
	}

	public void vvipInsert(VVip vv) {
		if (vvLastIndex < vvi.length)
			this.vvi[vvLastIndex++] = vv;
	}

	public void printData() {
		System.out.println("---------------------------<<회원정보>>---------------------------");
		System.out.println(" 이름              등급              포인트             이자포인트");
		System.out.println(" -----------------------------------------------------------------");
		if (sLastIndex != 0) {
			for (int i = 0; i < sLastIndex; i++) {
				System.out.println(si[i].getName() + " 	  " + si[i].getGrade() + "     " + si[i].getPoint() + " 	  "
						+ si[i].getJaPoint());
			}
		}
		if (gLastIndex != 0) {
			for (int i = 0; i < gLastIndex; i++) {
				System.out.println(go[i].getName() + " 	  " + go[i].getGrade() + "     " + go[i].getPoint() + " 	  "
						+ go[i].getJaPoint());
			}

		}
		if (vLastIndex != 0) {
			for (int i = 0; i < vLastIndex; i++) {
				System.out.println(vi[i].getName() + " 	  " + vi[i].getGrade() + "     " + vi[i].getPoint() + " 	  "
						+ vi[i].getJaPoint());
			}

		}
		if (vvLastIndex != 0) {
			for (int i = 0; i < vvLastIndex; i++) {
				System.out.println(vvi[i].getName() + " 	  " + vvi[i].getGrade() + "     " + vvi[i].getPoint()
						+ " 	  " + vvi[i].getJaPoint());
			}

		}

	}
}
