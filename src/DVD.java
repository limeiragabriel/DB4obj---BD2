public class DVD extends Midia{
    private String diretor;
    private String produtor;

    public DVD(String diretor, String produtor, String cod, String titulo, int ano) {
        super(cod, titulo, ano);
        this.diretor = diretor;
        this.produtor = produtor;
    }
    
    public DVD() {
        
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return "Cod: "+ super.getCod() + " DVD{" + "diretor=" + diretor + ", produtor=" + produtor + '}';
    }

}
