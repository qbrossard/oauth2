# Oauth2
## Links und tutorials

Beste Intro: 
https://developer.okta.com/blog/2017/06/21/what-the-heck-is-oauth

Spring boot Tutorial:
https://spring.io/guides/tutorials/spring-boot-oauth2/

## Intro
- oauth1 vs oauth2 vs SAML
- authentication vs authorization, oauth2 + openid connect für authentication (keycloak, FSSO)
- basic flow
- oauth2 Komponente
  - Scopes
  - Aktoren
  - 2 Tokens
  
- oauth2 flows
  - implicit (SPAs, Finnova SSO in IC)
  - authorization code flow
  - etc...


## Spring boot + oauth2 demo
1. spring boot keine Sicherheit
1. build.gradle:  security aktiviert
1. application.yaml oauth client + secret von github
   - github developer page, oauth app konfigurieren
   https://github.com/settings/apps
   - secrets in application.yaml eintragen (nicht einchecken!!!)
   - authorization flow zeigen (chrome console + github profile) 


