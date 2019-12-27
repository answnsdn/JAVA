package workbook.pg24exam5;

public class Test05 {

	public static void main(String[] args) {
		Calc cal = new Calc();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		
		int sum = cal.calcSum(a, b, c, d);
		double avg = (double)sum/args.length;
		
		String grade = new String();
		
		if(avg >=90) {
			grade = "A����";
		}else if(avg >=70) {
			grade = "B����";
		}else if(avg >=50) {
			grade = "C����";
		}else if(avg >=30) {
			grade = "D����";
		}else {
			grade = "F����";
		}
		
		System.out.println("Sum="+sum);
		System.out.println("Avg="+avg);
		System.out.println(grade);
	}
}