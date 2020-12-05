package br.com.desafioPaulo
//PARTE B - E - H
//Um curso será igual a outro se seus códigos de curso forem iguais.

class Curso(
    val nome: String,
    val codigoDoCurso: Int,
    val quantidadeMaximaDeAlunos: Int,
    var professorTitular: ProfessorTitular? = ProfessorTitular("", "", 0, 0,""),
    var professorAdjunto: ProfessorAdjunto? = ProfessorAdjunto("", "", 0, 0, 0)
) {


    val listaDeAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaDeAlunosMatriculados.size < quantidadeMaximaDeAlunos) {
            listaDeAlunosMatriculados.add(umAluno)
            return true
        } else return false
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeAlunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoDoCurso=$codigoDoCurso, quantidadeMaximaDeAlunos=$quantidadeMaximaDeAlunos, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, listaDeAlunosMatriculados=$listaDeAlunosMatriculados)"
    }


}

