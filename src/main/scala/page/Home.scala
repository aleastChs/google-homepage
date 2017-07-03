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
        `class` := HomeCSS.h1.htmlClass,
        div(
          h1("Google Homepage!")
        )
      ).render
    )
  }

  @JSExport
  def image(target: html.Div) = {
    target.appendChild(
      div(
        `class` := HomeCSS.pictureHome.htmlClass,
        div(
          img(
            `class` := HomeCSS.imgGoogle.htmlClass,
            src := "../icons/googleIcon.png",
            alt := "Google Icon"
          )
        )
      ).render
    )
  }

  @JSExport
  def footer(target: html.Div) = {
    val listLeft: List[String] = "Advertising" :: "Buisness" :: "About" :: Nil
    val listRight: List[String] = "Privacy" :: "Terms" :: "Settings" :: Nil
    // val adrMap: mutable.HashMap[String, URL] =

    target.appendChild(
      div(
        `class` := HomeCSS.footer.htmlClass,
        div(
          ul(
            `class` := HomeCSS.ulLeft.htmlClass,
            for(item <- listLeft) yield {
              li(
                `class` := HomeCSS.footerLI.htmlClass,
                item
              )
            }
          )
        ),
        div(
          ul(
            `class` := HomeCSS.ulRight.htmlClass,
            for(item <- listRight) yield {
              li(
                `class` := HomeCSS.footerLI.htmlClass,
                item)
            }
          )
        )
      ).render
    )
  }
}