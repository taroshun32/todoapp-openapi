# todoapp-openapi
タスク管理アプリ用API定義

## プロジェクトについて
このプロジェクトでは `GithubActions` を `CI` のメインツールとして使用しています。[ [各Actionについて](https://github.com/taroshun32/todoapp-openapi/wiki/GithubActions) ]  
API定義ファイル(openapi.yaml)から `Controller` と `Model` を自動生成するための [openapi-generator](https://github.com/taroshun32/openapi-generator) をサブモジュールとして取り込んでいます。

## 運用フロー
1. API定義に変更・修正・改善等がある場合は、`openapi.yaml` の修正を行う
2. featureブランチにpushされる度に、`GithubActions` が `openapi.yaml` をもとに `openapi-generator` を使ってモデルを自動生成する
3. 差分に問題がなければmasterにマージし、使用元のプロジェクトでサブモジュールの更新を行う
