CREATE EXTENSION IF NOT EXISTS vector;

CREATE TABLE IF NOT EXISTS references (
    id SERIAL PRIMARY KEY,
    vector vector(14),
    label BOOLEAN
);

CREATE INDEX IF NOT EXISTS idx_references_vector ON references USING hnsw (vector vector_l2_ops);
