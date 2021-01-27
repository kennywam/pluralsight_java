package com.kennywambu.lessons;


public class Main {

    public static void main(String[] args) {
	// write your code here
        performCalculation();
    }

    static void performCalculation() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d,50.0d);
        equations[1] = new MathEquation('a',25.0d,92.0d);
        equations[2] = new MathEquation('s',225.0d,17.0d);
        equations[3] = new MathEquation('m',11.0d,3.0d);

        for(MathEquation equation : equations){

            equation.execute();
            System.out.println("result = " +equation.result);
        }

        System.out.println("Average result = "+ MathEquation.getAverageResults() );

        System.out.println();
        System.out.println("using execute overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("overloaded result with double: "+ equationOverload.getResult());
    }
}
