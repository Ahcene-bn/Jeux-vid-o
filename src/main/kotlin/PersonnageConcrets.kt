package org.jeux

 abstract class PersonnageModelPrototype(
    // le constructeur normal : va être utilisé pour créer un model initial
     protected val equipement: Array<Equipemet>,
     protected val competences: Array<Competences>,
     protected var statistiques: Int,
     protected val niveau: Int=50
):Personnage