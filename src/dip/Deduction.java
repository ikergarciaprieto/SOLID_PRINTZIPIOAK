package dip;

public class Deduction implements IDeduction {
	@Override
	public float calcDeduction(float billAmount, int deductionPercentage) {
		return (billAmount * deductionPercentage) / 100;
	}
}
