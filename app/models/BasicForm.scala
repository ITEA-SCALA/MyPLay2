package models

import play.api.data.Form
import play.api.data.Forms._

case class BasicForm(name: String, age: Int)

object BasicForm {
  val form: Form[BasicForm] = Form(
    mapping(
      "name" -> text,
      "age" -> number
    )(BasicForm.apply)(BasicForm.unapply)
  )
}
