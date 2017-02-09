Developers
==========

An application to handle developers and the program they learned.

### Setup

The projet uses a dockerized posgresql database.
Thus, you need to have recent version of Docker installed on your machine.

Then, from the project root, run the following command to setup it :
```
$ ./setup_db.sh
```

This will create the database docker image and deploy it, exposing the db on port 5432.
