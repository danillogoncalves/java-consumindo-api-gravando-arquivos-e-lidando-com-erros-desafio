package model;

public class Address {

    private String cep;

    private String logradouro;

    private String bairro;

    private String localidade;

    private String uf;

    private String ibge;

    private String gia;

    private String ddd;

    private String siafi;

    private Long numero;

    public String getCep() {
        return cep;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "CEP = " + cep + ";\n" +
                "Logradouro = " + logradouro + ";\n" +
                "Bairro = " + bairro + ";\n" +
                "Localidade = " + localidade + ";\n" +
                "UF = " + uf + ";\n" +
                "IBGE= " + ibge + ";\n" +
                "GIA= " + gia + ";\n" +
                "DDD= " + ddd + ";\n" +
                "SIAFI = " + siafi + ";\n" +
                "Número = " + numero + ";";
    }
}
