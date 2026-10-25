package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	private Deduction deductionCalculator = new Deduction();
    private VAT vatCalculator = new VAT();
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = deductionCalculator.calculateDeduction(billAmount, deductionPercentage);
		// VAT kalkulatzen dugu
		VAT = vatCalculator.calculateVAT(code, billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}
