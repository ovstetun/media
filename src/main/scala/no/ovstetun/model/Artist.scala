package no.ovstetun {
package model {

import net.liftweb.mapper._

class Artist extends LongKeyedMapper[Artist] with IdPK {
  def getSingleton = Artist

  object name extends MappedString(this, 128) {
    override def defaultValue = null
  }
  object comment extends MappedTextarea(this, 2048)
}

object Artist extends Artist with LongKeyedMetaMapper[Artist] {

}

}
}
