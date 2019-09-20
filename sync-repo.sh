git remote add upstream git@github.com:OpenAPITools/openapi-generator.git
git fetch upstream
git checkout master
git stash
git merge upstream/master
git commit -am "Merged from upstream"
git push
git stash pop