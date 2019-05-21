# coding=utf-8
from flask import Flask, jsonify,abort

app = Flask(__name__)

@app.route("/")
def hello():
    books = [{"book1":{"book_name":"Y", "Author":"ZM"}}, {"book2":{"book_name":"X","Author":"YQ"}}]
    return jsonify(books)
