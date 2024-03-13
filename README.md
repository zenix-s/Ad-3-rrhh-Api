# Kronos

Kronos es una aplicación para la gestión interna de tickets. Esta pensada para ser utilizada por empresas que necesiten gestionar tickets a departamentos internos como soporte técnico, recursos humanos, etc.

Kronos esta pensado para ser una aplicación open source y self-hosted, es decir, que cada empresa pueda instalarla en sus propios servidores y adaptarla a sus necesidades.

## ¿Por qué?

La idea de Kronos surge de la necesidad de tener una aplicación de gestión de tickets que se adapte a las necesidades de cada empresa.

## Tecnologías

### Frontend
- Angular
- TailwindCSS

### Backend
- NodeJS
- MongoDB

## Asignaturas

### Desarrollo de aplicaciones web en entorno cliente
- Se utilizará Angular para el desarrollo del frontend

### Desarrollo de aplicaciones web en entorno servidor
- Se aplicarán conocimientos en la creación de APIs REST
- Se utilizará conocimiento en la creación de bases de datos

### Diseño de interfaces
- Creación de los diseños de la aplicación
- Se aplicarán conocimientos en el diseño de interfaces con css

### Despliegue de aplicaciones web
- Se aplicarán conocimientos a traves del depligue de la aplicación en un servidor Debian.

## Funcionamiento

Un usuario puede crear un ticket.
Un ticket puede ser asignado a un departamento o a un usuario.
Un ticket puede tener una prioridad.
El ticket ha es aceptado por el departamento o usuario asignado.
El ticket puede tener un estado (abierto, en curso, resuelto). <-- Esto puede ser un campo personalizable.
El ticket puede tener comentarios.
  - Los comentarios pueden ser del usuario.
  - Los comentarios pueden ser del departamento o usuario asignado.
    - Los comentarios del departamento o usuario asignado pueden ser privados, y solo visibles para el departamento o usuario asignado.

## Apartados a implementar

- Fase 1: Creación y gestión de tickets

  - Creación de tickets:
      - Formulario para la creación de tickets con campos personalizables.
      - Categorización y prioridad de tickets.
      - Adjuntos de archivos.
  - Gestión de tickets:
      - Visualización de tickets con información completa.
      - Asignación de tickets a usuarios o departamentos.
      - Seguimiento del estado de los tickets (abierto, en curso, resuelto).
      - Historial de comentarios y actualizaciones.

- Fase 2: Notificaciones y comunicación

  - Notificaciones:
    - Notificar por correo electrónico o web a los usuarios sobre cambios en los tickets.
    - Notificaciones automáticas al asignar tickets o realizar cambios.
  - Comunicación:
    - Sistema de mensajería interna para la comunicación entre usuarios sobre los tickets.
    - Adjuntar archivos a los mensajes.

- Fase 3: Administración y configuración

  -  Administración de usuarios:
    - Creación, edición y eliminación de usuarios.
      -  Permisos y roles para diferentes usuarios.
  - Configuración de la aplicación:
    - Personalización de campos y categorías de tickets.
    - Integración con otros sistemas (correo electrónico, LDAP, etc.).
