import React from "react";
import { Pagination } from "react-bootstrap";
import PostItem from "../../components/PostItem";

const Home = () => {
  function prev() {}
  function next() {}

  return (
    <div>
      {<PostItem id={1} title={"제목1"} />}
      {<PostItem id={2} title={"제목2"} />}
      <br />
      <div className="d-flex justify-content-center">
        <Pagination>
          <Pagination.Item onClick={prev} disabled>
            Prev
          </Pagination.Item>
          <Pagination.Item onClick={next}>Next</Pagination.Item>
        </Pagination>
      </div>
    </div>
  );
};

export default Home;
