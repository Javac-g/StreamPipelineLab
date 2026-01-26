visual-stream-javafx/
 ├─ build.gradle                 # Gradle build file
 ├─ settings.gradle
 ├─ src/
 │    ├─ main/
 │    │    ├─ java/
 │    │    │    └─ com/visualstream/
 │    │    │         ├─ Main.java               # Entry point (JavaFX Application)
 │    │    │         ├─ app/
 │    │    │         │    ├─ CanvasView.java
 │    │    │         │    ├─ StreamView.java
 │    │    │         │    ├─ OperationBlockView.java
 │    │    │         │    ├─ CollectionView.java
 │    │    │         │    ├─ BucketView.java
 │    │    │         │    ├─ TokenView.java
 │    │    │         │    ├─ LambdaEditorView.java
 │    │    │         │    └─ ControlsView.java
 │    │    │         │
 │    │    │         ├─ model/
 │    │    │         │    ├─ ElementNode.java
 │    │    │         │    ├─ StreamNode.java
 │    │    │         │    ├─ CollectionNode.java
 │    │    │         │    ├─ OperationNode.java
 │    │    │         │    ├─ ReduceOperationNode.java
 │    │    │         │    ├─ GroupingReduceNode.java
 │    │    │         │    └─ ParallelReduceNode.java
 │    │    │         │
 │    │    │         ├─ controller/
 │    │    │         │    ├─ ExecutionController.java
 │    │    │         │    ├─ StreamExecutor.java
 │    │    │         │    ├─ ParallelExecutor.java
 │    │    │         │    └─ AnimationScheduler.java
 │    │    │         │
 │    │    │         ├─ util/
 │    │    │         │    ├─ LambdaParser.java
 │    │    │         │    ├─ SaveManager.java
 │    │    │         │    └─ JavaCodeGenerator.java
 │    │    │         │
 │    │    │         └─ types/
 │    │    │              ├─ CollectionKind.java
 │    │    │              ├─ OperationKind.java
 │    │    │              └─ TypeDescriptor.java
 │    │    │
 │    │    └─ resources/
 │    │         └─ styles.css
