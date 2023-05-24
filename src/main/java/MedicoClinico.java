public class MedicoClinico implements Medico {
    public float calcular(float salario, float cargaHoraria) {
        if (cargaHoraria >= 5) {
            return (salario * cargaHoraria) + 25000;
        }
        else {
            throw new IllegalArgumentException("Salario normal para especialidade: Cirurgia");
        }
    }
}
