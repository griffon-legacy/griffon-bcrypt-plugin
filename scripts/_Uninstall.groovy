//
// This script is executed by Griffon when the plugin is uninstalled from project.
// Use this script if you intend to do any additional clean-up on uninstall, but
// beware of messing up SVN directories!
//

// Update the following configuration if your addon
// requires a different prefix or exposes nodes in
// a different way.
// Remember to apply the reverse changes in _Install.groovy
//
// check to see if we already have a BcryptGriffonAddon
// def configText = '''root.'BcryptGriffonAddon'.addon=true'''
// if(builderConfigFile.text.contains(configText)) {
//     println 'Removing BcryptGriffonAddon from Builder.groovy'
//     builderConfigFile.text -= configText
// }