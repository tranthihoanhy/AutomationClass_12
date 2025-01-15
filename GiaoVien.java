package day5_inheritance;

public class GiaoVien extends Nguoi{
	public String monHoc;
	
	public void diDay()
	{
		System.out.println("Giáo viên codestar dạy môn "+monHoc + " tối thứ 4 và tối CN hàng tuần");
	}
	
	@Override
	public void diChoi()
	{
		System.out.println("Giáo viên codestar đi chơi sau khi dạy xong");
	}
}
