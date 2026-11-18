package crearClases;

public class Contador {
 int value;
 String model;
 int maxValue;
 
 public Contador(int maxValue, String model) {
	 this.value = 0;
	 this.model = model;
	 this.maxValue = maxValue < 10? 10 : maxValue;
 }
 public Contador(int maxValue) {
	 this(maxValue, "N-COUNTER");
 }
 public Contador() {
	 this(100_000, "N-COUNTER");
 }
 public Contador(Contador otro) {
	 this(otro.maxValue, otro.model);
	 this.value = otro.value;
 }
 
 
 
 
 
 
 
}
