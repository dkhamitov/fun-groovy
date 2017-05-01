package d.kh.groovy

/**
 * Created by khamitovdm on 16/12/2016.
 */
class GStringVsString {
    static void main(String[] args) {
        def sKey = "a"
        def gKey = "${sKey}"

        def map1 = [:]
        map1[sKey] = "A"
        map1[gKey] = "A"

        assert map1.size() == 1
        println map1

        def map2 = [(sKey): "A", (gKey): "A"]

        assert map2.size() == 2
        println map2

        assert map1 != map2
    }
}
