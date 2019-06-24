package comvg.example.cursosandroid.micalculadora;

public class Operaciones {
    private  float num1;
    private  float num2;

    public Operaciones(){ this.setNum1(0); this.setNum2(0);}
    public Operaciones(float num1, float num2){
        this.setNum1(num1);
        this.setNum2(num2);}
    public  float suma(){return  this.getNum1() + this.getNum2();}
    public  float  resta(){return  this.getNum1() - this.getNum2();}
    public  float mult(){return  this.getNum1() * this.getNum2();}
    public  float div(){return  this.getNum1() / this.getNum2();}


    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
