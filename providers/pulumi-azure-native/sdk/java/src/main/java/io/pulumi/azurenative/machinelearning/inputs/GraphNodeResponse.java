// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.WebServiceParameterResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a node in the web service graph. The node can either be an input, output or asset node, so only one of the corresponding id properties is populated at any given time.
 * 
 */
public final class GraphNodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GraphNodeResponse Empty = new GraphNodeResponse();

    /**
     * The id of the asset represented by this node.
     * 
     */
    @InputImport(name="assetId")
      private final @Nullable String assetId;

    public Optional<String> getAssetId() {
        return this.assetId == null ? Optional.empty() : Optional.ofNullable(this.assetId);
    }

    /**
     * The id of the input element represented by this node.
     * 
     */
    @InputImport(name="inputId")
      private final @Nullable String inputId;

    public Optional<String> getInputId() {
        return this.inputId == null ? Optional.empty() : Optional.ofNullable(this.inputId);
    }

    /**
     * The id of the output element represented by this node.
     * 
     */
    @InputImport(name="outputId")
      private final @Nullable String outputId;

    public Optional<String> getOutputId() {
        return this.outputId == null ? Optional.empty() : Optional.ofNullable(this.outputId);
    }

    /**
     * If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,WebServiceParameterResponse> parameters;

    public Map<String,WebServiceParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public GraphNodeResponse(
        @Nullable String assetId,
        @Nullable String inputId,
        @Nullable String outputId,
        @Nullable Map<String,WebServiceParameterResponse> parameters) {
        this.assetId = assetId;
        this.inputId = inputId;
        this.outputId = outputId;
        this.parameters = parameters;
    }

    private GraphNodeResponse() {
        this.assetId = null;
        this.inputId = null;
        this.outputId = null;
        this.parameters = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetId;
        private @Nullable String inputId;
        private @Nullable String outputId;
        private @Nullable Map<String,WebServiceParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.inputId = defaults.inputId;
    	      this.outputId = defaults.outputId;
    	      this.parameters = defaults.parameters;
        }

        public Builder assetId(@Nullable String assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder inputId(@Nullable String inputId) {
            this.inputId = inputId;
            return this;
        }

        public Builder outputId(@Nullable String outputId) {
            this.outputId = outputId;
            return this;
        }

        public Builder parameters(@Nullable Map<String,WebServiceParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public GraphNodeResponse build() {
            return new GraphNodeResponse(assetId, inputId, outputId, parameters);
        }
    }
}
