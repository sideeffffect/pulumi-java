// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DataFlowResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.DataFlowSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TransformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowletResponse {
    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The description of the data flow.
     * 
     */
    private final @Nullable String description;
    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    private final @Nullable DataFlowResponseFolder folder;
    /**
     * Flowlet script.
     * 
     */
    private final @Nullable String script;
    /**
     * Flowlet script lines.
     * 
     */
    private final @Nullable List<String> scriptLines;
    /**
     * List of sinks in Flowlet.
     * 
     */
    private final @Nullable List<DataFlowSinkResponse> sinks;
    /**
     * List of sources in Flowlet.
     * 
     */
    private final @Nullable List<DataFlowSourceResponse> sources;
    /**
     * List of transformations in Flowlet.
     * 
     */
    private final @Nullable List<TransformationResponse> transformations;
    /**
     * Type of data flow.
     * Expected value is 'Flowlet'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private FlowletResponse(
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("folder") @Nullable DataFlowResponseFolder folder,
        @OutputCustomType.Parameter("script") @Nullable String script,
        @OutputCustomType.Parameter("scriptLines") @Nullable List<String> scriptLines,
        @OutputCustomType.Parameter("sinks") @Nullable List<DataFlowSinkResponse> sinks,
        @OutputCustomType.Parameter("sources") @Nullable List<DataFlowSourceResponse> sources,
        @OutputCustomType.Parameter("transformations") @Nullable List<TransformationResponse> transformations,
        @OutputCustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.script = script;
        this.scriptLines = scriptLines;
        this.sinks = sinks;
        this.sources = sources;
        this.transformations = transformations;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the data flow.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The description of the data flow.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
    */
    public Optional<DataFlowResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * Flowlet script.
     * 
    */
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }
    /**
     * Flowlet script lines.
     * 
    */
    public List<String> getScriptLines() {
        return this.scriptLines == null ? List.of() : this.scriptLines;
    }
    /**
     * List of sinks in Flowlet.
     * 
    */
    public List<DataFlowSinkResponse> getSinks() {
        return this.sinks == null ? List.of() : this.sinks;
    }
    /**
     * List of sources in Flowlet.
     * 
    */
    public List<DataFlowSourceResponse> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * List of transformations in Flowlet.
     * 
    */
    public List<TransformationResponse> getTransformations() {
        return this.transformations == null ? List.of() : this.transformations;
    }
    /**
     * Type of data flow.
     * Expected value is 'Flowlet'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowletResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable DataFlowResponseFolder folder;
        private @Nullable String script;
        private @Nullable List<String> scriptLines;
        private @Nullable List<DataFlowSinkResponse> sinks;
        private @Nullable List<DataFlowSourceResponse> sources;
        private @Nullable List<TransformationResponse> transformations;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowletResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.scriptLines = defaults.scriptLines;
    	      this.sinks = defaults.sinks;
    	      this.sources = defaults.sources;
    	      this.transformations = defaults.transformations;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder folder(@Nullable DataFlowResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }

        public Builder scriptLines(@Nullable List<String> scriptLines) {
            this.scriptLines = scriptLines;
            return this;
        }

        public Builder sinks(@Nullable List<DataFlowSinkResponse> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder sources(@Nullable List<DataFlowSourceResponse> sources) {
            this.sources = sources;
            return this;
        }

        public Builder transformations(@Nullable List<TransformationResponse> transformations) {
            this.transformations = transformations;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FlowletResponse build() {
            return new FlowletResponse(annotations, description, folder, script, scriptLines, sinks, sources, transformations, type);
        }
    }
}
