package com

/**
 * Created by superman on 7/29/2016.
 */
class SvgSlurper {
    static void main(String[] args) {
        println "Slurping SVG..."
        println "File = ${args[0]}"
        def xml = new XmlSlurper().parse(new File(args[0]))
        println xml
        xml.children().each {
            println it.text()
        }
    }

    void slurp(File file) {
        def xml = new XmlSlurper().parse(file)
        println xml
        xml.children().each {
            println it.text()
        }
    }
}
