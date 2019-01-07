package com.sandbox

import com.sandbox.rest.RestClient
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import react.router.dom.hashRouter
import react.router.dom.switch
import kotlin.browser.window

fun RBuilder.iBButton(btnText:String, btnClasses:String = "",
                      forceScrollToTop:Boolean = true,
                      icon:String? = null,
                      preventDefault:Boolean = true,
                      _disabled:Boolean = false,
                      btnAction: () -> Unit) {
    var buttonCss = "btn"
    if(_disabled){
        buttonCss = "$buttonCss disabled"
    }

    button(classes = "$buttonCss  $btnClasses") {
        if(icon != null){
            span (classes = "$icon buttonIcon"){}
        }
        +btnText
        attrs {
            onClickFunction = { e: Event ->
                if(!_disabled){
                    btnAction.invoke()
                    if(forceScrollToTop){
                        window.scrollTo(0.0,0.0)
                    }
                }
                if(preventDefault){
                    e.preventDefault()
                }
            }
        }
    }
}

class App : RComponent<RProps, RState>() {

    override fun componentDidMount() {
        RestClient().findAllPerson()
    }


    override fun RBuilder.render() {
        div {
            h1{
                +"Hello World"
            }
            iBButton(btnText = "update",btnClasses = "btn"){
                console.log(Store.personList.first())
                RestClient().updatePerson(Store.personList.first())
            }
        }
    }
}
fun RBuilder.app() = child(App::class) {}