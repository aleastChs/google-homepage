/**
  * Created by alexa on 29/06/2017.
  */

package page

import scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import dom.html
import page.portfolio.HomeCSS

import scalatags.JsDom
import JsDom.all._

@JSExport
object Home extends {
  @JSExport
  def main(target: html.Div) = {
    target.appendChild(
      div(
        div(
          `class` := HomeCSS.h1.htmlClass,
          h1("Google Homepage!")
        )
      ).render
    )
  }
}