package br.com.desafioPaulo

fun main() {

    val controle = DigitalHouseManager()

    // CURSOS
    controle.registrarCurso("Full Stack", 20001,3)
    controle.registrarCurso("Android", 20002,2)
    controle.registrarCurso("Curso C", 3,50)

            // EXCLUIR CURSO
    controle.excluirCurso(3)


    // PROFESSOR TITULAR
    controle.registrarProfessorTitular("João", "Nogueira", 1, "Datilografia")
    controle.registrarProfessorTitular("Oswaldo", "Junqueira", 2, "Física")

            // EXCLUIR PROFESSOR
    controle.excluirProfessor(2)

    // PROFESSOR ADJUNTO
    controle.registrarProfessorAdjunto("Maria", "Santos", 55, 2)
    controle.registrarProfessorAdjunto("Rita", "Cassia", 55, 2)
    controle.registrarProfessorAdjunto("Joaquina", "Robéria", 22, 2)
    controle.registrarProfessorAdjunto("Pedro", "Matheus", 33, 2)

            // EXCLUIR PROFESSOR

    controle.excluirProfessor(33)

    // MATRICULAR ALUNO
    controle.matricularAluno("Silvia", "Regina",18)
    controle.matricularAluno("Mario", "José",33)
    controle.matricularAluno("Abigail", "Moises",2)
    controle.matricularAluno("Igor", "Moireles",45)
    controle.matricularAluno("Fernanda", "Fernandes",66)

    // MATRICULAR ALUNO NO CURSO
    controle.matricularAlunonoCurso(18,20001)
    controle.matricularAlunonoCurso(33,20001)
    controle.matricularAlunonoCurso(2,20002)
    controle.matricularAlunonoCurso(45,20002)
    controle.matricularAlunonoCurso(66,20002)

    // ALOCAR PROFESSOR NO CURSO
    controle.alocarProfessores(20001,1,55)
    controle.alocarProfessores(20002,2,22)




//        println(controle.listaDeCurso[20002])
//        println(controle.listaDeProfessoresTitular)
//        println(controle.listaDeProfessoresAdjunto)
//        println(controle.listaDeAlunos)
//        println(controle.listaDeCurso)
//        println(controle.listaDeCurso[1])
//        println(controle.listaDeCurso[1]?.listaDeAlunosMatriculados)
//        println("________________")
//        println(controle)

}