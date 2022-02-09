import de.m3y.kformat.Table
import de.m3y.kformat.table



fun main(){
    val uno= listOf("ID",1,2,3,4,5,6,7)
    val tres= listOf("Hora","15:30-16:30","16:30-17:30","17:30-18:30","18:30-18:45","18:45-19:45","19:45-20:45","20:45-21:45")
    val cuatro= listOf("Duracion",1.0f,1.0f,1.0f,0.15f,1.0f,1.0f,1.0f)
    val cinco= listOf("Lunes","BD","BD","FOL","R","PROG","PROG","PROG")
    val seis = listOf("Martes","EDES","EDES","SSII","E","SSII","LM","LM")
    val siete = listOf("Miercoles","BD","BD","EDES","C","PROG","PROG","PROG")
    val ocho = listOf("Jueves","SSII","SSII","FOL","R","FOL","LM","LM")
    val nueve = listOf("Viernes","BD","BD","PROG","EO","PROG","SSII","SSII")
    val diez = listOf("Porcentaje",0.16,0.32,0.40,0.48,0.56,0.64,0.72)

    val dos = table {
        header(uno[0] as String, tres[0], cuatro[0] as String, cinco[0],seis[0],siete[0],ocho[0],nueve[0],diez[0] as String)
        for (i in 1..uno.size-1){
            row(uno[i],tres[i],cuatro[i] as Float,cinco[i],seis[i],siete[i],ocho[i],nueve[i],diez[i] as Double)
        }

        hints {
            precision(cuatro[0] as String,2)
            precision(diez[0]as String, 2)
            postfix(diez[0] as String, "%")
            borderStyle = Table.BorderStyle(" | ", "-", "-|-")
        }
    }.render(StringBuilder())

    println(dos)
}