package com.danielasfregola.twitter4s.http.clients.friendships.parameters

import com.danielasfregola.twitter4s.http.marshalling.Parameters

case class UnfollowParameters(user_id: Option[Long], screen_name: Option[String]) extends Parameters