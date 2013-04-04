/*
 * Copyright 2009-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class BcryptGriffonPlugin {
    String version = '0.1.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.2.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-bcrypt-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]

    String title = 'Simple bcrypt plugin to perform bcrypt hashing.'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
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
'''
}
