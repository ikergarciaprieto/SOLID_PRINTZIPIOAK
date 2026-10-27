package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float vatAmount;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

	private IDeduction deductionCalculator;
	private IVAT vatCalculator;

	public void totalCalc() {
		billDeduction = deductionCalculator.calcDeduction(billAmount, deductionPercentage);
		vatAmount = vatCalculator.calcVAT(billAmount);
		billTotal = (billAmount - billDeduction) + vatAmount;
	}
}