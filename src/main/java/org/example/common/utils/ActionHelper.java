package org.example.common.utils;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class ActionHelper {

    // <editor-fold desc="Drag and Drop">

    public static void dragAndDropElement(SelenideElement source, SelenideElement target) {
        source.dragAndDrop(to(target));
    }

    public static void dragAndDropElementOld(SelenideElement source, SelenideElement target) {
        actions().dragAndDrop(source, target);
    }

    public static void dragAndDropElementMoveToElement(SelenideElement source, SelenideElement target) {
        actions()
                .moveToElement(source)
                .clickAndHold()
                .moveToElement(target)
                .release()
                .perform();
    }

    public static void dragAndDropElementMoveByOffset(SelenideElement source,int x, int y) {
        actions()
                .moveToElement(source)
                .moveByOffset(x, y)
                .release()
                .perform();
    }

    public static  void dragAndDropByJSHtml5(SelenideElement source, SelenideElement target) {
        String js =
                "var src = arguments[0], tgt = arguments[1];" +
                        "function createDataTransfer(){ try { return new DataTransfer(); } catch(e) {" +
                        "  return { data:{}, setData:function(k,v){this.data[k]=v;}, getData:function(k){return this.data[k];} };" +
                        "}}" +
                        "var dt = createDataTransfer();" +
                        "function fire(el, type){ " +
                        "  var event; " +
                        "  try { event = new DragEvent(type, {bubbles:true, cancelable:true, dataTransfer: dt}); } " +
                        "  catch(e){ event = document.createEvent('CustomEvent'); event.initCustomEvent(type, true, true, null); event.dataTransfer = dt; }" +
                        "  el.dispatchEvent(event);" +
                        "}" +
                        "src.scrollIntoView({block:'center'});" +
                        "tgt.scrollIntoView({block:'center'});" +
                        "fire(src, 'dragstart');" +
                        "fire(tgt, 'dragenter');" +
                        "fire(tgt, 'dragover');" +
                        "fire(tgt, 'drop');" +
                        "fire(src, 'dragend');";

        executeJavaScript(js, source, target);
    }

    public static  void dragAndDropByJSMouse(SelenideElement source, SelenideElement target) {
        String js =
                "var src = arguments[0], tgt = arguments[1];" +
                        "function createDataTransfer(){ try { return new DataTransfer(); } catch(e) {" +
                        "  return { data:{}, setData:function(k,v){this.data[k]=v;}, getData:function(k){return this.data[k];} };" +
                        "}}" +
                        "var dt = createDataTransfer();" +
                        "function fire(el, type){ " +
                        "  var event; " +
                        "  try { event = new DragEvent(type, {bubbles:true, cancelable:true, dataTransfer: dt}); } " +
                        "  catch(e){ event = document.createEvent('CustomEvent'); event.initCustomEvent(type, true, true, null); event.dataTransfer = dt; }" +
                        "  el.dispatchEvent(event);" +
                        "}" +
                        "src.scrollIntoView({block:'center'});" +
                        "tgt.scrollIntoView({block:'center'});" +
                        "fire(src, 'dragstart');" +
                        "fire(tgt, 'dragenter');" +
                        "fire(tgt, 'dragover');" +
                        "fire(tgt, 'drop');" +
                        "fire(src, 'dragend');";

        executeJavaScript(js, source, target);
    }

    // </editor-fold>

    // <editor-fold desc="Clicks">

    public static void clickAndHold(SelenideElement element, long duration) {
        actions()
                .moveToElement(element)
                .clickAndHold()
                .pause(Duration.ofMillis(duration))
                .release()
                .perform();
    }

    public static void clickAndHoldWithoutRelease(SelenideElement element) {
        actions()
                .moveToElement(element)
                .clickAndHold()
                .perform();
    }

    // </editor-fold>
}
