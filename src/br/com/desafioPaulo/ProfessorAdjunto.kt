package br.com.desafioPaulo
//PARTE D


class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int = 0,
    codigoDeProfessor: Int,
    val quantidadeDeHorasDeMonitoria: Int
)

    : Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor) {


}