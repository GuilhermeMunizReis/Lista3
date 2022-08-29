public class Jardim {

    public String nomeDono;
    public String contato;
    public String endereco;

    Arvore[] arvores = new Arvore[10];

    public Jardim(String nome, String cont, String end){
        this.nomeDono = nome;
        this.contato = cont;
        this.endereco = end;
    }

    public void addArvore(Arvore arvore){
        boolean full = true;        // Se o vetor estiver cheio, deverá aparecer uma mensagem avisando
        for (int i = 0; i < arvores.length; i++) {
            if (arvores[i] == null) {
                arvores[i] = arvore;
                full = false;
                break;
            }
        }

        if(full == true)
            System.out.println("O jardim esta cheio");
    }

    public void replantar() {
        for (Arvore a : arvores) {
            if (a != null) {
                if(a.diametro >= 3 && a.altura >= 0.50)
                    System.out.println(a.especie + " esta pronta para ser replantada");
            }
        }
    }
    public void precoMedio(){
        float media = 0;

        for (Arvore a: arvores) {
            if(a != null)
                media += a.preco;
        }
        System.out.println("Media de Precos: " + (int)media);
    }

    public void mostraInfo(){
        System.out.println("Dono: " + this.nomeDono);
        System.out.println("Contato: " + this.contato + "\t\tEndereco: " + this.endereco);
        for (Arvore a: arvores) {
            if(a != null)
            {
                System.out.println(a.especie);
                System.out.format("Altura: %.2f\t\tDiametro: %.2f\t\tPreco: %.2f", a.altura, a.diametro, a.preco);
            }
        }
    }

}
