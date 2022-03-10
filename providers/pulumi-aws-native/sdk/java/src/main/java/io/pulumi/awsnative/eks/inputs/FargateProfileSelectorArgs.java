// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.awsnative.eks.inputs.FargateProfileLabelArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FargateProfileSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FargateProfileSelectorArgs Empty = new FargateProfileSelectorArgs();

    @InputImport(name="labels")
      private final @Nullable Input<List<FargateProfileLabelArgs>> labels;

    public Input<List<FargateProfileLabelArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="namespace", required=true)
      private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    public FargateProfileSelectorArgs(
        @Nullable Input<List<FargateProfileLabelArgs>> labels,
        Input<String> namespace) {
        this.labels = labels;
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private FargateProfileSelectorArgs() {
        this.labels = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FargateProfileSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FargateProfileLabelArgs>> labels;
        private Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(FargateProfileSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.namespace = defaults.namespace;
        }

        public Builder labels(@Nullable Input<List<FargateProfileLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable List<FargateProfileLabelArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder namespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }
        public FargateProfileSelectorArgs build() {
            return new FargateProfileSelectorArgs(labels, namespace);
        }
    }
}
