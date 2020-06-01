/*
 * 
 * Version 1.0
 * 
 */

/**
 *
 * @author Alberto
 */
public class Calculadora {
    
    public void Calculadora(){
        
    }
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    public int divide(int num1,int num2){
        if(num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR 0");
        return num1/num2;
    }
    
    public int potencia(int base,int exponente){
        return (int)Math.pow(base,exponente);
    }
}
