package workbook.pg55exam2;
public class Company {
	private double salary;
	private double annualIncome;
	private double afterTaxAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
	}
	public Company(double salary) {
		this.salary = salary;
	}
	
	public double getIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}
	public double getAfterTaxIncome() {
		afterTaxAnnualIncome = getIncome()*0.9;
		return afterTaxAnnualIncome;
	}
	public double bonus() {
		bonus = salary*0.2*4;
		return bonus;
	}
	public double afterTaxBonus() {
		afterTaxBonus = bonus() * 0.945;
		return afterTaxBonus;
	}
	public void print() {
		System.out.println("연 기본급 합: "+getIncome()+" 세후: "+getAfterTaxIncome());
		System.out.println("연 보너스 합: "+bonus()+" 세후: "+afterTaxBonus());
		System.out.println("연 지급액 합: "+(getAfterTaxIncome()+afterTaxBonus()));
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getAfterTaxAnnualIncome() {
		return afterTaxAnnualIncome;
	}
	public void setAfterTaxAnnualIncome(double afterTaxAnnualIncome) {
		this.afterTaxAnnualIncome = afterTaxAnnualIncome;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
}
