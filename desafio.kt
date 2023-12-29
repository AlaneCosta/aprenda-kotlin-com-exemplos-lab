// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

val inscritos = mutableListOf<Pair<Usuario, Nivel>>()
   
}

fun matricular(usuario: Usuario, NivelDesejado: Nivel) {
    inscritos.add(usuario to NivelDesejado)
    println("Usuário ${usuario.nome} matriculado na formação $nome")
    }
    
fun imprimirMatriculados () {
    println("Matriculados na formação $nome:") 
    inscritos.forEach { (usuario, nivel) ->
            println("Nome: ${usuario.nome}, Nivel: $nivel")
    }
    }

fun main() {
    
    val usuario1 = Usuario("Michel", 1)
    val usuario2 = Usuario("Luana", 2)
    
    val conteudo1 = ConteudoEducacional("Introdução Kotlin")
    val conteudo2 = ConteudoEducacional("Funcões mais utilizadas em Kotlin")
    
    val formacaoKotlin = Formacao("Kotlin", listOf(conteudo1, conteudo2))
    
    formacaoKotlin.matricular(usuario1, Nivel.BASICO)
    formacaoKotlin.matricular(usuario2, Nivel.INTERMEDIARIO) 
    
    formacaoKotlin.imprimirMatriculados()
  
}
