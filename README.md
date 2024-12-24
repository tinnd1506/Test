# REST API README

## Tony API

The Tony API provides endpoints for handling requests related to Tony's video and tree decorations.

### Tony Controller

The `TonyController` is responsible for managing requests related to Tony's video.

#### Endpoints:
- **GET /tony**
  - Retrieves Tony's video.
  - Returns a `VideoModel` or an error message in a `ResponseEntity`.

### Tree Controller

The `TreeController` manages HTTP requests related to tree decorations.

#### Endpoints:
- **POST /decorate-tree**
  - Decorates a tree with the specified color.
  - Expects a color parameter in the request.
  - Returns the result of the operation in a `ResponseEntity`.

### Integration with Angular Frontend

Frontend developers using Angular can integrate the Tony API with their applications by making HTTP requests to the specified endpoints.

#### Using /tony Endpoint for Video Embedding:
1. Make an HTTP GET request to `/tony` to retrieve Tony's video.
2. Extract the video details from the response, including the video URL and any additional information.
3. Embed the video in the Angular application using Angular's video player component or HTML `<video>` tag.

#### Using /decorate-tree Endpoint for Tree Coloring:
1. Send an HTTP POST request to `/decorate-tree` with the color parameter (e.g., red, white, or green) to decorate a tree.
2. Receive the response containing the result of the tree decoration operation.
3. Update the Angular application UI to display the colored tree based on the response received.

#### Testing Endpoints with cURL:
To test the API endpoints, you can use the following commands:

1. **Testing Tony's video endpoint `/tony`**:
   ```bash
   curl http://localhost:3050/tony
   ```

2. **Testing tree decoration endpoint `/decorate-tree`**:
   ```bash
   curl -X POST http://localhost:3050/decorate-tree -d "color=example_color"
   ```

By following these steps, Angular frontend developers can effectively utilize the Tony API to embed Tony's video and decorate trees within their Angular applications.
