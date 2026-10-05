package org.jeux

class Guerrier(
    equipemet: Array<Equipemet>,
    competences: Array<Competences>,
    statistiques: Int,
    niveau: Int
): PersonnageModelPrototype(equipemet, competences, statistiques, niveau) {



    override fun clone(): Guerrier{

        return Guerrier(this.equipement,this.competences,this.statistiques,this.niveau)
    }

}


class Mage(
    equipemet: Array<Equipemet>,
    competences: Array<Competences>,
    statistiques: Int,
    niveau: Int
): PersonnageModelPrototype(equipemet, competences, statistiques, niveau) {
    override fun clone(): Mage = Mage(this.equipement,this.competences,this.statistiques,this.niveau)
}



class Archer(
    equipemet: Array<Equipemet>,
    competences: Array<Competences>,
    statistiques: Int,
    niveau: Int
): PersonnageModelPrototype(equipemet, competences, statistiques, niveau) {
    override fun clone(): Mage = Mage(this.equipement,this.competences,this.statistiques,this.niveau)
}


class Paladin(
    equipemet: Array<Equipemet>,
    competences: Array<Competences>,
    statistiques: Int,
    niveau: Int
): PersonnageModelPrototype(equipemet, competences, statistiques, niveau) {



    override fun clone(): Mage = Mage(this.equipement,this.competences,this.statistiques,this.niveau)
}


class Assasin(
    equipemet: Array<Equipemet>,
    competences: Array<Competences>,
    statistiques: Int,
    niveau: Int
): PersonnageModelPrototype(equipemet, competences, statistiques, niveau) {
    override fun clone(): Mage = Mage(this.equipement,this.competences,this.statistiques,this.niveau)
}




