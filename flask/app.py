from flask import Flask, render_template, request

app = Flask(__name__)

@app.route("/")
def home():
    return render_template("home.html")

#/check route
@app.route("/check", methods=["POST"])
def check():
    password = request.form["password"]
    return render_template("result.html", password=password, rating="to be implemeted")

if __name__=="__main__":
    app.run(debug=True, port=5000)