-- Table: public.datasourceconfig

-- DROP TABLE IF EXISTS public.datasourceconfig;

CREATE TABLE IF NOT EXISTS public.datasourceconfig
(
    id integer NOT NULL,
    name character varying COLLATE pg_catalog."default" NOT NULL,
    url character varying COLLATE pg_catalog."default" NOT NULL,
    username character varying COLLATE pg_catalog."default" NOT NULL,
    password character varying COLLATE pg_catalog."default" NOT NULL,
    driverclassname character varying COLLATE pg_catalog."default" NOT NULL,
    initialize character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT datasourceconfig_pkey PRIMARY KEY (id)
)

