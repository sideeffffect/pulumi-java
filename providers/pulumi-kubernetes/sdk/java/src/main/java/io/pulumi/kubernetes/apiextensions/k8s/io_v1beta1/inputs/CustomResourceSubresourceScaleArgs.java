// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
 * 
 */
public final class CustomResourceSubresourceScaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourceScaleArgs Empty = new CustomResourceSubresourceScaleArgs();

    /**
     * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
     */
    @InputImport(name="labelSelectorPath")
      private final @Nullable Input<String> labelSelectorPath;

    public Input<String> getLabelSelectorPath() {
        return this.labelSelectorPath == null ? Input.empty() : this.labelSelectorPath;
    }

    /**
     * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
     */
    @InputImport(name="specReplicasPath", required=true)
      private final Input<String> specReplicasPath;

    public Input<String> getSpecReplicasPath() {
        return this.specReplicasPath;
    }

    /**
     * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
     */
    @InputImport(name="statusReplicasPath", required=true)
      private final Input<String> statusReplicasPath;

    public Input<String> getStatusReplicasPath() {
        return this.statusReplicasPath;
    }

    public CustomResourceSubresourceScaleArgs(
        @Nullable Input<String> labelSelectorPath,
        Input<String> specReplicasPath,
        Input<String> statusReplicasPath) {
        this.labelSelectorPath = labelSelectorPath;
        this.specReplicasPath = Objects.requireNonNull(specReplicasPath, "expected parameter 'specReplicasPath' to be non-null");
        this.statusReplicasPath = Objects.requireNonNull(statusReplicasPath, "expected parameter 'statusReplicasPath' to be non-null");
    }

    private CustomResourceSubresourceScaleArgs() {
        this.labelSelectorPath = Input.empty();
        this.specReplicasPath = Input.empty();
        this.statusReplicasPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourceScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> labelSelectorPath;
        private Input<String> specReplicasPath;
        private Input<String> statusReplicasPath;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceSubresourceScaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelectorPath = defaults.labelSelectorPath;
    	      this.specReplicasPath = defaults.specReplicasPath;
    	      this.statusReplicasPath = defaults.statusReplicasPath;
        }

        public Builder labelSelectorPath(@Nullable Input<String> labelSelectorPath) {
            this.labelSelectorPath = labelSelectorPath;
            return this;
        }

        public Builder labelSelectorPath(@Nullable String labelSelectorPath) {
            this.labelSelectorPath = Input.ofNullable(labelSelectorPath);
            return this;
        }

        public Builder specReplicasPath(Input<String> specReplicasPath) {
            this.specReplicasPath = Objects.requireNonNull(specReplicasPath);
            return this;
        }

        public Builder specReplicasPath(String specReplicasPath) {
            this.specReplicasPath = Input.of(Objects.requireNonNull(specReplicasPath));
            return this;
        }

        public Builder statusReplicasPath(Input<String> statusReplicasPath) {
            this.statusReplicasPath = Objects.requireNonNull(statusReplicasPath);
            return this;
        }

        public Builder statusReplicasPath(String statusReplicasPath) {
            this.statusReplicasPath = Input.of(Objects.requireNonNull(statusReplicasPath));
            return this;
        }
        public CustomResourceSubresourceScaleArgs build() {
            return new CustomResourceSubresourceScaleArgs(labelSelectorPath, specReplicasPath, statusReplicasPath);
        }
    }
}
