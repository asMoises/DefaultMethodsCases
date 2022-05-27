package service;

public class BrazilInterestService implements InterestServicce {

	private Double interest;

	public BrazilInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterestRate() {
		return interest;
	}
}
