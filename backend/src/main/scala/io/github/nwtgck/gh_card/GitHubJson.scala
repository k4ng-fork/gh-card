package io.github.nwtgck.gh_card

import spray.json.DefaultJsonProtocol

object GitHubJson {
  case class Repository(description: Option[String], language: Option[String], stargazers_count: Int, forks_count: Int)

  // Implicit conversions
  object Protocol extends DefaultJsonProtocol {
    implicit val repositoryFormat = jsonFormat4(Repository)
  }
}
