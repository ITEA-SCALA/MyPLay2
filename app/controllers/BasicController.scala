package controllers

import javax.inject.Inject
import javax.inject.Singleton
import models.{BasicForm}
import play.api.mvc._

@Singleton
class BasicController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with play.api.i18n.I18nSupport {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def simpleForm() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.basicForm(BasicForm.form))
  }

  def simpleFormPost() = Action { implicit request =>
    BasicForm.form.bindFromRequest.fold(
      formWithErrors => {
        // binding failure, you retrieve the form containing errors:
        BadRequest(views.html.basicForm(formWithErrors))
      },
      formData => {
        Ok(formData.toString)
      }
    )
  }
}
