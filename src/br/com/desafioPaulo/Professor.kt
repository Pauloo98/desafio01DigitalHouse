package br.com.desafioPaulo
//PARTE C

open class Professor(val nome : String, val sobrenome : String, val tempoDeCasa : Int, var codigoDeProfessor : Int){
    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', tempoDeCasa=$tempoDeCasa, codigoDeProfessor=$codigoDeProfessor)"
    }

}

//Um professor será igual a outro se seus códigos de professor forem iguais.
