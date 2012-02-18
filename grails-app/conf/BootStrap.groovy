import seabuttle.Person
import seabuttle.Role
import seabuttle.PersonRole

class BootStrap {

    def init = { servletContext ->


        if (!Person.count()) {
            def userRole = new Role(authority: 'ROLE_User').save(flush: true)
            def users = []
            users << new Person(username: "peter", enabled: true, password: 'test', name: "Petr Stepanovich Flomenkov", email: "petr@gmail.com", phone: "2345678").save(failOnError: true, flush: true)
            users << new Person(username: "mihail", enabled: true, password: 'test', name: "Mihail", email: "mihail@gmail.com", phone: "152637").save(failOnError: true, flush: true)
            users << new Person(username: "alyona", enabled: true, password: 'test', name: "Alyona", email: "alyona@list.com", phone: "9080703").save(failOnError: true, flush: true)
            PersonRole.create users[0], userRole, true
            PersonRole.create users[1], userRole, true
            PersonRole.create users[2], userRole, true

            assert Person.count() == 3
            assert Role.count() == 1
            assert PersonRole.count() == 3
        }
    }
    def destroy = {
    }
}
