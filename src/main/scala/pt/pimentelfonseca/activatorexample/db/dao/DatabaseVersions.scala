package pt.pimentelfonseca.activatorexample.db.dao

import scala.slick.driver.SQLiteDriver.simple._

import pt.pimentelfonseca.activatorexample.db.tables.TableDatabaseVersions

class DatabaseVersions(tag: Tag) extends TableDatabaseVersions(tag) {

  // Extra DAO logic here.
}
