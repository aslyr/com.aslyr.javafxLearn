package sample

import javafx.application.Application
import javafx.application.Platform
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.event.EventTarget
import javafx.scene.Group
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.stage.Screen
import javafx.stage.Stage
import javafx.stage.StageStyle
import jdk.internal.org.objectweb.asm.Handle
import java.util.*

/**
 *@author:aslyr
 *@date:create in 22:00 2019/9/25 2019
 */
class Page1:Application()  {
    override fun start(primaryStage: Stage?) {
        primaryStage?.let {
            it.title="gaokai"
//            it.heightProperty().addListener({
//                out,oldvalue,newvalue->
//                println(newvalue)
//            })

            it.show()
            var b1= Button("btn1")
            b1.layoutX=12.0
            b1.layoutY=24.0
            b1.let {
                it.prefHeight=50.0
                it.prefWidth=100.0
            }
            var g1=Group()
            var  b2=Button("btn2")
            g1.children.addAll(b1,b2 )
            g1.autosize()
            it.scene= Scene(g1)
            b1.onAction=EventHandler<ActionEvent>(){
                it->
                it as ActionEvent
                println("nihao ${it.source}")
            }



//            it.xProperty().addListener(ChangeListener<Number?> { observableValue: ObservableValue<out Number?>, number: Number?, number1: Number? ->
//                println("第一个参数$observableValue,第二个参数$number,第三个参数$number1")
//
//            })
            println(Screen.getPrimary().dpi)
        }
    }



    companion object{
        var stage1=Stage()
    }

}



fun main(){
    Application.launch(Page1::class.java)
}