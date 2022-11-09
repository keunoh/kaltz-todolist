import { getHeaders } from "../utils/APIUtils";
import "./IndexPage.css";

const IndexPage = () => {
  const headerPage = (e) => {
    e.preventDefault();
    console.log("clicked!");

    getHeaders()
      .then((response) => {
        console.log("method success");
        console.log(response);
      })
      .catch((error) => {
        console.log("failed");
        console.log(error);
      });
  };

  return (
    <div>
      <h1>hello! from React!</h1>

      <div className="mydiv d1">
        <div className="green"></div>
      </div>
      <div className="mydiv d2"></div>
      <div className="mydiv d3">
        <div className="darkcyan"></div>
      </div>
      <div className="mydiv d4"></div>

      <div className="mydiv s1"></div>
      <div className="mydiv s2"></div>
      <div className="mydiv s3"></div>
      <div className="mydiv s4"></div>
      <section className="index-section">
        <button onClick={headerPage}>header infromation</button>
      </section>
    </div>
  );
};

export default IndexPage;
