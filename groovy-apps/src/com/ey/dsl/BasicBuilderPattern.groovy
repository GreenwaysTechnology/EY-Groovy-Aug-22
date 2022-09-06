import com.ey.dsl.TalkBuilder

def talk(topic) {
    def talkBuilder = new TalkBuilder(topic: topic)
    talkBuilder //return talk builder
}
talk('DSL').at('EY').on('Sep 06')
talk 'Groovy DSL' at 'EY' on 'Sep 06'