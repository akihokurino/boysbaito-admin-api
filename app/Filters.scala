import javax.inject._

import play.api._
import play.api.http.HttpFilters
import play.api.mvc.EssentialFilter

@Singleton
class Filters @Inject() (env: Environment) extends HttpFilters {
  override val filters: Seq[EssentialFilter] = if (env.mode == Mode.Dev) Seq() else Seq.empty
}
