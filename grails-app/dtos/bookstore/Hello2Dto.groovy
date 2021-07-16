package bookstore

import grails.validation.Validateable
import groovy.transform.ToString

@ToString(includeNames=true,includeFields=true)
class Hello2Dto implements Validateable{

  String name

}
