# Beispielanwendung für die Google App Engine

Build der Vorstufe

    mvn appengine:stage

Instllation der Anwendung

    cd target/appengine-stage
    gcloud app deploy

Bei der Ausführung des Kommandos wird auch die externe URL dargestellt:

    https://swearword-prompter-dot-inspired-cortex-299509.wn.r.appspot.com

Logs der Anwendung

    gcloud app logs tail -s swearword-prompter



