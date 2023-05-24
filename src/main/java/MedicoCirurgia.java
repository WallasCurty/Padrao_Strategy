public class MedicoCirurgia implements Medico {
    public float calcular(float salario, float cargaHoraria) {
        if (cargaHoraria <= 5) {
            throw new IllegalArgumentException("Salario normal para especialidade: Cirurgia");
        }
        else {
            return salario * (cargaHoraria + 8);
        }
    }
}
