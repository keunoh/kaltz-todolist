import { Route, Routes } from "react-router-dom";

import IndexPage from "../index/IndexPage";
import Quotes from "../qoutes/Quotes";

const RootRouter = () => {
  return (
    <Routes>
      <Route path="/" element={<Quotes />}></Route>
      <Route path="/indexPage" element={<IndexPage />}></Route>
    </Routes>
  );
};

export default RootRouter;
