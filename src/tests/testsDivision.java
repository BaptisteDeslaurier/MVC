package tests;

import classes.Division;

public class testsDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Division maDivDefaut = new Division();
		Division maDivInit = new Division(1, "STS2");

		System.out.println(maDivDefaut.getCode());
		System.out.println(maDivDefaut.getLibelle());



		System.out.println(maDivInit.getCode());
		System.out.println(maDivInit.getLibelle());

		maDivInit.setCode(3);
		maDivInit.setLibelle("SLAM");

		System.out.println(maDivInit.toString());
	}
}