// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.NonResourceAttributesArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.ResourceAttributesArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public final class SelfSubjectAccessReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelfSubjectAccessReviewSpecArgs Empty = new SelfSubjectAccessReviewSpecArgs();

    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    @InputImport(name="nonResourceAttributes")
      private final @Nullable Input<NonResourceAttributesArgs> nonResourceAttributes;

    public Input<NonResourceAttributesArgs> getNonResourceAttributes() {
        return this.nonResourceAttributes == null ? Input.empty() : this.nonResourceAttributes;
    }

    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    @InputImport(name="resourceAttributes")
      private final @Nullable Input<ResourceAttributesArgs> resourceAttributes;

    public Input<ResourceAttributesArgs> getResourceAttributes() {
        return this.resourceAttributes == null ? Input.empty() : this.resourceAttributes;
    }

    public SelfSubjectAccessReviewSpecArgs(
        @Nullable Input<NonResourceAttributesArgs> nonResourceAttributes,
        @Nullable Input<ResourceAttributesArgs> resourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
    }

    private SelfSubjectAccessReviewSpecArgs() {
        this.nonResourceAttributes = Input.empty();
        this.resourceAttributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectAccessReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NonResourceAttributesArgs> nonResourceAttributes;
        private @Nullable Input<ResourceAttributesArgs> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectAccessReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder nonResourceAttributes(@Nullable Input<NonResourceAttributesArgs> nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        public Builder nonResourceAttributes(@Nullable NonResourceAttributesArgs nonResourceAttributes) {
            this.nonResourceAttributes = Input.ofNullable(nonResourceAttributes);
            return this;
        }

        public Builder resourceAttributes(@Nullable Input<ResourceAttributesArgs> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder resourceAttributes(@Nullable ResourceAttributesArgs resourceAttributes) {
            this.resourceAttributes = Input.ofNullable(resourceAttributes);
            return this;
        }
        public SelfSubjectAccessReviewSpecArgs build() {
            return new SelfSubjectAccessReviewSpecArgs(nonResourceAttributes, resourceAttributes);
        }
    }
}
