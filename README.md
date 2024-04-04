# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

create a Pull request

### How do I get to publish? ###
# this part is to deploy in JITPACK #
Push git tag version MAJOR.MINOR.BUG 
change `applicationVersion` into `gradle.properties`
git push tag
## workflow
.github/workflows/publish-release.yml
Automatically push a new release
push tag -> `publish-release.yml` create
```plantuml
@startuml
skinparam style strictuml
skinparam backgroundcolor transparent
skinparam DefaultTextAlignment center
hide empty description
[*] --> User(you)
User(you) -> Tag : push -> Release : automatic
@enduml
```


# this part is to deploy in OSSRH (NOT USED ANYMORE) #

1. create your gradle.properties in your user folder (ex: ~/.gradle/gradle.properties)

Follow the **signature credentials**  
Signin plugin
<https://docs.gradle.org/current/userguide/signing_plugin.html#sec:signatory_credentials>

1. install gpg
2. gpg --full-gen-key (https://dzone.com/articles/publish-your-artifacts-to-maven-central point 8 to 9 )
3. `gpg --keyserver <hkp://keyserver.ubuntu.com> --send-keys`
   or `gpg --keyserver hkp://keyserver.ubuntu.com:80 --send-key 8D32FF6AEEB7BA37980265BC6D8749B0B57526888D32FF6AEEB7BA37`
4. gpg --keyring secring.gpg --export-secret-keys > ~/.gnupg/secring.gpg
5. fill in the gradle.properties (/Users/yours/.gradle/gradle.properties) signing.keyId => gpg -K : get the last 8  
   digits from 'sec'   
   signing.password => passphrase

**Example**  
signing.keyId=123F345  
signing.password=yourPassPhrase  
signing.secretKeyRingFile=/Users/yours/.gnupg/secring.gpg

6. create an account to https://www.sonatype.org  
   add your credential to your own gradle.properties:
   ossrhUsername=userSonarType ossrhPassword=pwd
7. Ask Publishing support . The owner of the project will do it.

8. execute command:  
   `
   gradle clean
   `
   increment the version (applicationVersion) within `gradle.properties'

`
gradle build  
`  
`
gradle publish
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

