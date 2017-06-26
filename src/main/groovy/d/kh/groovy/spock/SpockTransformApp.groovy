package d.kh.groovy.spock

import groovy.transform.CompileStatic
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.spockframework.compiler.SpockTransform
import org.spockframework.util.inspector.AstInspector

/**
 * Created by khamitovdm on 18/06/2017.
 */
@CompileStatic
class SpockTransformApp {
    static void main(String[] args) {
        def source = '''\
            |import spock.lang.Specification
            |
            |class TestSpec extends Specification {
            |  def '1 equals 1'() {
            |    expect:
            |    1 == 1
            |  }
            |}
            |
            |'''.stripMargin()

        def inspector = new AstInspector(compilePhase: CompilePhase.SEMANTIC_ANALYSIS)
        inspector.load(source)

        def transform = new SpockTransform()
        transform.visit([inspector.module] as ASTNode[], SourceUnit.create('TestSpec', source))
    }
}
