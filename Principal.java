public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(43, "Joao");
        Vacina vac = new Vacina("vacina covid-19", "Pfizer", 53);
        ProfissionalDaSaude profSaude = new ProfissionalDaSaude(27, "Maria", 11223344);
        
        profSaude.aplicar(paciente, vac);
    }
}
