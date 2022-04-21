// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.CloudServiceVaultSecretGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the OS profile for the cloud service.
 * 
 */
public final class CloudServiceOsProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServiceOsProfileArgs Empty = new CloudServiceOsProfileArgs();

    /**
     * Specifies set of certificates that should be installed onto the role instances.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<CloudServiceVaultSecretGroupArgs>> secrets;

    public Optional<Output<List<CloudServiceVaultSecretGroupArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    private CloudServiceOsProfileArgs() {}

    private CloudServiceOsProfileArgs(CloudServiceOsProfileArgs $) {
        this.secrets = $.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceOsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceOsProfileArgs $;

        public Builder() {
            $ = new CloudServiceOsProfileArgs();
        }

        public Builder(CloudServiceOsProfileArgs defaults) {
            $ = new CloudServiceOsProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder secrets(@Nullable Output<List<CloudServiceVaultSecretGroupArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        public Builder secrets(List<CloudServiceVaultSecretGroupArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        public Builder secrets(CloudServiceVaultSecretGroupArgs... secrets) {
            return secrets(List.of(secrets));
        }

        public CloudServiceOsProfileArgs build() {
            return $;
        }
    }

}
