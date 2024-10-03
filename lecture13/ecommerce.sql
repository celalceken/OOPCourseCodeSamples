
CREATE DATABASE ecommerce;

CREATE TABLE public.product (
                                  id integer NOT NULL,
                                  name character varying(30) NOT NULL,
                                  unitprice integer NOT NULL,
                                  stockamount integer NOT NULL
);

INSERT INTO public.product VALUES (1, 'HDD', 300, 10);
INSERT INTO public.product VALUES (2, 'RAM', 800, 4);
INSERT INTO public.product VALUES (3, 'CPU', 1000, 10);
INSERT INTO public.product VALUES (4, 'SSD', 1100, 10);
