# Semantic Release Example

Simple example of how to use [semantic-release](https://github.com/semantic-release/semantic-release) in a Java + Spring Boot + Maven project. 

## Conventional commits

### Enforcing using git hooks

`git config core.hooksPath .githooks`

The hook itself can be found in `.githooks/commit-msg`.

### Using Commitizen

Install [commitizen](https://github.com/commitizen-tools/commitizen)

`brew install commitizen`

and then just use it

`cz commit`

## Semantic Versioning and Release

Github actions and semantic-release are used to:
1. calculate the new semantic version of the artifact
2. automatically create a changelog
3. release a new version in Github

In `.github/workflows/main.yml` you can find the actual pipeline.

In `.releaserc` you can find all the needed configuration for semantic-version plugins used.