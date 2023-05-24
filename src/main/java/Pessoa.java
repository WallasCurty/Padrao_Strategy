public class Pessoa {
    private float salarioTotal;

    public float getSalarioTotal() {
        return salarioTotal;
    }

    public void salarioClinico(float salario, float cargaHoraria) {
        CalculoSalario calculoSalario = new CalculoSalario(salario, cargaHoraria);
        this.salarioTotal = calculoSalario.calcular(new MedicoClinico());
    }

    public void salarioPediatra(float salario, float cargaHoraria) {
        CalculoSalario calculoSalario = new CalculoSalario(salario, cargaHoraria);
        this.salarioTotal = calculoSalario.calcular(new MedicoPediatra());
    }

    public void salarioCirugia(float salario, float cargaHoraria) {
        CalculoSalario calculoSalario = new CalculoSalario(salario, cargaHoraria);
        this.salarioTotal = calculoSalario.calcular(new MedicoCirurgia());
    }



}
