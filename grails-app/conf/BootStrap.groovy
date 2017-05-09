import prueba.UserRole
import prueba.User
import prueba.Role


class BootStrap {
      def init = { servletContext ->
            def adminRole = Role.findOrSaveWhere(authority:'ROLE_USER')
            def user = User.findOrSaveWhere(username:'admin',password:'password')
			

            if(!user.authorities.contains(adminRole)){
                  UserRole.create(user,adminRole,true)
            }
}
      def destroy = {
      }
}
