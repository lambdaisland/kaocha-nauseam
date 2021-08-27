# kaocha-nausem

<!-- badges -->
[![CircleCI](https://circleci.com/gh/lambdaisland/{project}.svg?style=svg)](https://circleci.com/gh/lambdaisland/{project}) [![cljdoc badge](https://cljdoc.org/badge/lambdaisland/{project})](https://cljdoc.org/d/lambdaisland/{project}) [![Clojars Project](https://img.shields.io/clojars/v/lambdaisland/{project}.svg)](https://clojars.org/lambdaisland/{project})
<!-- /badges -->

## Usage

To generate the tests:

    bb generate-simple

To run the tests:

    bin/kaocha

To run the tests against a local copy of `kaocha`:

    clojure -A:dev:test-local -m kaocha.runner


## License

Copyright &copy; 2021 Arne Brasseur and Contributors

Licensed under the term of the Mozilla Public License 2.0, see LICENSE.

Available under the terms of the Eclipse Public License 1.0, see LICENSE.txt
