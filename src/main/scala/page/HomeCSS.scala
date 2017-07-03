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
    backgroundColor.rgb(200,200,200),
    color.rgb(0,0,0),
    margin(0 px, 0 px, 0 px, 0 px)
  )

  val footer = style(
    position.absolute,
    left(0 px),
    right(0 px),
    bottom(0 px),
    height(24 px),
    fontSize( 8 px),
    listStyleType := "none",
    backgroundColor.rgb(242,242,242),
    color.rgb(110,110,110)
  )

  val ulLeft = style(
    marginTop(8 px),
    marginLeft(17 px),
    float.left
  )

  val ulRight = style(
    marginTop(8 px),
    marginRight(17 px),
    float.right
  )

  val footerLI = style(
    margin(0 px, 8 px, 0 px, 8 px),
    display.inline
  )

  val imgGoogle = style(
    display.block,
    margin.auto,
    width :=! "15%"
  )

  val pictureHome = style(
    width(100 vw),
    position.absolute,
    marginTop(100 px)
  )

  this.addToDocument()
}

