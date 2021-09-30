public class ProfissionalDaSaude extends Pessoa{
    ProfissionalDaSaude(int idade, String nome, int matricula){
        super(idade, nome);
        setMatricula(matricula);
    }

    public void aplicar(Paciente paciente, Vacina vacina){
        System.out.printf("%s vacinado com %s", paciente.getNome(), vacina.getFabricante());
    }
    
    private int matricula;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    
}
