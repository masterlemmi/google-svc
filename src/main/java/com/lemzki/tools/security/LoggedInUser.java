package com.lemzki.tools.security;

@FunctionalInterface
public interface ggedInUser {
    User get();

     LoggedInUser ANONYMOUS = ()->User.ANONYMOUS;

}
