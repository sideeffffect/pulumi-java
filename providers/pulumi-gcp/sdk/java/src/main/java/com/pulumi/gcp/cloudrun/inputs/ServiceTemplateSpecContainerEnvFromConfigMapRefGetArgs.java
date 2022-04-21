// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs Empty = new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="localObjectReference")
    private @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference;

    public Optional<Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs>> localObjectReference() {
        return Optional.ofNullable(this.localObjectReference);
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    private ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs() {}

    private ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs $) {
        this.localObjectReference = $.localObjectReference;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs();
        }

        public Builder(ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs defaults) {
            $ = new ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder localObjectReference(@Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs> localObjectReference) {
            $.localObjectReference = localObjectReference;
            return this;
        }

        public Builder localObjectReference(ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceGetArgs localObjectReference) {
            return localObjectReference(Output.of(localObjectReference));
        }

        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        public ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs build() {
            return $;
        }
    }

}
