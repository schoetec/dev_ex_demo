# Coding Standards

## TypeScript

- Strict mode enabled
- No `any` types - use proper typing or `unknown`
- Define interfaces for all props, API responses, and data models
- Use type inference where obvious, explicit types where helpful

## React

- Functional components only (no class components)
- Use hooks for state and side effects
- Keep components focused - one job per component
- Extract reusable logic into custom hooks

## Java

- Use java 21
- Use clean and readable code structure
- Well document the generated code

## Spring

- Use Java Spring Boot 4.1.1
- Use RESTfull interface for the service.

## Vaadin

- Use Vaadin version v25.3.0

## Maven

- Use maven 3.9
- Use Maven to build the solution
- Always add maven build file in the main folder

## File Organization

- ./SpringWeb folder contains the WebPortal and WebService
- ./SpringWeb/WebPortal contains the WebPortal implementation. The landingspage, application start and callcontroller are in .\SpringWeb\WebPortal\src\main\java\com\example\
- ./SpringWeb/WebService contains the WebService implementation. The EndpointController and HelloWorldService are in .\SpringWeb\WebService\src\main\java\com\example\webservice
- Ensure the java files are put in the correct folder 

## Naming

- Components: PascalCase (`ItemCard.tsx`)
- Files: Match component name or kebab-case
- Functions: camelCase
- Constants: SCREAMING_SNAKE_CASE
- Types/Interfaces: PascalCase (no prefix)
- Java: PascalCase (`ServiceApi.java`)

## Styling

- Use Vaadin default.

## Database

<!-- Not applicable -->

## Data Fetching

<!-- Not applicable -->

## Error Handling Portal

- Use try/catch in Server Actions
- Return `{ success, data, error }` pattern from actions
- Display user-friendly error messages via the error dialog

## Error Handling Java and Spring

- Use try/catch in Server Actions
- Return `{ success, data, error }` pattern from actions
- Display user-friendly error messages int hte json return packages if the REST call fails.

## Code Quality

- No commented-out code unless specified
- No unused imports or variables
- Keep functions under 50 lines when possible
