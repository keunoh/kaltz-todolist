import "./IndexPage.css";
import { useState } from "react";
import { join } from "../utils/APIUtils";

const IndexPage = () => {
  const [name, setName] = useState("");
  const [password, setPassword] = useState("");

  const joinHandleSubmit = (e) => {
    e.preventDefault();

    let joinMemberData = {
      name: name,
      password: password,
    };

    join(joinMemberData)
      .then((response) => {
        console.log("Join Success");
        console.log(response);
      })
      .catch((error) => {
        console.log("Join Fail");
        console.log(error);
      });
  };

  return (
    <div>
      <h1>hello! from React!</h1>

      <form onSubmit={joinHandleSubmit}>
        <label htmlFor="name">ID : </label>
        <input
          type="text"
          name="name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />

        <label htmlFor="password">PW : </label>
        <input
          type="password"
          name="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />

        <button>submit</button>
      </form>

      <div className="mydiv d1"></div>
      <div className="mydiv d2"></div>
      <div className="mydiv d3"></div>
    </div>
  );
};

export default IndexPage;
