public class Pessoa {
    private float saldo;

    public void somaSaldo(float valor) {
        this.saldo +=valor;
    }
    public float pegaSaldo() {
        return this.saldo;
    }
}
