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
        this.higherPaidDepartment();
        this.departmentCounter();
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

    public void departmentCounter(){

        for (Worker department : workers)
            System.out.println(department.getDepartment());
    }
}
