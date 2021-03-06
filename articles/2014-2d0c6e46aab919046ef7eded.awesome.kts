
import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LinkType.*
import link.kotlin.scripts.dsl.LanguageCodes.*
import java.time.LocalDate

// language=Markdown
val body = """

[Kotlin vs Java puzzlers - Svetlana Isakova](https://vimeo.com/105758307)

"""

Article(
  title = "Kotlin vs Java puzzlers",
  url = "https://vimeo.com/105758307",
  categories = listOf(
    "Kotlin"
  ),
  type = video,
  lang = EN,
  author = "Svetlana Isakova",
  date = LocalDate.of(2014, 9, 10),
  body = body
)
