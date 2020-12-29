package com.geovannicalderon.ds.chicagoanalisis.models;

public class Worker extends Person{

    protected String department;
    protected String jobTitle;
    protected boolean isPartTime;
    protected boolean isHourly;
    protected int typicalAmountOfHours;
    protected double annualSalary;
    protected double hourlyRate;

    public Worker(final String name,
                  final String lastname,
                  final String jobTitle,
                  final String department,
                  final String isPartTime,
                  final String isHourly,
                  final String typicalAmountOfHours,
                  final String annualSalary,
                  final String hourlyRate) {
        super(name, lastname);
        this.jobTitle = jobTitle;
        this.department = department;
        this.isPartTime = this.parsePartTimeInput(isPartTime);
        this.isHourly = this.parseIsHourlyInput(isHourly);
        this.typicalAmountOfHours = this.parseTypicalAmountOfHoursInput(typicalAmountOfHours);
        this.annualSalary = this.parseAnnualSalaryInput(annualSalary);
        this.hourlyRate = this.parseHourlyRateInput(hourlyRate);
    }

    private void computerAnnualSalaryForHourlyRate(){

        if (this.isHourly){
            this.annualSalary = this.typicalAmountOfHours * 52 * this.hourlyRate;
        }
    }

    private boolean parseIsHourlyInput(String isHourlyColumnData){

        boolean isHourly = false;
        if (isHourlyColumnData.compareTo("Hourly") == 0){
            isHourly = true;
        }
        return isHourly;
    } // METHOD IS HOURLY ENDS ------------------------------------------------

    private int parseTypicalAmountOfHoursInput(String typicalAmountOfColumnData){

        int typicalAmountOfHours = 0;
        if (!typicalAmountOfColumnData.isEmpty()){
            try {
                typicalAmountOfHours = Integer.parseInt(typicalAmountOfColumnData);
            } // TRY ENDS
            catch (NumberFormatException exc){
                System.out.println(typicalAmountOfColumnData + " is not a valid number");
                exc.printStackTrace();
            } // CATCH ENDS
        } // IF ENDS
        return typicalAmountOfHours;
    } // METHOD TYPICAL AMOUNT OF HOURS ENDS ----------------------------------

    private double parseAnnualSalaryInput(String annualSalaryColumnData){

        double annualSalary = 0.0;
        if (!annualSalaryColumnData.isEmpty()){
            try {
                annualSalary = Double.parseDouble(annualSalaryColumnData);
            } // TRY ENDS
            catch (NumberFormatException exc){
                System.out.println(annualSalaryColumnData + " is not a valid number");
                exc.printStackTrace();
            } // CATCH ENDS
        } // IF ENDS
        return annualSalary;
    } // METHOD ANNUAL SALARY ENDS --------------------------------------------


    private double parseHourlyRateInput(String hourlyRateColumnData){

        double hourlyRate = 0.0;
        if (hourlyRateColumnData.compareTo(" ") != 0){
            try {
                hourlyRate = Double.parseDouble(hourlyRateColumnData);
            } // TRY ENDS
            catch (NumberFormatException exc){
                System.out.println(hourlyRateColumnData + " is not a valid number");
                exc.printStackTrace();
            } // CATCH ENDS
        } // IF ENDS
        return hourlyRate;
    } // METHOD HOURLY RATE ENDS ----------------------------------------------

    public String toString() {
        return "Worker{" +
                "department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", isPartTime=" + isPartTime +
                ", isHourly=" + isHourly +
                ", typicalAmountOfHours=" + typicalAmountOfHours +
                ", annualSalary=" + annualSalary +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    /**
     *
     * @param partTimeColumnData
     * @return
     */
    private boolean parsePartTimeInput(String partTimeColumnData){

        boolean isPartTime = false;
        if (partTimeColumnData.compareTo("P") == 0){
            isPartTime = true;
        }
        return isPartTime;

    } //METHOD PARSE PART TIME INPUT ENDS ---------------------------------

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public int getTypicalAmountOfHours() {
        return typicalAmountOfHours;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

} //CLASS WORKER ENDS ---------------------------------------------------------
