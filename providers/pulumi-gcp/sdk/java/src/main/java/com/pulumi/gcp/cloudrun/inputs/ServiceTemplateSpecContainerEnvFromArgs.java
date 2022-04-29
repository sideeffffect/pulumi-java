// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromArgs extends ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromArgs Empty = new ServiceTemplateSpecContainerEnvFromArgs();

    /**
     * The ConfigMap to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="configMapRef")
    private @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> configMapRef;

    /**
     * @return The ConfigMap to select from.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs>> configMapRef() {
        return Optional.ofNullable(this.configMapRef);
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An optional identifier to prepend to each key in the ConfigMap.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefArgs> secretRef;

    /**
     * @return The Secret to select from.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServiceTemplateSpecContainerEnvFromSecretRefArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    private ServiceTemplateSpecContainerEnvFromArgs() {}

    private ServiceTemplateSpecContainerEnvFromArgs(ServiceTemplateSpecContainerEnvFromArgs $) {
        this.configMapRef = $.configMapRef;
        this.prefix = $.prefix;
        this.secretRef = $.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecContainerEnvFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecContainerEnvFromArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecContainerEnvFromArgs();
        }

        public Builder(ServiceTemplateSpecContainerEnvFromArgs defaults) {
            $ = new ServiceTemplateSpecContainerEnvFromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMapRef The ConfigMap to select from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(@Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> configMapRef) {
            $.configMapRef = configMapRef;
            return this;
        }

        /**
         * @param configMapRef The ConfigMap to select from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(ServiceTemplateSpecContainerEnvFromConfigMapRefArgs configMapRef) {
            return configMapRef(Output.of(configMapRef));
        }

        /**
         * @param prefix An optional identifier to prepend to each key in the ConfigMap.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An optional identifier to prepend to each key in the ConfigMap.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param secretRef The Secret to select from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef The Secret to select from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(ServiceTemplateSpecContainerEnvFromSecretRefArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        public ServiceTemplateSpecContainerEnvFromArgs build() {
            return $;
        }
    }

}
