#!/bin/sh

# git setting
git config --global user.name github-actions
git config --global user.email noreply@github.com

export GIT_BRANCH="$(git symbolic-ref HEAD --short 2>/dev/null)"
if [ "$GIT_BRANCH" = "" ] ; then
  GIT_BRANCH="$(git branch -a --contains HEAD | sed -n 2p | awk '{ printf $1 }')";
  export GIT_BRANCH=${GIT_BRANCH#remotes/origin/};
fi

rm -rf mock-json
java -jar ./.github/actions/mock-json-gen/openapi-mock-json-generater.jar -i openapi.yaml -o mock-json

# ignore no diff
set +e

git add .
git commit -m "add generated mock-json"
git push origin $GIT_BRANCH

echo 'finish mock-json-gen'
