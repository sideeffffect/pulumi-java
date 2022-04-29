// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromSecretRefArgs extends ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromSecretRefArgs Empty = new ServiceTemplateSpecContainerEnvFromSecretRefArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="localObjectReference")
    private @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference;

    /**
     * @return The Secret to select from.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs>> localObjectReference() {
        return Optional.ofNullable(this.localObjectReference);
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return Specify whether the Secret must be defined
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    private ServiceTemplateSpecContainerEnvFromSecretRefArgs() {}

    private ServiceTemplateSpecContainerEnvFromSecretRefArgs(ServiceTemplateSpecContainerEnvFromSecretRefArgs $) {
        this.localObjectReference = $.localObjectReference;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecContainerEnvFromSecretRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecContainerEnvFromSecretRefArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecContainerEnvFromSecretRefArgs();
        }

        public Builder(ServiceTemplateSpecContainerEnvFromSecretRefArgs defaults) {
            $ = new ServiceTemplateSpecContainerEnvFromSecretRefArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localObjectReference The Secret to select from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localObjectReference(@Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference) {
            $.localObjectReference = localObjectReference;
            return this;
        }

        /**
         * @param localObjectReference The Secret to select from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localObjectReference(ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs localObjectReference) {
            return localObjectReference(Output.of(localObjectReference));
        }

        /**
         * @param optional Specify whether the Secret must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional Specify whether the Secret must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        public ServiceTemplateSpecContainerEnvFromSecretRefArgs build() {
            return $;
        }
    }

}
