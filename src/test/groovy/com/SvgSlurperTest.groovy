package com

import groovy.xml.XmlUtil
import org.junit.Test

/**
 * Created by superman on 7/29/2016.
 */
class SvgSlurperTest {
    @Test
    void "test"() {
        //def path = "C:\\workspace\\svg\\clothing.svg"
        def path = "C:\\workspace\\svg\\different-scenarios.svg"
        File file = new File(path)
        //FileWriter fileWriter = new FileWriter(new File('C:\\workspace\\svg\\clothing-processed.svg'))
        def root = new XmlSlurper(false, false).parse(file)
        root.replaceBody(null)
        println XmlUtil.serialize(root)

        def iteratorRoot = new XmlSlurper(false, false).parse(file)
        iteratorRoot.children().each {
            root.appendNode(it);
            println XmlUtil.serialize(root)
            root.replaceBody(null)
        }
        //fileWriter.close()
    }
}
