// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A data flow transformation.
 * 
 */
public final class TransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransformationArgs Empty = new TransformationArgs();

    /**
     * Dataset reference.
     * 
     */
    @InputImport(name="dataset")
      private final @Nullable Input<DatasetReferenceArgs> dataset;

    public Input<DatasetReferenceArgs> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    /**
     * Transformation description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Flowlet Reference
     * 
     */
    @InputImport(name="flowlet")
      private final @Nullable Input<DataFlowReferenceArgs> flowlet;

    public Input<DataFlowReferenceArgs> getFlowlet() {
        return this.flowlet == null ? Input.empty() : this.flowlet;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedService")
      private final @Nullable Input<LinkedServiceReferenceArgs> linkedService;

    public Input<LinkedServiceReferenceArgs> getLinkedService() {
        return this.linkedService == null ? Input.empty() : this.linkedService;
    }

    /**
     * Transformation name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public TransformationArgs(
        @Nullable Input<DatasetReferenceArgs> dataset,
        @Nullable Input<String> description,
        @Nullable Input<DataFlowReferenceArgs> flowlet,
        @Nullable Input<LinkedServiceReferenceArgs> linkedService,
        Input<String> name) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TransformationArgs() {
        this.dataset = Input.empty();
        this.description = Input.empty();
        this.flowlet = Input.empty();
        this.linkedService = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetReferenceArgs> dataset;
        private @Nullable Input<String> description;
        private @Nullable Input<DataFlowReferenceArgs> flowlet;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedService;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.description = defaults.description;
    	      this.flowlet = defaults.flowlet;
    	      this.linkedService = defaults.linkedService;
    	      this.name = defaults.name;
        }

        public Builder dataset(@Nullable Input<DatasetReferenceArgs> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder dataset(@Nullable DatasetReferenceArgs dataset) {
            this.dataset = Input.ofNullable(dataset);
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

        public Builder flowlet(@Nullable Input<DataFlowReferenceArgs> flowlet) {
            this.flowlet = flowlet;
            return this;
        }

        public Builder flowlet(@Nullable DataFlowReferenceArgs flowlet) {
            this.flowlet = Input.ofNullable(flowlet);
            return this;
        }

        public Builder linkedService(@Nullable Input<LinkedServiceReferenceArgs> linkedService) {
            this.linkedService = linkedService;
            return this;
        }

        public Builder linkedService(@Nullable LinkedServiceReferenceArgs linkedService) {
            this.linkedService = Input.ofNullable(linkedService);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public TransformationArgs build() {
            return new TransformationArgs(dataset, description, flowlet, linkedService, name);
        }
    }
}
