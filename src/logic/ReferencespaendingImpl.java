package logic;

public class ReferencespaendingImpl implements Referencespaending {

	private double sigmaRef = Double.NaN;
//	private orveregraense = Double.NaN, nedergraense = Double.NaN;
	private String sigmaRefMellemRegning;
	
	@Override
	public double getSigmaRef() {
//		Den måde OC11 ville have vi skulle gøre det på:
		
		if(sigmaN.getSigmaN != 0 && sigmaB.getSigmaB != 0){
			sigmaRef = (Math.sqrt((Math.pow((SigmaN.getSigmaN + SigmaB.getSigmaB), 2))) + 3 * Math.pow(tau.getTau, 2));
		} else {
			sigmaRef = (3 * Math.pow(tau.getTau, 2));
		}
		
//		Det her gør det samme, men fylder 1 linje kode...
//		sigmaRef = (Math.sqrt((Math.pow((SigmaN.getSigmaN + SigmaB.getSigmaB), 2))) + 3 * Math.pow(tau.getTau, 2));
		
		sigmaRefMellemRegning = "√(SigmaN + SigmaB)² + 3 * Tau²\n"
		+ "√(" + SigmaN.getSigmaN + "+" + SigmaB.getSigmaB + ")² + 3 * " + tau.getTau + "² = " + sigmaRef;
		
		return sigmaRef;

	}

	public String getMellemRegning(){
		return sigmaRefMellemRegning;
	}
	
}
