class TesteSimples {
  public void executar(){

    Atleta atleta = new Atleta();
    atleta.setNome("Mauricio Sant'anna");
    atleta.setIdade(202);

    System.out.println("Nome = " + atleta.getNome());
    System.out.println("Idade = " + atleta.getIdade());

  }
}