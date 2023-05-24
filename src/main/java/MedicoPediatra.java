public class MedicoPediatra implements Medico{
    public float calcular(float salario, float cargaHoraria) {
        if (cargaHoraria >= 0) {
            return (salario * cargaHoraria) + 15000;
        }
        else {
            throw new IllegalArgumentException("Salario normal para especialidade: Pediatria");
        }
    }
}
