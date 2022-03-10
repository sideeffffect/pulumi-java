// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.videoanalyzer.enums.Kind;
import io.pulumi.azurenative.videoanalyzer.inputs.EncoderProcessorArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.ParameterDeclarationArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.RtspSourceArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.SkuArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoSinkArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineTopologyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineTopologyArgs Empty = new PipelineTopologyArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * An optional description of the pipeline topology. It is recommended that the expected use of the topology to be described here.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Topology kind.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,Kind>> kind;

    public Input<Either<String,Kind>> getKind() {
        return this.kind;
    }

    /**
     * List of the topology parameter declarations. Parameters declared here can be referenced throughout the topology nodes through the use of "${PARAMETER_NAME}" string pattern. Parameters can have optional default values and can later be defined in individual instances of the pipeline.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<ParameterDeclarationArgs>> parameters;

    public Input<List<ParameterDeclarationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Pipeline topology unique identifier.
     * 
     */
    @InputImport(name="pipelineTopologyName")
      private final @Nullable Input<String> pipelineTopologyName;

    public Input<String> getPipelineTopologyName() {
        return this.pipelineTopologyName == null ? Input.empty() : this.pipelineTopologyName;
    }

    /**
     * List of the topology processor nodes. Processor nodes enable pipeline data to be analyzed, processed or transformed.
     * 
     */
    @InputImport(name="processors")
      private final @Nullable Input<List<EncoderProcessorArgs>> processors;

    public Input<List<EncoderProcessorArgs>> getProcessors() {
        return this.processors == null ? Input.empty() : this.processors;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * List of the topology sink nodes. Sink nodes allow pipeline data to be stored or exported.
     * 
     */
    @InputImport(name="sinks", required=true)
      private final Input<List<VideoSinkArgs>> sinks;

    public Input<List<VideoSinkArgs>> getSinks() {
        return this.sinks;
    }

    /**
     * Describes the properties of a SKU.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * List of the topology source nodes. Source nodes enable external data to be ingested by the pipeline.
     * 
     */
    @InputImport(name="sources", required=true)
      private final Input<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources;

    public Input<List<Either<RtspSourceArgs,VideoSourceArgs>>> getSources() {
        return this.sources;
    }

    public PipelineTopologyArgs(
        Input<String> accountName,
        @Nullable Input<String> description,
        Input<Either<String,Kind>> kind,
        @Nullable Input<List<ParameterDeclarationArgs>> parameters,
        @Nullable Input<String> pipelineTopologyName,
        @Nullable Input<List<EncoderProcessorArgs>> processors,
        Input<String> resourceGroupName,
        Input<List<VideoSinkArgs>> sinks,
        Input<SkuArgs> sku,
        Input<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.parameters = parameters;
        this.pipelineTopologyName = pipelineTopologyName;
        this.processors = processors;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sinks = Objects.requireNonNull(sinks, "expected parameter 'sinks' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private PipelineTopologyArgs() {
        this.accountName = Input.empty();
        this.description = Input.empty();
        this.kind = Input.empty();
        this.parameters = Input.empty();
        this.pipelineTopologyName = Input.empty();
        this.processors = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sinks = Input.empty();
        this.sku = Input.empty();
        this.sources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> description;
        private Input<Either<String,Kind>> kind;
        private @Nullable Input<List<ParameterDeclarationArgs>> parameters;
        private @Nullable Input<String> pipelineTopologyName;
        private @Nullable Input<List<EncoderProcessorArgs>> processors;
        private Input<String> resourceGroupName;
        private Input<List<VideoSinkArgs>> sinks;
        private Input<SkuArgs> sku;
        private Input<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTopologyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.parameters = defaults.parameters;
    	      this.pipelineTopologyName = defaults.pipelineTopologyName;
    	      this.processors = defaults.processors;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sinks = defaults.sinks;
    	      this.sku = defaults.sku;
    	      this.sources = defaults.sources;
        }

        public Builder accountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder kind(Input<Either<String,Kind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(Either<String,Kind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder parameters(@Nullable Input<List<ParameterDeclarationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ParameterDeclarationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder pipelineTopologyName(@Nullable Input<String> pipelineTopologyName) {
            this.pipelineTopologyName = pipelineTopologyName;
            return this;
        }

        public Builder pipelineTopologyName(@Nullable String pipelineTopologyName) {
            this.pipelineTopologyName = Input.ofNullable(pipelineTopologyName);
            return this;
        }

        public Builder processors(@Nullable Input<List<EncoderProcessorArgs>> processors) {
            this.processors = processors;
            return this;
        }

        public Builder processors(@Nullable List<EncoderProcessorArgs> processors) {
            this.processors = Input.ofNullable(processors);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sinks(Input<List<VideoSinkArgs>> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }

        public Builder sinks(List<VideoSinkArgs> sinks) {
            this.sinks = Input.of(Objects.requireNonNull(sinks));
            return this;
        }

        public Builder sku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder sources(Input<List<Either<RtspSourceArgs,VideoSourceArgs>>> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder sources(List<Either<RtspSourceArgs,VideoSourceArgs>> sources) {
            this.sources = Input.of(Objects.requireNonNull(sources));
            return this;
        }
        public PipelineTopologyArgs build() {
            return new PipelineTopologyArgs(accountName, description, kind, parameters, pipelineTopologyName, processors, resourceGroupName, sinks, sku, sources);
        }
    }
}
