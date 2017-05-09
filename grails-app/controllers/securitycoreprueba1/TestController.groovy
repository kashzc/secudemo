package securitycoreprueba1

import grails.plugin.springsecurity.annotation.Secured


class TestController {
	
	@Secured('ROLE_ADMIN')
    def administrador() {
		
		render "Hola mundo"
	}
}
