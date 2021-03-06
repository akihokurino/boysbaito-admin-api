import com.google.inject.AbstractModule
import java.time.Clock

class Module extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[Clock]).toInstance(Clock.systemDefaultZone)
    bind(classOf[Initialize]).asEagerSingleton()
  }
}