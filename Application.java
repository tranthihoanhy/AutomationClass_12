package day5_inheritance;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.setHoten("Nguyen Van SV1");
		sv1.setDiaChi("Hanoi");
		sv1.setNgaySinh("01/01/2000");
		sv1.GPA = 4.5;
		System.out.println(sv1.getHoten() + "," +sv1.getDiaChi()+ "," + sv1.getNgaySinh() + "," + sv1.GPA );
		sv1.diHoc();
		sv1.diChoi();
		
		System.out.println();
		GiaoVien gv1 = new GiaoVien();
		gv1.setHoten("Nguyễn Văn GV1");
		gv1.setDiaChi("Hanoi");
		gv1.setNgaySinh("18/04/1988");
		gv1.monHoc = "Auto test";
		System.out.println(gv1.getHoten() +"," +gv1.getDiaChi() +"," + gv1.getNgaySinh() + "," +gv1.monHoc);
		gv1.diChoi();
		gv1.diDay();
	}
}
