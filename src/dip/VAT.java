package dip;

public class VAT implements IVAT {
	@Override
	public float calcVAT(float billAmount) {
		return (float) (billAmount * 0.16);
	}
}
