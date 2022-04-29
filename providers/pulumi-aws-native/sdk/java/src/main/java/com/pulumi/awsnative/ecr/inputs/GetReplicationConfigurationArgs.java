// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationConfigurationArgs extends InvokeArgs {

    public static final GetReplicationConfigurationArgs Empty = new GetReplicationConfigurationArgs();

    /**
     * The RegistryId associated with the aws account.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The RegistryId associated with the aws account.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    private GetReplicationConfigurationArgs() {}

    private GetReplicationConfigurationArgs(GetReplicationConfigurationArgs $) {
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationConfigurationArgs $;

        public Builder() {
            $ = new GetReplicationConfigurationArgs();
        }

        public Builder(GetReplicationConfigurationArgs defaults) {
            $ = new GetReplicationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryId The RegistryId associated with the aws account.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        public GetReplicationConfigurationArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
