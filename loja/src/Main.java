public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Farinha de Trigo",
                "Nitta",
                6.50,
                180.0,
                100.0,
                70.0,
                1000.0
        );
        produto1.setEstoque(120);
        produto1.exibir();

        System.out.println("-".repeat(80));

        Produto produto2 = new Produto(
                "Vinho Tinto",
                "Periquita",
                42.0,
                250.0,
                90.0,
                90.0,
                1300.0
        );
        produto2.setImportado(true);
        //produto2.setEstoque(30);
        produto2.exibir();

        System.out.println("-".repeat(80));

        Eletronico e1 = new Eletronico(
                "Rádio relógio",
                "Sony",
                62.90,
                100.0,
                180.0,
                140.0,
                350.0,
                0.05
        );
        e1.setImportado(true);
        e1.setVoltagem(0); // Bivolt
        e1.exibir();
        System.out.println("Consumo em 24h: R$ %.2f".formatted(e1.calcularCustoEnergia(24, 0.5)));

        System.out.println("-".repeat(80));

        Notebook n1 = new Notebook(
                "Notebook gamer",                   // descrição
                "Alienware",                        // marca
                6000.0,                             // preço base
                25.0,                               // altura
                320.0,                              // largura
                210.0,                              // profundidade
                900.0,                              // peso
                5.5,                                // consumo em watts
                "Intel Core i9 13ª geração",        //
                32,                                 // memória RAM em GB
                2048                                // armazenamento em GB
        );

        n1.setTipoPlacaVideo("dedicada");
        n1.exibir();

    }
}