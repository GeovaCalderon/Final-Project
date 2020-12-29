package com.geovannicalderon.ds.chicagoanalisis;

import com.geovannicalderon.ds.chicagoanalisis.models.Worker;

import java.io.BufferedReader;

public class Facts {

    private Worker[] workers;

    public Facts(Worker[] workers) {
        this.workers = workers;
        this.getHigherPaidWorker();
        this.getHigherPaidHalfTimePosition();
        this.getAverageSalaryForPartTimeWorkers();
        this.getFiveHigherPaidWorkers();
        this.getJobTitleHigherAnnualSalaryAverage();
        this.higherPaidDepartment();


    }

    public void getHigherPaidWorker(){
        Worker hiherPaid = workers[0];
        for (int index= 0; index < this.workers.length; ++index){
            if (this.workers[index].getAnnualSalary() > hiherPaid.getAnnualSalary()){
                hiherPaid = this.workers[index];
            }
        }
        System.out.println("El empleado con el salario más alto es:");
        System.out.println(hiherPaid.toString());
    }

    public void getHigherPaidHalfTimePosition(){

        Worker higherPaid = null;
        for (int index = 0; index < this.workers.length; ++index){
            if (this.workers[index].isPartTime() && (higherPaid == null ||
                            this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary())){
                higherPaid = this.workers[index];
            }
        }
        System.out.println(" El empleado que trabaja medio tiempo con el salario más alto es:");
        System.out.println(higherPaid.toString());
    }

    public void getAverageSalaryForPartTimeWorkers(){

        int amountOfPartTimeWorkers = 0;
        double totalPartTimeSalaries = 0.0;
        for (Worker worker: workers){
            if (worker.isPartTime()){
                amountOfPartTimeWorkers++;
                totalPartTimeSalaries += worker.getAnnualSalary();
            }
        }
        System.out.println("El promedio salarial de los empleados de medio tiempo en la ciudad de Chicago es: " +
                totalPartTimeSalaries / amountOfPartTimeWorkers);
    }

    public void higherPaidDepartment(){

        Worker hiherPaid = workers[0];
        for (int index= 0; index < this.workers.length; ++index){
            if (this.workers[index].getAnnualSalary() > hiherPaid.getAnnualSalary()){
                hiherPaid = this.workers[index];
            }
        }
        System.out.println("El departamento más caro es:");
        System.out.println(hiherPaid.getDepartment());
    }

    public void getFiveHigherPaidWorkers(){
        Worker higherPaid1 = workers[0]; Worker higherPaid2 = workers[0];Worker higherPaid3 = workers[0];
        Worker higherPaid4 = workers[0];  Worker higherPaid5 = workers[0];

        for (int index = 0; index < this.workers.length; ++index){
            if (this.workers[index].getAnnualSalary() > higherPaid1.getAnnualSalary()){
                higherPaid1 = this.workers[index];
            }
            else if (this.workers[index].getAnnualSalary() > higherPaid2.getAnnualSalary()){
                higherPaid2 = this.workers[index];
            }
            else if (this.workers[index].getAnnualSalary() > higherPaid3.getAnnualSalary()){
                higherPaid3 = this.workers[index];
            }
            else if (this.workers[index].getAnnualSalary() > higherPaid4.getAnnualSalary()){
                higherPaid4 = this.workers[index];
            }
            else if (this.workers[index].getAnnualSalary() > higherPaid5.getAnnualSalary()){
                higherPaid5 = this.workers[index];
            }
        }
        System.out.println("Los 5 empleados con mayor ingreso anual son:");
        System.out.println(higherPaid1.toString());
        System.out.println(higherPaid2.toString());
        System.out.println(higherPaid3.toString());
        System.out.println(higherPaid4.toString());
        System.out.println(higherPaid5.toString());
    }

    public void getJobTitleHigherAnnualSalaryAverage() {

        int amountOfWorkers = 0;
        double totalAnnualSalaries = 0.0;

        for (Worker worker : workers) {
            amountOfWorkers++;
            totalAnnualSalaries += worker.getAnnualSalary();
        }

        Worker higherPaidJobTitle = workers[0];
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary() > higherPaidJobTitle.getAnnualSalary()) {
                higherPaidJobTitle = this.workers[index];
            }
        }

        System.out.println("El puesto con mejor salario en promedio es:");
        System.out.println(higherPaidJobTitle.toString());
    }



}
