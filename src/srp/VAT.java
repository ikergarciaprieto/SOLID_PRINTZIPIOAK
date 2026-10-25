package srp;

public class VAT {
    public float calculateVAT(String code, float billAmount) {
    	// 0 kodea duten fakturei ez zaie VAT-a aplikatzen
        if ("0".equals(code)) {
            return 0.0f;
        }
                        
        return (float) (billAmount * 0.16);
    }
}





