package d.kh.groovy.spock

import org.codehaus.groovy.transform.GroovyASTTransformationClass
import org.spockframework.compiler.SpockTransform

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@GroovyASTTransformationClass(classes = SpockTransform)
@interface SpockMagic {

}
