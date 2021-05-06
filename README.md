# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

1. create your gradle.properties in your user folder (ex: ~/.gradle/gradle.properties)
2. Follow the **signature credentials**  
   Signin plugin
   <https://docs.gradle.org/current/userguide/signing_plugin.html#sec:signatory_credentials>

gpg --keyserver <hkp://keyserver.ubuntu.com> --send-keys
3. execute command:  
` 
gradle clean
gradle build  
`  
 `
gradle uploadArchives
`  
Ask (to: julien.fumanti@finauxa.com) the authorization to release the library 

The link to authorize :
<https://central.sonatype.org/publish/publish-gradle/>


### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###
<https://central.sonatype.org/publish/publish-gradle/>

* Repo owner or admin
* Other community or team contact