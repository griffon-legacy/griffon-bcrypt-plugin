
Simple bcrypt plugin to perform bcrypt hashing.
-----------------------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/bcrypt](http://artifacts.griffon-framework.org/plugin/bcrypt)


This plugin provides a service class and a Groovy 2 module extension utility
for easy bcrypt hashing. It's a port of the [bcrypt][1] Grails plugin by
Seymour Cakes and Burt Beckwith.

Salt + MD5 or SHA hashing is typically not secure enough. See [here][2] for more
details.

Usage
-----

You can either grab a reference to `BcryptService` or use the enhanced methods on
a String, like this

    // inject bcryptService the usual way
    def bcryptService
    String password = "my password"
    // should give you a nice bcrypt hash
    println password.encodeAsBcrypt()

    // same thing but using the service class
    def x = bcryptService.hashPassword(password)
    // if true continue, else bye.
    assert service.checkPassword(password, x)

The BCrypt module extension exposes the following methods on a String

 * encodeAsBcrypt()
 * encodeAsBcrypt(int salt)

[1]: http://grails.org/plugin/bcrypt
[2]: http://codahale.com/how-to-safely-store-a-password

