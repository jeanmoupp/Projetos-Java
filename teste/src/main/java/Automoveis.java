


class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Carro se movendo na estrada...");
    }
}

class Aviao extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Avião voando no céu...");
    }
}

public class Automoveis {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Aviao meuAviao = new Aviao();

        meuCarro.mover();
        meuAviao.mover();
    }
}