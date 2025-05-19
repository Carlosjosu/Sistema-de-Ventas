import { createRoute as createRoute_1 } from "@vaadin/hilla-file-router/runtime.js";
import type { AgnosticRoute as AgnosticRoute_1 } from "@vaadin/hilla-file-router/types.js";
import * as Page_1 from "../views/@index.js";
import * as Layout_1 from "../views/@layout.js";
import * as Page_2 from "../views/Auto-list.js";
import * as Page_3 from "../views/Favorito-list.js";
import * as Page_4 from "../views/Imagen.js";
import * as Page_5 from "../views/Publicacion.js";
import * as Page_6 from "../views/task-list.js";
import * as Page_7 from "../views/Usuario-list.js";
import * as Page_8 from "../views/Venta.js";
const routes: readonly AgnosticRoute_1[] = [
    createRoute_1("", Layout_1, [
        createRoute_1("", Page_1),
        createRoute_1("Auto-list", Page_2),
        createRoute_1("Favorito-list", Page_3),
        createRoute_1("Imagen", Page_4),
        createRoute_1("Publicacion", Page_5),
        createRoute_1("task-list", Page_6),
        createRoute_1("Usuario-list", Page_7),
        createRoute_1("Venta", Page_8)
    ])
];
export default routes;
