package bookstore


import grails.rest.*
import grails.converters.*
import bookstore.Hello2Dto

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class Hello2Controller {
	static responseFormats = ['json', 'xml']

    static allowedMethods = [save:'POST',update:'PUT']
	
    def index() { 
      respond ("Hello2",status:202)
    }

    def save(Hello2Dto dto){
      println dto.name
      println params
      respond( dto, status:200 )
    }

    def update(Hello2Dto dto){
      println params
      respond( dto,status:201)
    }

    @Secured(['ROLE_ADMIN','ROLE_USER'])
    def evelyn(){
      respond( [var1:"this is my name",var2:[1,2,3]] , status:200)
    }

}
