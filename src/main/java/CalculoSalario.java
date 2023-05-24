public class CalculoSalario {
    private float salario;
    private float cargaHoraria;

    public CalculoSalario(float salario, float cargaHoraria) {
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public float calcular(Medico medico) {
        return medico.calcular(salario, cargaHoraria);
    }
}
