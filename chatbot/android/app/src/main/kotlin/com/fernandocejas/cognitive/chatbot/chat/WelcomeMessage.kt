package com.fernandocejas.cognitive.chatbot.chat

import com.fernandocejas.cognitive.chatbot.chat.WelcomeMessage.Params
import com.fernandocejas.cognitive.chatbot.framework.UseCase
import com.fernandocejas.cognitive.chatbot.util.DateTime
import javax.inject.Inject

class WelcomeMessage
@Inject constructor() : UseCase<Message, Params>() {

    override suspend fun build(params: Params) = Message(params.text, DateTime.now())

    data class Params(val text: String)
}