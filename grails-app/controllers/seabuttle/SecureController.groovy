package seabuttle

import grails.plugins.springsecurity.Secured


class SecureController {

    def index() { }

    def isUsableScreenName(){
        render true;
    }

    def isCorrectPassword(){
        render true;
    }

    def seabattleGame(){

    }
}
