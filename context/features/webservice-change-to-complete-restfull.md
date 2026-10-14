# Java + Spring Boot Setup

## Overview

Change all the endpoints to RESTfull. This technically makes the webservice an api service.

## Requirements

- Check the EndpointController for endpoints that do not return a json.
- Change these endpoint to return json with the data { `data`: `<the data>` }
- Change the landingspage endpoint to return a json giving a message in the data json { `data`: `this is a not valid endpoint` }

## References

- Initial data models: `@context/project-overview.md`
- Database standards: `@context/coding-standards.md`
- EndpointController: `src\main\java\com\example\SpringWeb\WebService\EndpointController.java`

## Notes
