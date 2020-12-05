package br.com.desafioPaulo


//PARTE G - I

class DigitalHouseManager() {


    var listaDeAlunos = mutableMapOf<Any?, Aluno>()
    var listaDeProfessoresTitular = mutableMapOf<Any?, ProfessorTitular>()
    var listaDeProfessoresAdjunto = mutableMapOf<Any?, ProfessorAdjunto>()
    var listaDeCurso = mutableMapOf<Any?, Curso>()
    var listaDeMatricula = mutableMapOf<Any?, Matricula>()


    // 1 - TESTADO
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listaDeCurso.put(
            codigoCurso, Curso(
                nome = nome,
                codigoDoCurso = codigoCurso,
                quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos
            )
        )
    }

    // 2 - TESTADO
    fun excluirCurso(codigoCurso: Int) {
        listaDeCurso.remove(codigoCurso)
    }

    // 3 - TESTADO
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaDeProfessoresAdjunto.put(
            codigoProfessor,
            ProfessorAdjunto(
                nome = nome,
                sobrenome = sobrenome,
                codigoDeProfessor = codigoProfessor,
                quantidadeDeHorasDeMonitoria = quantidadeDeHoras
            )
        )
    }

    // 4 - TESTADO
    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listaDeProfessoresTitular.put(
            codigoProfessor,
            ProfessorTitular(
                nome = nome,
                sobrenome = sobrenome,
                codigoDeProfessor = codigoProfessor,
                especialidade = especialidade
            )
        )
    }

    // 5 - TESTADO
    fun excluirProfessor(codigoProfessor: Int) {
        listaDeProfessoresTitular.remove(codigoProfessor)
        listaDeProfessoresAdjunto.remove(codigoProfessor)
    }

    // 6 - TESTADO
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        listaDeAlunos.put(
            codigoAluno,
            Aluno(nome = nome, sobrenome = sobrenome, codigoDeAluno = codigoAluno)
        )
    }

    // 7 - TESTADO
    fun matricularAlunonoCurso(codigoAluno: Int, codigoCurso: Int) {
        var alunoASerMatriculado = listaDeAlunos[codigoAluno]
        if (listaDeCurso[codigoCurso]?.listaDeAlunosMatriculados!!.size >= listaDeCurso[codigoCurso]?.quantidadeMaximaDeAlunos!!) {
            println("Não foi possível matricular o/a ${listaDeAlunos[codigoAluno]?.nome} no curso, ele já está cheio ='[, cabem ${listaDeCurso[codigoCurso]?.quantidadeMaximaDeAlunos}")
        } else {
            listaDeCurso[codigoCurso]?.adicionarUmAluno(alunoASerMatriculado!!)
            println("Matrícula realizada com sucesso, do aluno: ${listaDeAlunos[codigoAluno]?.nome}")
        }
    }

    // 8 - TESTADO
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var professorTitular : ProfessorTitular? = listaDeProfessoresTitular[codigoProfessorTitular]
        var professorAdjunto : ProfessorAdjunto? = listaDeProfessoresAdjunto[codigoProfessorAdjunto]
        listaDeCurso[codigoCurso]?.professorTitular = professorTitular
        listaDeCurso[codigoCurso]?.professorAdjunto = professorAdjunto


    }

}