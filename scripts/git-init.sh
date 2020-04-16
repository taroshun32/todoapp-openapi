#!/bin/sh
openapi_generator="openapi-generator"

dir=`PWD`
# --initでローカルの設定ファイルを初期化、updateでデータの取得と親プロジェクトで指定されているコミットにチェックアウトする。
git submodule update --init

# submoduleとして取り込んであるswaggerリポジトリにsparsecheckoutを設定する
echo "set $openapi_generator to sparse-checkout"
mkdir -p ./.git/modules/${openapi_generator}/info
echo '/code-gen' > ./.git/modules/${openapi_generator}/info/sparse-checkout
cd ${openapi_generator}
git config core.sparsecheckout true
# sparsecheckoutの設定を反映
git read-tree -mu HEAD
cd ${dir}