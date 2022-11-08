import { Route, Routes } from "react-router-dom";

import IndexPage from "../index/IndexPage";

const RootRouter = () => {
  return (
    <Routes>
      <Route path="/" element={<IndexPage />}></Route>
    </Routes>
  );
};

export default RootRouter;
