package seabuttle

import grails.plugins.springsecurity.Secured


class SecureController {

    def index() {
        redirect(controller: "secure", action: "seabattleGame")
    }

    def isUsableScreenName(){
        render true;
    }

    def isCorrectPassword(){
        render true;
    }
   @Secured(['ROLE_Authorized'])
    def seabattleGame(){

    }
}
