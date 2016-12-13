# android-consumer.app
An application to help vision-impaired users who own an Android smartphone.

In further documentation, to avoid any ambiguity with other apps, we call this application the "Camera App", as its main role is to take pictures and label them (possibly with the help of sighted people or AI).

# Objectives

While this application should be useful by itself, its main role is to serve as a prototype/MVP until we have built devices with a form-factor more adapted to vision-impaired users.

## MVP features

TBD

## Future versions

TBD

# Elements of technical design

## Client telemetry

For the time being, we use Google Analytics for client telemetry. This is definitely not the best choice wrt privacy but this will let us experiment more quickly. Once we have reached a workable app, we plan to revisit this choice and use another implementation of client telemetry (e.g. https://github.com/Yoric/telemetry.rs/).
