// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for the Cosmos DB database backing the service.
 * 
 */
public final class ServiceCosmosDbConfigurationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceCosmosDbConfigurationInfoResponse Empty = new ServiceCosmosDbConfigurationInfoResponse();

    /**
     * The URI of the customer-managed key for the backing database.
     * 
     */
    @Import(name="keyVaultKeyUri")
    private @Nullable String keyVaultKeyUri;

    public Optional<String> keyVaultKeyUri() {
        return Optional.ofNullable(this.keyVaultKeyUri);
    }

    /**
     * The provisioned throughput for the backing database.
     * 
     */
    @Import(name="offerThroughput")
    private @Nullable Double offerThroughput;

    public Optional<Double> offerThroughput() {
        return Optional.ofNullable(this.offerThroughput);
    }

    private ServiceCosmosDbConfigurationInfoResponse() {}

    private ServiceCosmosDbConfigurationInfoResponse(ServiceCosmosDbConfigurationInfoResponse $) {
        this.keyVaultKeyUri = $.keyVaultKeyUri;
        this.offerThroughput = $.offerThroughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCosmosDbConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCosmosDbConfigurationInfoResponse $;

        public Builder() {
            $ = new ServiceCosmosDbConfigurationInfoResponse();
        }

        public Builder(ServiceCosmosDbConfigurationInfoResponse defaults) {
            $ = new ServiceCosmosDbConfigurationInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder keyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            $.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }

        public Builder offerThroughput(@Nullable Double offerThroughput) {
            $.offerThroughput = offerThroughput;
            return this;
        }

        public ServiceCosmosDbConfigurationInfoResponse build() {
            return $;
        }
    }

}
