package bookstore


import grails.rest.*
import grails.converters.*

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_USER')
class HelloController extends RestfulController {
    static responseFormats = ['json', 'xml']
    HelloController() {
        super(Hello)
    }
}
