public class Taxpayer {
    private String socialSecurityNumber;
    private double yearlyGrossIncome;
    private double taxOwed;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getYearlyGrossIncome() {
        return yearlyGrossIncome;
    }

    public void setYearlyGrossIncome(double yearlyGrossIncome) {
        this.yearlyGrossIncome = yearlyGrossIncome;
        calculateTax();
    }

    public double getTaxOwed() {
        return taxOwed;
    }

    private void calculateTax() {
        if (yearlyGrossIncome < 30000) {
            taxOwed = yearlyGrossIncome * 0.15;
        } else {
            taxOwed = yearlyGrossIncome * 0.28;
        }
    }
}
