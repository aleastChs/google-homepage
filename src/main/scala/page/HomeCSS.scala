/**
  * Created by alexa on 29/06/2017.
  */
package page

/**
  * Created by alexa on 20/06/2017.
  */

package portfolio

import scalacss.Defaults._

object HomeCSS extends StyleSheet.Inline {
  import dsl._

  val h1 = style (
    textAlign.center,
    backgroundColor.rgb(255,250,250),
    color.rgb(0,0,0),
    margin(0 px, 0 px, 0 px, 0 px)
  )

  this.addToDocument()
}

