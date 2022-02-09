import de.m3y.kformat.Table
import de.m3y.kformat.table



fun main(){
    val uno= arrayListOf("ID","Hora","Duracion","Lunes","Martes","Miercoles","Jueves","Viernes","Porcentaje")
    val tres= listOf(1,"15:30-16:30",1.00,"SI","PRO","BBDD","BBDD","LM",0.16)
    val cuatro= listOf(2,"16:30-17:30",1.00,"SI","PRO","BBDD","BBDD","LM",0.32)

    val dos = table {
        header(uno[0], uno[1], uno[2], uno[3],uno[4],uno[5],uno[6],uno[7],uno[8])
        row(tres[0], tres[1], tres[2], tres[3],tres[4],tres[5],tres[6],tres[7],tres[8])

        hints {
            precision(uno[2], 2)
            postfix(uno[8], "%")
            precision(uno[8], 2)
            borderStyle = Table.BorderStyle(" | ", "-", "-|-")
        }
    }.render(StringBuilder())

    println(dos)
}