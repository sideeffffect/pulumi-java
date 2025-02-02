CHANGELOG
=========

## 0.4.1 (2022-06-30)

### Improvements

- [sdk] #553: Added `com.pulumi.test` package with new idiomatic Java API for [unit testing Pulumi programs]
  (https://www.pulumi.com/docs/guides/testing/#unit-testing) against mocks.
  See ([example](https://github.com/pulumi/pulumi-java/tree/main/tests/examples/testing-unit-java)) of using the new API.

- [codegen] [#709](https://github.com/pulumi/pulumi-java/pull/709)
  Improved version handling in `pulumi-java-gen`: now `--version`
  argument is optional and the version of the generated package need
  not be known at SDK code generation time and is not spliced into the
  code. To set the version at build time use
  `gradle -Pversion=1.2.3 build` or `PACKAGE_VERSION=1.2.3 gradle build`.

## 0.4.0 (2022-06-22)

### Improvements

- [codegen] **Breaking**
  [#163](https://github.com/pulumi/pulumi-java/issues/163): function
  invokes now accept `Output<T>` in their arguments and return
  `Output<T>` instead of `CompletableFuture<T>`
  [#612](https://github.com/pulumi/pulumi-java/pull/612)

- [sdk] `Stack` resource is now considered internal and cannot be
  directly instantiated by the user. Instead of inheriting from
  `Stack`, please use the `Pulumi.run` form to define resources in
  your stack as shown in the README

- [sdk] [#478](https://github.com/pulumi/pulumi-java/issues/478):
  support stack transformations with new `Pulumi.withOptions` API

- [provider] [#576](https://github.com/pulumi/pulumi-java/issues/576)
  Added Gradle support for subprojects. For example, given this
  directory structure:

  ```
  proj/settings.gradle
  proj/subproj/build.gradle
  proj/subproj2/build.gradle
  ```

  Running `cd proj/subproj && pulumi up` will now locate the project
  root and run `gradle :subproj:run` from within `proj`. This makes sure
  Gradle features such as plugins work as expeceted.

## 0.3.0 (2022-06-01)

### Improvements

- [programgen] [#547](https://github.com/pulumi/pulumi-java/issues/547):
  Generate fully qualified imports

- [sdk] [#419](https://github.com/pulumi/pulumi-java/issues/419):
  Remove SDK dependency on Mockito

- [provider] Support for using [jbang](https://jbang.dev)

### Bug Fixes

- [codegen] [#627](https://github.com/pulumi/pulumi-java/issues/627):
  Fix malformed versions in generated build files by sanitizing
  version input in pulumi-java-gen

## 0.2.1 (2022-05-20)

### Improvements

- [provider] Add `pulumi-java-gen` binary encapsulating Java SDK
  generation to the GitHub releases.

## 0.2.0 (2022-05-18)

### Improvements

- [sdk]
  [#534](https://github.com/pulumi/pulumi-java/issues/534):
  `StackReferenceArgs` can now be instantiated using
  `StackReferenceArgs.builder()` and `StackReferenceArgs.Builder`,
  also `StackReferenceArgs.getName()` was deprecated in favour of
  `StackReferenceArgs.name()`
  [#537](https://github.com/pulumi/pulumi-java/pull/537)

- [sdk]
  [#430](https://github.com/pulumi/pulumi-java/issues/430):
  now you can pass both plain `Object` and
  `Output`-wrapped objects to `Output.format`, as in:
  `Output.format("Resource %s has ID %s", myResource, myResource.getId())`
  [#539](https://github.com/pulumi/pulumi-java/pull/539)

- [examples] Add examples from PulumiUp
  [#542](https://github.com/pulumi/pulumi-java/pull/542)

- [codegen] Make sure all overloads of function invokes have doc comments
  [#581](https://github.com/pulumi/pulumi-java/pull/581)

- [ci] GitHub Actions: use 'temurin' JDK instead of the deprecated
  'adopt' JDK

### Bug Fixes

- [programgen] Fix
  [#546](https://github.com/pulumi/pulumi-java/issues/546):
  generated Java programs from PCL now also generate custom resource options
  [#558](https://github.com/pulumi/pulumi-java/pull/558)

- [provider] Fix
  [#538](https://github.com/pulumi/pulumi-java/issues/538): provide
  detailed compilation failure information from `pulumi-language-java`
  in Pulumi CLI

- [sdk] Fix [#552](https://github.com/pulumi/pulumi-java/issues/552):
  `Output.all` will preserve list length and retain `null` elements

- [provider] Fix
  [#540](https://github.com/pulumi/pulumi-java/issues/540): language
  host will no longer fail when doing plugin discovery
