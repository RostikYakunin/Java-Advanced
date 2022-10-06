package task2;

import java.lang.reflect.Method;

/**
 * @author Rostislav Yakunin
 */
public class Main {

/**
 * Method for addition
*/
    @MyAnnotation(
            value1 = 10,
            value2 = 30)
    public void sum (int value1, int value2){
        System.out.println("Sum = " + (value1 + value2));
    }
    /**
     * Method for subtraction
     */
    @MyAnnotation (
            value1 = 25,
            value2 = 28
    )
    public void sub (int value1, int value2){
        System.out.println("Sub = " + (value1 - value2));
    }


/**
 * Method for multiplication
 */
    @MyAnnotation (
            value1 = 5,
            value2 = 27
    )
    public void mul (int value1, int value2){
        System.out.println("Mul = " + (value1 * value2));
    }


    /**
     * Method for division
     */
    @MyAnnotation (
            value1 = 90,
            value2 = 3
    )
    public void div (int value1, int value2){
        if (value2!=0) {
            System.out.println("Div = " + (value1 / value2));
        } else {
            System.err.println("Division by zero !");
        }
    }

    /**
     * Main method
     */

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException {
        Main main = new Main();

        Method[] m = main.getClass().getMethods();
        for (Method meth : m ) {

            switch (meth.getName()) {
                case "sum": {
                    MyAnnotation myAnnotation = meth.getAnnotation(MyAnnotation.class);
                    main.sum(myAnnotation.value1(), myAnnotation.value2());
                    break;
                }
                case "sub": {
                    MyAnnotation myAnnotation = meth.getAnnotation(MyAnnotation.class);
                    main.sub(myAnnotation.value1(), myAnnotation.value2());
                    break;
                }
                case "mul": {
                    MyAnnotation myAnnotation = meth.getAnnotation(MyAnnotation.class);
                    main.mul(myAnnotation.value1(), myAnnotation.value2());
                    break;
                }
                case "div": {
                    MyAnnotation myAnnotation = meth.getAnnotation(MyAnnotation.class);
                    main.div(myAnnotation.value1(), myAnnotation.value2());
                    break;
                }
            }
        }
    }
}
