class FazerFolha2 {
    public static void main(String args[]){
        EmpregadoPeriodoIntegral piEmpregado = new EmpregadoPeriodoIntegral();
        piEmpregado.setNome("Barry Burd");
        piEmpregado.setCargo("CEO");
        piEmpregado.setSalarioSemanal(5000.00);
        piEmpregado.setDeducaoBeneficios(500.00);
        piEmpregado.preencherCheque(piEmpregado.calcValorPagamento());

        EmpregadoMeioPeriodo mpEmpregado = new EmpregadoMeioPeriodo();
        mpEmpregado.setNome("Chris Apelian");
        mpEmpregado.setCargo("Autor de Livros de Computação");
        mpEmpregado.setTaxaHora(7.53);
        mpEmpregado.preencherCheque(mpEmpregado.calcValorPagamento(53));

        MeioPeriodoHorasEmDobro mpdEmpregado =  new MeioPeriodoHorasEmDobro();
        mpdEmpregado.setNome("Steve Surace");
        mpdEmpregado.setCargo("Motorista");
        mpdEmpregado.setTaxaHora(7.53);
        mpdEmpregado.preencherCheque(mpdEmpregado.calcValorPagamento(50));
    }
}
