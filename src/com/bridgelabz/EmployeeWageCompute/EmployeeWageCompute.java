package com.bridgelabz.EmployeeWageCompute;

public class EmployeeWageCompute {
        public static final int isPartTime = 1;
        public static final int isFullTime = 2;
        public static final int empRatePerHour = 20;
        public static final int maxHrsInMonth = 100;
        public static final int numOfWorkingDays = 20;

        public static int computeEmpWage() {

            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;

            while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {

                totalWorkingDays++;
                int empCheck = (int) Math.floor((Math.random() * 10) % 3);

                switch(empCheck) {

                    case isPartTime: empHrs = 4;
                        break;

                    case isFullTime: empHrs = 8;
                        break;

                    default: empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Days :" +totalWorkingDays + " Emp Hrs :" +totalEmpHrs);
            }
            int totalEmpWage = totalEmpHrs * empRatePerHour;
            System.out.println("\nTotal Emp Wage = " +totalEmpWage);
            return totalEmpWage;
        }

        public static void main(String[] args) {
            computeEmpWage();
        }
}