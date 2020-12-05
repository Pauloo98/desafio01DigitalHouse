package br.com.desafioPaulo

class ProfessorTitular(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int = 0,
    codigoDeProfessor: Int,
    val especialidade: String
)

    : Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor) {


}