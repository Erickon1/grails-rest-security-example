package bookstore

import grails.gorm.transactions.Transactional
class BootStrap {

    def init = { servletContext ->
      addTestUser()
    }
    def destroy = {
    }

    @Transactional
    void addTestUser() {
      Role role = new Role( authority: "ROLE_USER" ).save()
      Role roleAdmin = new Role( authority: "ROLE_ADMIN" ).save()

      User user = new User( username: "eve", password:"123" ).save()
      User admin = new User( username: "admin", password:"123" ).save()
      
      UserRole.create user, role
      UserRole.create admin, roleAdmin

      UserRole.withSession {
          it.flush()
          it.clear()
      }
    }

}
