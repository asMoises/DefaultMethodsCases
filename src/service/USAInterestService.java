package service;

public class USAInterestService implements InterestServicce {
	private Double interest;

	public USAInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterestRate() {
		return interest;
	}
}
